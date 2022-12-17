package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import java.awt.*;

public class PanelPlayerVolumen extends JPanel {


    private javax.swing.JSlider jSliderVolumenBar = new javax.swing.JSlider();

    public PanelPlayerVolumen() {
        initComponents();
    }

    private void initComponents() {

//        Config this panel

        setBackground(new Color(18, 18, 18));

        javax.swing.GroupLayout panelPlayerVolumenLayout = new javax.swing.GroupLayout(this);
        setLayout(panelPlayerVolumenLayout);
        panelPlayerVolumenLayout.setHorizontalGroup(
                panelPlayerVolumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerVolumenLayout.createSequentialGroup()
                                .addContainerGap(111, Short.MAX_VALUE)
                                .addComponent(jSliderVolumenBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                        )
        );
        panelPlayerVolumenLayout.setVerticalGroup(
                panelPlayerVolumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerVolumenLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSliderVolumenBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
        );

    }
}
