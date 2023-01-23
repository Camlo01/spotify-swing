package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

public class PanelMusicInfo extends javax.swing.JPanel {


    public PanelMusicInfo(JPanel cover, JLabel title, JLabel artist) {
        initComponents(cover, title, artist);
    }


    private void initComponents(JPanel panelCover, JLabel labelTitle, JLabel labelArtist) {

//        Configuration title configuration

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelTitle.setText("Title song");
        labelTitle.setForeground(new Color(231, 231, 231));

        labelArtist.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                labelArtist.setForeground(new Color(231, 231, 231));
            }
        });
        labelArtist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                labelArtist.setForeground(new Color(154, 154, 154));
            }
        });

//        Configuration artist configuration

        labelArtist.setText("artist");
        labelArtist.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelArtist.setForeground(new Color(154, 154, 154));
        labelArtist.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Font font = labelArtist.getFont();
                Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                labelArtist.setFont(font.deriveFont(attributes));
            }
        });
        labelArtist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                Font font = labelArtist.getFont();
                Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
                attributes.put(TextAttribute.UNDERLINE, -1);
                labelArtist.setFont(font.deriveFont(attributes));
            }
        });

//        Configuration

        panelCover.setBackground(new java.awt.Color(0, 255, 24));
//        panelCover.setPreferredSize(new java.awt.Dimension(12, 12));

        javax.swing.GroupLayout panelPlayerCoverSongLayout = new javax.swing.GroupLayout(panelCover);
        panelCover.setLayout(panelPlayerCoverSongLayout);
        panelPlayerCoverSongLayout.setHorizontalGroup(
                panelPlayerCoverSongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 60, Short.MAX_VALUE)
        );
        panelPlayerCoverSongLayout.setVerticalGroup(
                panelPlayerCoverSongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 57, Short.MAX_VALUE)
        );


//        Config this panel

        javax.swing.GroupLayout panelMusicInfoLayout = new javax.swing.GroupLayout(this);
        setLayout(panelMusicInfoLayout);
        panelMusicInfoLayout.setHorizontalGroup(
                panelMusicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMusicInfoLayout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(panelCover, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panelMusicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        panelMusicInfoLayout.setVerticalGroup(
                panelMusicInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMusicInfoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelMusicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelCover, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addGroup(panelMusicInfoLayout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(labelTitle)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelArtist))).addGap(13, 13, 13)
                                .addContainerGap())
        );
    }


}
