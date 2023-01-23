package com.musica.musicar.view.GUI.jPanelBody.central.panels;

import javax.swing.*;
import java.awt.*;

public class PanelLibrary extends javax.swing.JPanel {


    private JLabel labelPlayListTitle = new JLabel();

    public PanelLibrary() {
        initComponents();
    }

    private void initComponents() {
        labelPlayListTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelPlayListTitle.setText("Playlists");
        labelPlayListTitle.setForeground(Color.white);
        setBackground(new Color(34, 34, 34));

//        Config this panel

        javax.swing.GroupLayout jPanelLibraryLayout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanelLibraryLayout);
        jPanelLibraryLayout.setHorizontalGroup(
                jPanelLibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLibraryLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelPlayListTitle)
                                .addContainerGap(527, Short.MAX_VALUE))
        );
        jPanelLibraryLayout.setVerticalGroup(
                jPanelLibraryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLibraryLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelPlayListTitle)
                                .addContainerGap(478, Short.MAX_VALUE))
        );

    }
}
