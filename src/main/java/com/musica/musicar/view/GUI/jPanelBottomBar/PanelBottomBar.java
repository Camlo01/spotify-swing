package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import java.awt.*;

public class PanelBottomBar extends javax.swing.JPanel {

    private javax.swing.JPanel panelPlayerCoverSong = new javax.swing.JPanel();
    private javax.swing.JLabel labelPlayerArtistSong = new javax.swing.JLabel();
    private javax.swing.JLabel labelPlayerTitleSong = new javax.swing.JLabel();


    //    Panels of music info
    private PanelMusicInfo panelMusicInfo;

    //    Panel of player options
    private PanelPlayerOptions panelPlayerOptions;

    //    Panel of Player Volume
    private PanelPlayerVolumen panelPlayerVolumen;
    public Color parentContainerColor = new java.awt.Color(24, 24, 24);

    public PanelBottomBar() {
        initComponents();
    }

    private void initComponents() {

        panelMusicInfo = new PanelMusicInfo(panelPlayerCoverSong, labelPlayerTitleSong, labelPlayerArtistSong);
        panelPlayerOptions = new PanelPlayerOptions(panelPlayerCoverSong, labelPlayerTitleSong, labelPlayerArtistSong);
        panelPlayerVolumen = new PanelPlayerVolumen();

        panelMusicInfo.setBackground(parentContainerColor);
        panelPlayerOptions.setBackground(parentContainerColor);
        panelPlayerVolumen.setBackground(parentContainerColor);


//        Configuration of this panel
        setBackground(parentContainerColor);

        javax.swing.GroupLayout panelBottomBarLayout = new javax.swing.GroupLayout(this);
        setLayout(panelBottomBarLayout);
        panelBottomBarLayout.setHorizontalGroup(
                panelBottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBottomBarLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(panelMusicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                        .addComponent(panelPlayerOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                        .addComponent(panelPlayerVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap()
                                        .addGap(25, 25, 25)
                        )
        );
        panelBottomBarLayout.setVerticalGroup(
                panelBottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPlayerOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPlayerVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMusicInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

    }

}
