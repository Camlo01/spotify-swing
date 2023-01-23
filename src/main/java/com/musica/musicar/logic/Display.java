package com.musica.musicar.logic;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import com.musica.musicar.view.GUI.jPanelBottomBar.PanelMusicInfo;

import javax.imageio.ImageIO;
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
     * of the metadata of an mp3 file in the PanelMusicInfo panel
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

}
