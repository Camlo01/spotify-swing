package com.musica.musicar.view.GUI.jPanelBody.central.panels;

import javax.swing.*;
import java.awt.*;

public class PanelSearch extends javax.swing.JPanel {


    //    //   TAB 2
    private JLabel labelSearchTitle = new JLabel();

    public PanelSearch() {
        initComponents();
    }

    private void initComponents() {
//        config items

        setBackground(new java.awt.Color(204, 204, 204));
        labelSearchTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelSearchTitle.setText("Busqueda");
        labelSearchTitle.setForeground(Color.white);

        setBackground(new Color(34, 34, 34));

//        Config this panel
        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(this);
        this.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
                jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSearchLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelSearchTitle)
                                .addContainerGap(477, Short.MAX_VALUE))
        );
        jPanelSearchLayout.setVerticalGroup(
                jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelSearchLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelSearchTitle)
                                .addContainerGap(478, Short.MAX_VALUE))
        );
    }


}
