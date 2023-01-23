package com.musica.musicar.view.GUI.jPanelBody.central.panels;

import javax.swing.*;
import java.awt.*;

public class PanelPlaylistMold extends javax.swing.JPanel {

    private JLabel labelPlayListTitle;

    public PanelPlaylistMold() {
        initComponents();
    }

    private void initComponents() {
        labelPlayListTitle = new JLabel();


        labelPlayListTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelPlayListTitle.setForeground(Color.white);


        setBackground(new Color(34, 34, 34));

        javax.swing.GroupLayout jPanelPlaylistLayout = new javax.swing.GroupLayout(this);
        setLayout(jPanelPlaylistLayout);
        jPanelPlaylistLayout.setHorizontalGroup(
                jPanelPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPlaylistLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelPlayListTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanelPlaylistLayout.setVerticalGroup(
                jPanelPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPlaylistLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelPlayListTitle)
                                .addContainerGap(657, Short.MAX_VALUE))
        );

    }

    public void setTitle(String title) {
        this.labelPlayListTitle.setText(title);
    }
}
