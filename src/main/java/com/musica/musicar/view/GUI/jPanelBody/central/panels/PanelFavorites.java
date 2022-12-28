package com.musica.musicar.view.GUI.jPanelBody.central.panels;

import javax.swing.*;
import java.awt.*;

public class PanelFavorites extends javax.swing.JPanel {


    //    //   TAB 4
    private JLabel labelFavoritesTitle = new JLabel();

    public PanelFavorites() {
        initComponents();
    }

    private void initComponents() {

        labelFavoritesTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelFavoritesTitle.setText("Tus me gusta");
        labelFavoritesTitle.setForeground( Color.white);
        setBackground(new Color(34, 34, 34));

//        Config this panel

        javax.swing.GroupLayout jPanelFavoritesLayout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanelFavoritesLayout);
        jPanelFavoritesLayout.setHorizontalGroup(
                jPanelFavoritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelFavoritesLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelFavoritesTitle)
                                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanelFavoritesLayout.setVerticalGroup(
                jPanelFavoritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelFavoritesLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelFavoritesTitle)
                                .addContainerGap(478, Short.MAX_VALUE))
        );

    }


//    private void initComponents(){
//
//    }
}
