package com.musica.musicar.logic;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import com.musica.musicar.view.GUI.jPanelBottomBar.PanelMusicInfo;
import javazoom.spi.mpeg.sampled.file.MpegAudioFileReader;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/**
 * class in charge of displaying the information of the song on the screen
 */
public class Display {

    public Display() {
    }

    /**
     * Method in charge of displaying on the screen the main information
     * of the metadata of a mp3 file in the PanelMusicInfo panel
     *
     * @param song        File object containing an mp3 file
     * @param panelCover  panel where the cover of the song is configured
     * @param labelTitle  label where to set the song title
     * @param labelArtist label where to set the song artist
     * @see PanelMusicInfo
     */
    public void displayInformation(File song, JPanel panelCover, JLabel labelTitle, JLabel labelArtist) {
        try {

            //An Mp3File object is instantiated that allows obtaining the metadata of an mp3 file
            Mp3File mp3 = new Mp3File(song);

            //Metadata is obtained
            String title = mp3.getId3v2Tag().getTitle();
            String artist = mp3.getId3v2Tag().getArtist();
            byte[] imageData = mp3.getId3v2Tag().getAlbumImage();

            //convert the byte array to an image
            BufferedImage cover = ImageIO.read(new ByteArrayInputStream(imageData));

//            Each of the corresponding values of PanelMusicInfo are configured
            labelTitle.setText(title);
            labelArtist.setText(artist);

            //The component is emptied if it has an image
            panelCover.removeAll();

            //the song image is treated and set in the cover panel
            panelCover.setOpaque(false);
            panelCover.setLayout(new BorderLayout());
            ImageIcon img = new ImageIcon(cover);
            img.setImage(img.getImage().getScaledInstance(panelCover.getWidth(), panelCover.getHeight(), Image.SCALE_REPLICATE));
            panelCover.add(new JLabel(img), BorderLayout.CENTER);

        } catch (IOException | UnsupportedTagException | InvalidDataException e) {
            e.printStackTrace();
        }

    }

    /**
     * Method in charge of showing the complete duration of the song expressed in minutes on the screen
     *
     * @param song                 file from which to extract the information
     * @param labelCurrentDuration label of the current duration of the song
     * @param labelTotalDuration   label of the total duration of the song expressed in minutes
     */
    public void displayTime(File song, JLabel labelCurrentDuration, JLabel labelTotalDuration) {
        //obtain duration of
        String totalDuration = getDurationFile(song);
        labelTotalDuration.setText(totalDuration);
    }

    //--- UTIL METHODS

    /**
     * Method that returns a String of the duration of a mp3 file
     *
     * @param song to get duration
     * @return String of duration in minutes (3:50 example)
     */
    private String getDurationFile(File song) {
        AudioFileFormat fileFormat = null;
        try {
            fileFormat = new MpegAudioFileReader().getAudioFileFormat(song);
            AudioFormat format = fileFormat.getFormat();
            long frames = fileFormat.getFrameLength();
            double durationInSeconds = (frames + 0.0) / format.getFrameRate();
            int minutes = (int) (durationInSeconds / 60);
            int seconds = (int) (durationInSeconds % 60);

            return minutes + ":" + seconds;

        } catch (UnsupportedAudioFileException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
