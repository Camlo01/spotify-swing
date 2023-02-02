package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import java.awt.*;

public class PanelBottomBar extends javax.swing.JPanel {

    private final javax.swing.JPanel panelPlayerCoverSong = new javax.swing.JPanel();
    private final javax.swing.JLabel labelPlayerArtistSong = new javax.swing.JLabel();
    private final javax.swing.JLabel labelPlayerTitleSong = new javax.swing.JLabel();


    //    Panels of music info
    private PanelMusicInfo panelMusicInfo;

    //    Panel of player options
    private PanelPlayerOptions panelPlayerOptions;

    //    Panel of Player Volume
    private PanelPlayerVolume panelPlayerVolume;
    public Color parentContainerColor = new java.awt.Color(24, 24, 24);

    public PanelBottomBar() {
        initComponents();
    }

    private void initComponents() {

        panelMusicInfo = new PanelMusicInfo(panelPlayerCoverSong, labelPlayerTitleSong, labelPlayerArtistSong);
        panelPlayerOptions = new PanelPlayerOptions(panelPlayerCoverSong, labelPlayerTitleSong, labelPlayerArtistSong);
        panelPlayerVolume = new PanelPlayerVolume();

        panelMusicInfo.setBackground(parentContainerColor);
        panelPlayerOptions.setBackground(parentContainerColor);
        panelPlayerVolume.setBackground(parentContainerColor);


//        Configuration of this panel
        setBackground(parentContainerColor);

        javax.swing.GroupLayout panelBottomBarLayout = new javax.swing.GroupLayout(this);
        setLayout(panelBottomBarLayout);
        panelBottomBarLayout.setHorizontalGroup(
                panelBottomBarLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(panelBottomBarLayout.createSequentialGroup()
                                .addComponent(panelMusicInfo, 250, 250, Short.MAX_VALUE)
                                .addComponent(panelPlayerOptions, 300, 300, 620)
                                .addComponent(panelPlayerVolume, 230, 230, Short.MAX_VALUE)
                        )
        );
        panelBottomBarLayout.setVerticalGroup(
                panelBottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPlayerOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPlayerVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelMusicInfo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

    }

}
