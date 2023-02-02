package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

/**
 * Class that extends JPanel that displays the information of the song being played
 */
public class PanelMusicInfo extends javax.swing.JPanel {

    private final JButton buttonLike = new JButton("<3");

    /**
     * Constructor that receives the information to display
     *
     * @param cover  to set
     * @param title  to set
     * @param artist to set
     */
    public PanelMusicInfo(JPanel cover, JLabel title, JLabel artist) {
        initComponents(cover, title, artist);
    }


    private void initComponents(JPanel panelCover, JLabel labelTitle, JLabel labelArtist) {

//        Configuration title label

        labelTitle.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelTitle.setText("Title song");
        labelTitle.setForeground(new Color(231, 231, 231));

//        Configuration artist label

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

//        Configuring button like

        buttonLike.setFont(new Font("Dialog", 0, 10));
        buttonLike.setPreferredSize(new Dimension(20, 20));
        buttonLike.setBackground(new Color(24, 24, 24));

//        Configuration of this panel

        // background color by defect
        panelCover.setBackground(new java.awt.Color(0, 255, 24));

//        Config this panel
//        setBackground(Color.red);

        javax.swing.GroupLayout panelMusicInfoLayout = new javax.swing.GroupLayout(this);
        setLayout(panelMusicInfoLayout);
        panelMusicInfoLayout.setHorizontalGroup(
                panelMusicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMusicInfoLayout.createSequentialGroup()
                                .addGap(12)
                                .addComponent(panelCover, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(panelMusicInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(labelArtist, 10, 10, 100)
                                        .addComponent(labelTitle, 10, 10, 100)
                                )
                                .addComponent(buttonLike, 20, 20, 20)
                                .addGap(8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
                        )

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
                                                .addComponent(labelArtist))
                                        .addComponent(buttonLike, GroupLayout.Alignment.CENTER, 20, 20, 20)
                                )
                                .addContainerGap()
                        )
        );
    }
}