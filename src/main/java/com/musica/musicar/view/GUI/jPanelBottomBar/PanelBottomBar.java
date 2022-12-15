package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;

public class PanelBottomBar extends javax.swing.JPanel {

    //    Panels of music info
    private PanelMusicInfo jPanel2;

    //    Panel of player options
    private PanelPlayerOptions panelPlayerOptions;

    //    Panel of Player Volume
    private PanelPlayerVolumen panelPlayerVolumen;

    public PanelBottomBar() {
        initComponents();
    }

    private void initComponents() {

        jPanel2 = new PanelMusicInfo();
        panelPlayerOptions = new PanelPlayerOptions();
        panelPlayerVolumen = new PanelPlayerVolumen();

//        Buttons Labels

//        Configuration of this panel

        setBackground(new java.awt.Color(51, 51, 51));


//        Configuration of this panel

        javax.swing.GroupLayout panelBottomBarLayout = new javax.swing.GroupLayout(this);
        setLayout(panelBottomBarLayout);
        panelBottomBarLayout.setHorizontalGroup(
                panelBottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelBottomBarLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(panelPlayerOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(panelPlayerVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addContainerGap()
                                        .addGap(25,25,25)
                        )
        );
        panelBottomBarLayout.setVerticalGroup(
                panelBottomBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelPlayerOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPlayerVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

    }

}
