package com.musica.musicar.view.GUI;

import com.musica.musicar.view.GUI.jPanelBody.PanelBody;
import com.musica.musicar.view.GUI.jPanelBottomBar.PanelBottomBar;

public class SpotifyApp extends javax.swing.JFrame {

    public SpotifyApp() {
        this.setTitle("New Interface");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
//        Construct panels
        panelBottomBar = new PanelBottomBar();
        panelBody = new PanelBody();

//        Config this jFrame
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBottomBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1)
                                .addComponent(panelBottomBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pack();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SpotifyApp app = new SpotifyApp();
                app.setTitle("Spotify");
                app.setVisible(true);
            }
        });


    }

    private PanelBottomBar panelBottomBar;
    private PanelBody panelBody;
}
