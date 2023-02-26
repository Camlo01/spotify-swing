package com.musica.musicar.logic.reproduction;


import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import com.mpatric.mp3agic.Mp3File;

import javax.swing.*;
import java.io.*;
import java.lang.reflect.InvocationTargetException;

/**
 * Playlist class in charge of handling file playback
 */
public class HandlePlayback {

    //file playback state values
    private boolean isPlayingCurrentSong = false;
    private boolean isPaused = false;

    //values in charge of calculating the playback time to resume playback
    private volatile long startedTimePlaySong;   //exact time of file playback
    private volatile long pausedTimeSong;        //time when playback is paused

    //Player object with the song currently being produced
    private Player currentSong;
    private String nameCurrentSong = "";

    //-------------------------------------------------------
    // Here should be implemented playlist logic in a future
    //-------------------------------------------------------

    /**
     * Empty constructor
     */
    public HandlePlayback() {
    }

    /**
     * Method in charge of managing the reproduction of music and according to
     * the state of reproduction, start (play), pause it (pause) and continue
     * the reproduction where it was paused (resume).
     *
     * @param song File with the song (only mp3) that is handled
     */
    public void manageMusicPlayback(File song) {

        //It is evaluated if the received song is the same one that is playing
        if (isItaNewSong(song)) {
            DefaultSetValues();
        }

        //Checks if the current song is playing and if it doesn't, start playing
        if (!isPlayingCurrentSong) {
            isPlayingCurrentSong = true; //isPlayingCurrentSong is marked true
            System.out.println("PLAY");

            playSong(song);

            //Once the song is produced, it is evaluated if it is paused or
            //resumed according to the playback status
        } else {

            //If the song is not paused, the code block begins to execute
            if (!isPaused) {
                isPaused = true;
                System.out.println("PAUSE");
                stopSong();

            } else {
                isPaused = false;
                System.out.println("RESUME");

                //Elapsed time is calculated from the start until the song was paused
                long timeElapsed = (pausedTimeSong - startedTimePlaySong) / 1000;
                System.out.println("Última tiempo reproducción: " + timeElapsed);

                resume(song, (int) timeElapsed - 2);

            }
        }
    }

    /**
     * Method responsible for playing only mp3 files
     * - Song is playing in a new thread
     * - the moment when the song is played is captured in a new thread
     *
     * @param mp3 file played in Player object
     */
    private void playSong(File mp3) {

        //The name of the song that starts to play is saved to compare later if a new song is played
        nameCurrentSong = mp3.getName();

        new Thread() {
            @Override
            public void run() {
                try {
                    long duration = mp3.length();
                    System.out.println("Duration of song: " + duration / 100000);

                    FileInputStream stream = new FileInputStream(mp3);
                    currentSong = new Player(stream);
                    currentSong.play();

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                //capturing time at which playback starts
                startedTimePlaySong = System.currentTimeMillis();
            }
        }.start();

    }

    /**
     * time to skip when playing a song
     * (this method is in charge to position a song in
     * the second that it was before it stopped playing)
     *
     * @param song    song to fast-forward to the position where you stopped
     * @param seconds time to advance
     */
    private void skipSeconds(File song, int seconds) {
        new Thread() {
            @Override
            public void run() {
                try {
                    Mp3File mp3file = new Mp3File(song);

                    long startFrame = ((long) seconds * mp3file.getSampleRate());
                    System.out.println("START FRAME: " + startFrame);

                    InputStream is = new FileInputStream(song);
                    is.skip(startFrame);
                    currentSong = new Player(is);
                    currentSong.play();
                } catch (IOException | UnsupportedTagException | InvalidDataException | JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    /**
     * Method responsible for continuing playback at the point where the song was stopped
     *
     * @param song              file to treat
     * @param totalPlaybackTime Time in which you want to adjust
     *                          its playback before its playback
     */
    private void resume(File song, int totalPlaybackTime) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("resume the song");
                skipSeconds(song, totalPlaybackTime);
            }
        }.start();

    }

    /**
     * Method responsible for completely stopping playback
     * <p>
     * To continue its reproduction, you must adjust the time in which you want with the skipSeconds() method.
     */
    public void stopSong() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                currentSong.close();
                currentSong = null;
                System.out.println("stopped song");
            }
        });
        new Thread() {
            @Override
            public void run() {
                //capturing time at which playback stops
                pausedTimeSong = System.currentTimeMillis();
            }
        }.start();
    }

    /**
     * Method in charge of validating if the song that was received to be played is new
     * or the same one that is currently being played
     *
     * @param song received
     * @return boolean value
     */
    private boolean isItaNewSong(File song) {
        if (nameCurrentSong.equals(song.getName())) {
            System.out.println("same song");
            return false;
        } else {
            System.out.println("new song");
            return true;
        }
    }

    /**
     * playback values are reset
     * this method is used when a new song is detected to be playing
     */
    private void DefaultSetValues() {
        isPlayingCurrentSong = false;
        isPaused = false;
        if (nameCurrentSong != "") {
            currentSong.close();
        }
        nameCurrentSong = "";
    }
}