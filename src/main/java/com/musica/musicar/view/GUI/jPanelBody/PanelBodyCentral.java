package com.musica.musicar.view.GUI.jPanelBody;

import javax.swing.*;
import java.awt.*;

public class PanelBodyCentral extends javax.swing.JPanel {

    //    Panel central
    public static JTabbedPane jTabbedPanel = new JTabbedPane();


    //  Gradient configuration
    private Color darkBlack = new Color(16, 16, 16);
    private Color lightBlack = new Color(34, 34, 34);


    //   TAB 1
    private JPanel jPanelHome = new JPanel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JPanel jPanel8 = new JPanel();
    private JLabel labelHomeTitle = new JLabel();
    //   TAB 2
    private JPanel jPanelSearch = new JPanel();
    private JLabel labelSearchTitle = new JLabel();
    //   TAB 3
    private JPanel jPanelLibrary = new JPanel();
    private JLabel labelPlayListTitle = new JLabel();
    //   TAB 4
    private JPanel jPanelFavorites = new JPanel();
    private JLabel labelFavoritesTitle = new JLabel();
    //   TAB 5
    private JPanel jPanelEpisodes = new JPanel();
    private JLabel labelEpisodesTitle = new JLabel();


    public PanelBodyCentral() {
        initComponents();
    }

    private void initComponents() {


//        Configuration labels


        labelHomeTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelHomeTitle.setText("Inicio");

        labelSearchTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelSearchTitle.setText("Busqueda");

        labelPlayListTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelPlayListTitle.setText("Playlists");

        labelFavoritesTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelFavoritesTitle.setText("Tus me gusta");


        labelEpisodesTitle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelEpisodesTitle.setText("Episodios");


//        Configuration jTabbedPanel


        jTabbedPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPanel.setBackground(Color.black);

        // Config size of jPanelHome
        setBackground(Color.black);


        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
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
        jScrollPane1.setViewportView(jPanel8);

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
                jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        jPanelHomeLayout.setVerticalGroup(
                jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        jTabbedPanel.addTab("tab1", jPanelHome);


        // Config size of jPanelSearch
        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
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
        jTabbedPanel.addTab("tab2", jPanelSearch);


        // Config size of jPanelLibrary
        javax.swing.GroupLayout jPanelLibraryLayout = new javax.swing.GroupLayout(jPanelLibrary);
        jPanelLibrary.setLayout(jPanelLibraryLayout);
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
        jTabbedPanel.addTab("tab3", jPanelLibrary);

        // Config size of jPanelFavorites
        javax.swing.GroupLayout jPanelFavoritesLayout = new javax.swing.GroupLayout(jPanelFavorites);
        jPanelFavorites.setLayout(jPanelFavoritesLayout);
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
        jTabbedPanel.addTab("tab5", jPanelFavorites);


        // Config size of jPanelFavorites
        javax.swing.GroupLayout jPanelEpisodesLayout = new javax.swing.GroupLayout(jPanelEpisodes);
        jPanelEpisodes.setLayout(jPanelEpisodesLayout);
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
        jTabbedPanel.addTab("tab6", jPanelEpisodes);

        jTabbedPanel.getAccessibleContext().setAccessibleName("ini");
        jTabbedPanel.getAccessibleContext().setAccessibleDescription("");


//        Config this panel

        javax.swing.GroupLayout panelBodyCentralLayout = new javax.swing.GroupLayout(this);
        setLayout(panelBodyCentralLayout);
        panelBodyCentralLayout.setHorizontalGroup(
                panelBodyCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelBodyCentralLayout.setVerticalGroup(
                panelBodyCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPanel)
        );

    }
}
