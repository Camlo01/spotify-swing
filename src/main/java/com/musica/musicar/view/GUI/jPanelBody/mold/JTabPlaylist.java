package com.musica.musicar.view.GUI.jPanelBody.mold;

import javax.swing.*;

public class JTabPlaylist extends javax.swing.JPanel {


    public JTabPlaylist(JLabel titlePlaylist) {
        initComponents(titlePlaylist);
    }

    private void initComponents(JLabel labelPlayListTittle) {

//        Config this panel

        javax.swing.GroupLayout jPanelPlayListLayout = new javax.swing.GroupLayout(this);
        setLayout(jPanelPlayListLayout);
        jPanelPlayListLayout.setHorizontalGroup(
                jPanelPlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPlayListLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelPlayListTittle)
                                .addContainerGap(477, Short.MAX_VALUE))
        );
        jPanelPlayListLayout.setVerticalGroup(
                jPanelPlayListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPlayListLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelPlayListTittle)
                                .addContainerGap(478, Short.MAX_VALUE))
        );
    }
}
