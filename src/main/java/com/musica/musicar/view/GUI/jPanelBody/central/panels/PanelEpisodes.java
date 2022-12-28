package com.musica.musicar.view.GUI.jPanelBody.central.panels;

import javax.swing.*;
import java.awt.*;

public class PanelEpisodes extends javax.swing.JPanel {

    private JLabel labelEpisodesTitle = new JLabel();

    public PanelEpisodes() {
        initComponents();
    }

    private void initComponents() {

        labelEpisodesTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelEpisodesTitle.setText("Episodios");
        labelEpisodesTitle.setForeground( Color.white);

        setBackground(new Color(34, 34, 34));

//        Config this panel

        javax.swing.GroupLayout jPanelEpisodesLayout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanelEpisodesLayout);
        jPanelEpisodesLayout.setHorizontalGroup(
                jPanelEpisodesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEpisodesLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelEpisodesTitle)
                                .addContainerGap(483, Short.MAX_VALUE))
        );
        jPanelEpisodesLayout.setVerticalGroup(
                jPanelEpisodesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEpisodesLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelEpisodesTitle)
                                .addContainerGap(478, Short.MAX_VALUE))
        );

    }
}
