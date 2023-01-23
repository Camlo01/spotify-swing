package com.musica.musicar.view.GUI.jPanelBody.central.panels;

import javax.swing.*;
import java.awt.*;

public class PanelHome extends javax.swing.JPanel {


    //    //   TAB 1
    private final JLabel labelHomeTitle = new JLabel();
    private final JPanel panelContainer = new javax.swing.JPanel();
    private final JScrollPane jScrollPane1 = new javax.swing.JScrollPane();

    public PanelHome() {
        initComponents();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight() / 3;
        System.out.println(h / 40);
//        Color color1 = Color.red;
        Color color1 = new Color(34, 34, 34);
        Color color2 = new Color(16, 16, 16);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        g2d.dispose();
    }

    private void initComponents() {

//      Config items
        labelHomeTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelHomeTitle.setText("Inicio");
        labelHomeTitle.setForeground(Color.white);


//        Config this panel

        setBackground(new Color(16, 16, 16));


        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelHomeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelHomeTitle)
                                .addContainerGap(657, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panelContainer);


        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(this);
        setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
                jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelHomeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanelHomeLayout.setVerticalGroup(
                jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHomeLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelHomeTitle)
                                .addContainerGap(657, Short.MAX_VALUE))
        );


    }
}
