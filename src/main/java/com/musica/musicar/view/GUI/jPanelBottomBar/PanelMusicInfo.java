package com.musica.musicar.view.GUI.jPanelBottomBar;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class PanelMusicInfo extends javax.swing.JPanel {


    private javax.swing.JPanel panelPlayerCoverSong = new javax.swing.JPanel();
    private javax.swing.JLabel labelPlayerArtistSong = new javax.swing.JLabel();
    private javax.swing.JLabel labelPlayerTitleSong = new javax.swing.JLabel();

    public PanelMusicInfo() {
        initComponents();
    }


    private void initComponents() {

        labelPlayerTitleSong.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelPlayerTitleSong.setText("Title song");
        labelPlayerTitleSong.setForeground(new Color(231, 231, 231));
        labelPlayerTitleSong.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelPlayerTitleSongMouseMoved(evt);
            }
        });
        labelPlayerTitleSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPlayerTitleSongMouseExited(evt);
            }
        });

//        Configuration artist configuration

        labelPlayerArtistSong.setText("artist");
        labelPlayerArtistSong.setForeground(new Color(154, 154, 154));
        labelPlayerArtistSong.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                labelPlayerArtistSongMouseMoved(evt);
            }
        });
        labelPlayerArtistSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPlayerArtistSongMouseExited(evt);
            }
        });


        panelPlayerCoverSong.setBackground(new java.awt.Color(0, 255, 24));
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


//        Config this panel
        setBackground(new Color(18, 18, 18));

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


    //    labelPlayerArtistSong
    private void labelPlayerArtistSongMouseMoved(MouseEvent evt) {
        labelPlayerArtistSong.setForeground(new Color(231, 231, 231));
    }

    private void labelPlayerArtistSongMouseExited(MouseEvent evt) {
        labelPlayerArtistSong.setForeground(new Color(154, 154, 154));
    }

    //    labelPlayerTitleSong
    private void labelPlayerTitleSongMouseMoved(MouseEvent evt) {
        Font font = labelPlayerTitleSong.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        labelPlayerTitleSong.setFont(font.deriveFont(attributes));
    }

    private void labelPlayerTitleSongMouseExited(MouseEvent evt) {
        Font font = labelPlayerTitleSong.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, -1);
        labelPlayerTitleSong.setFont(font.deriveFont(attributes));
    }


}
