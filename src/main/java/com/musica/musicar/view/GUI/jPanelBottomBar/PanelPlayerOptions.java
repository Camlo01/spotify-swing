package com.musica.musicar.view.GUI.jPanelBottomBar;

import com.musica.musicar.logic.Display;
import com.musica.musicar.logic.reproduction.HandlePlayback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PanelPlayerOptions extends JPanel {


    private boolean isInfoDisplayed = false;
    //    private final String song = "Aventura - Volví.mp3";
//    private final String song = "50 Cent - 21 Questions.mp3";
//    private final String song = "Bad Bunny - Tití Me Preguntó.mp3";
//    private final String song = "Childish Gambino - Me and Your Mama.mp3";
//    private final String song = "The Weeknd - Is There Someone Else.mp3";
    private final String song = "Lil Nas X - THATS WHAT I WANT.mp3";
    //    private final String song = "Maluma - Cositas de la USA.mp3";
    private final String path = "C:\\Users\\Camilo\\Desktop\\music-library\\" + song;


    //useful classes
    private HandlePlayback handle = new HandlePlayback();
    private Display display = new Display();

    private javax.swing.JSlider jSliderMusicBar = new JSlider();
    private javax.swing.JButton buttonPlayerBackSong = new JButton();
    private javax.swing.JButton buttonPlayerNextSong = new JButton();
    private javax.swing.JButton buttonPlayerPlayPause = new JButton();
    private javax.swing.JButton buttonPlayerRandomMusic = new JButton();
    private javax.swing.JButton buttonPlayerRepeat = new JButton();

    public PanelPlayerOptions(JPanel cover, JLabel title, JLabel artist) {
        initComponents(cover, title, artist);
    }


    private void initComponents(JPanel cover, JLabel title, JLabel artist) {

//        jSliderMusicBar
        jSliderMusicBar.setValue(0);

//        Buttons

        buttonPlayerRandomMusic.setText("X");
        buttonPlayerBackSong.setText("<");
        buttonPlayerPlayPause.setText("W");
        buttonPlayerNextSong.setText(">");
        buttonPlayerRepeat.setText("O");

        buttonPlayerBackSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Back song button pressed!");
            }
        });

        buttonPlayerPlayPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                File song = new File(path);
                if (!isInfoDisplayed) {
                    isInfoDisplayed = true;

                    //Selecting file to use
                    try {
                        display.displayInformation(song, cover, title, artist);
                    } catch (Exception x) {
                        System.out.println(x);
                    }
                }
                System.out.println();
                handle.manageMusicPlayback(song);
                System.out.println();
            }
        });

        buttonPlayerNextSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Next Song Button pressed!");
            }
        });


//        Config of this panel


        setBackground(new Color(18, 18, 18));

        javax.swing.GroupLayout panelPlayerOptionsLayout = new javax.swing.GroupLayout(this);
        setLayout(panelPlayerOptionsLayout);
        panelPlayerOptionsLayout.setHorizontalGroup(
                panelPlayerOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPlayerOptionsLayout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addGroup(panelPlayerOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerOptionsLayout.createSequentialGroup()
                                                .addComponent(jSliderMusicBar, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerOptionsLayout.createSequentialGroup()
                                                .addComponent(buttonPlayerRandomMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonPlayerBackSong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerNextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerRepeat)
                                                .addGap(70, 70, 70))))
        );
        panelPlayerOptionsLayout.setVerticalGroup(
                panelPlayerOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerOptionsLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPlayerOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonPlayerPlayPause, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonPlayerNextSong)
                                        .addComponent(buttonPlayerBackSong)
                                        .addComponent(buttonPlayerRandomMusic)
                                        .addComponent(buttonPlayerRepeat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSliderMusicBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );

    }
}
