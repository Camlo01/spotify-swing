package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import java.awt.*;

public class PanelMusicInfo extends javax.swing.JPanel {


    private javax.swing.JPanel panelPlayerCoverSong = new javax.swing.JPanel();
    private javax.swing.JLabel labelPlayerArtistSong = new javax.swing.JLabel();
    private javax.swing.JLabel labelPlayerTitleSong = new javax.swing.JLabel();

    public PanelMusicInfo() {
        initComponents();
    }


    private void initComponents() {

//        lineas 201
        labelPlayerTitleSong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelPlayerTitleSong.setText("Title song");

//          lineas 203 - 216
        panelPlayerCoverSong.setBackground(new java.awt.Color(102, 102, 0));
        panelPlayerCoverSong.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout panelPlayerCoverSongLayout = new javax.swing.GroupLayout(panelPlayerCoverSong);
        panelPlayerCoverSong.setLayout(panelPlayerCoverSongLayout);
        panelPlayerCoverSongLayout.setHorizontalGroup(
                panelPlayerCoverSongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );
        panelPlayerCoverSongLayout.setVerticalGroup(
                panelPlayerCoverSongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 57, Short.MAX_VALUE)
        );

//        Linea 218
        labelPlayerArtistSong.setText("artist");

        setBackground(Color.CYAN);

//        Lineas 219 - 245
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(panelPlayerCoverSong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelPlayerArtistSong, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelPlayerTitleSong, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelPlayerCoverSong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(labelPlayerTitleSong)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelPlayerArtistSong)))
                                .addContainerGap())
        );
    }
}
