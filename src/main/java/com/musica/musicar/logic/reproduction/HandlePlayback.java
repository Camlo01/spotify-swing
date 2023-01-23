package com.musica.musicar.logic.reproduction;


import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.UnsupportedTagException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import com.mpatric.mp3agic.Mp3File;

import java.io.*;

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

        //TO IMPLEMENT: Validate if the same song is playing or it is a new one

        //For now: only checks if the current song is playing and if it doesn't start playing
        if (!isPlayingCurrentSong) {
            isPlayingCurrentSong = true;
            System.out.println("PLAY");

            //capturing time at which playback starts
            startedTimePlaySong = System.currentTimeMillis();
            playSong(song);

        } else {
            //Once the song is produced, it is evaluated if it is paused or resumed

            if (!isPaused) {
                isPaused = true;
                System.out.println("PAUSE");

                //capturing time at which playback stops
                pausedTimeSong = System.currentTimeMillis();

                stopSong();

            } else {
                isPaused = false;
                System.out.println("RESUME");


                //
                long totalPlayingTime = (pausedTimeSong - startedTimePlaySong) / 1000;

                System.out.println("INICIO: " + startedTimePlaySong / 1000 + " PAUSA: " + pausedTimeSong / 1000);
                System.out.println("Última reproducción: " + totalPlayingTime);

                resume(song, (int) totalPlayingTime - 1);

            }
        }
    }


    /**
     * Method responsible for playing only mp3 files
     *
     * @param mp3 file played in Player object
     */
    private void playSong(File mp3) {
        new Thread() {
            @Override
            public void run() {
                startedTimePlaySong = System.currentTimeMillis();
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
                System.out.println("Ahora se reproduce la canción");
                skipSeconds(song, totalPlaybackTime);
            }
        }.start();

    }

    /**
     * Method responsible for completely stopping playback
     * <p>
     * To continue its reproduction, you must adjust the time in which you want with the skipSeconds() method.
     */
    private void stopSong() {
        new Thread() {
            @Override
            public void run() {
                currentSong.close();
                currentSong = null;
                System.out.println("Canción detenida");
            }
        }.start();
    }

}