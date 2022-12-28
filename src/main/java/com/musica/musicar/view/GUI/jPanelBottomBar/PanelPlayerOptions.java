package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import java.awt.*;

public class PanelPlayerOptions extends JPanel {


    private javax.swing.JSlider jSliderMusicBar = new JSlider();
    private javax.swing.JButton buttonPlayerBackSong = new JButton();
    private javax.swing.JButton buttonPlayerNextSong = new JButton();
    private javax.swing.JButton buttonPlayerPlayPause = new JButton();
    private javax.swing.JButton buttonPlayerRandomMusic = new JButton();
    private javax.swing.JButton buttonPlayerRepeat = new JButton();

    public PanelPlayerOptions() {
        initComponents();
    }

    private void initComponents() {

//        jSliderMusicBar
        jSliderMusicBar.setValue(0);

//        Buttons

        buttonPlayerRandomMusic.setText("X");
        buttonPlayerBackSong.setText("<");
        buttonPlayerPlayPause.setText("W");
        buttonPlayerNextSong.setText(">");
        buttonPlayerRepeat.setText("O");



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
