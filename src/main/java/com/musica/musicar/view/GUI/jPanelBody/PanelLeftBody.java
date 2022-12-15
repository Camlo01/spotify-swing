package com.musica.musicar.view.GUI.jPanelBody;

import javax.swing.*;

public class PanelLeftBody extends javax.swing.JPanel {

    private int yWhereLoadPlayList = 0;
    private javax.swing.JSlider jSlider3 = new JSlider();
    private javax.swing.JScrollPane jScrollPane2 = new JScrollPane();

    private JTabbedPane jTabbedPanel = PanelBodyCentral.jTabbedPanel;


    //    Panel left
    private javax.swing.JButton buttonHome = new JButton();
    private javax.swing.JButton buttonSearch = new JButton();
    private javax.swing.JButton buttonLibrary = new JButton();
    private javax.swing.JButton buttonCreatePlayList = new JButton();
    private javax.swing.JButton buttonFavorites = new JButton();
    private javax.swing.JButton buttonEpisodes = new JButton();
    private JSeparator jSeparator1 = new JSeparator();
    //    Panel - left down
    private JScrollPane jScrolPanelPlayLists = new JScrollPane();
    private JPanel whereLoadButtonsOfPlaylist = new JPanel();

    public PanelLeftBody() {
        initComponents();
    }

    private void initComponents() {

//        LEFT PANEL

//        Separator

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

//        Configuration buttons

        buttonHome.setText("Inicio");
        buttonHome.addActionListener((e) -> {
            jTabbedPanel.setSelectedIndex(0);
        });

        buttonSearch.setText("Buscar");
        buttonSearch.addActionListener((e) -> {
            jTabbedPanel.setSelectedIndex(1);
        });

        buttonLibrary.setText("Tu Biblioteca");
        buttonLibrary.addActionListener((e) -> {
            jTabbedPanel.setSelectedIndex(2);
        });

        buttonCreatePlayList.setText("Crear Playlist");
        buttonCreatePlayList.addActionListener((e) -> {
            int count = jTabbedPanel.getTabCount();
            int numberOfPlayList = count - 4;
            JPanel jPanelPlayList = new javax.swing.JPanel();
            JLabel labelPlayListTittle = new javax.swing.JLabel();


            labelPlayListTittle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
            labelPlayListTittle.setText("PlayList " + numberOfPlayList);

            javax.swing.GroupLayout jPanelPlayListLayout = new javax.swing.GroupLayout(jPanelPlayList);
            jPanelPlayList.setLayout(jPanelPlayListLayout);
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

            jTabbedPanel.addTab("play" + numberOfPlayList, jPanelPlayList);
            jTabbedPanel.setSelectedIndex(count);

            JButton buttonToAdd = new JButton("PlayList #" + numberOfPlayList);
            buttonToAdd.setBounds(0, yWhereLoadPlayList, 131, 30);
            buttonToAdd.addActionListener(e1 -> {
                jTabbedPanel.setSelectedIndex(count);
            });

            yWhereLoadPlayList += 30;
            whereLoadButtonsOfPlaylist.add(buttonToAdd);

            javax.swing.GroupLayout whereLoadButtonsOfPlaylistLayout = new javax.swing.GroupLayout(whereLoadButtonsOfPlaylist);
            whereLoadButtonsOfPlaylist.setLayout(whereLoadButtonsOfPlaylistLayout);
            whereLoadButtonsOfPlaylistLayout.setHorizontalGroup(
                    whereLoadButtonsOfPlaylistLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGap(0, 131, Short.MAX_VALUE)
            );
            jScrolPanelPlayLists.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            whereLoadButtonsOfPlaylistLayout.setVerticalGroup(
                    whereLoadButtonsOfPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, yWhereLoadPlayList, Short.MAX_VALUE)
            );
            buttonToAdd.setVisible(true);

        });

//        Config whereLoadButtonsOfPlaylist

        javax.swing.GroupLayout whereLoadButtonsOfPlaylistLayout = new javax.swing.GroupLayout(whereLoadButtonsOfPlaylist);
        whereLoadButtonsOfPlaylist.setLayout(whereLoadButtonsOfPlaylistLayout);
        whereLoadButtonsOfPlaylistLayout.setHorizontalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 131, Short.MAX_VALUE)
        );
        whereLoadButtonsOfPlaylistLayout.setVerticalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 325, Short.MAX_VALUE)
        );

        jScrolPanelPlayLists.setViewportView(whereLoadButtonsOfPlaylist);

        buttonFavorites.setText("Tus me gusta");
        buttonFavorites.addActionListener((e) -> {
            jTabbedPanel.setSelectedIndex(3);
        });

        buttonEpisodes.setText("Tus episodios");
        buttonEpisodes.addActionListener((e) -> {
            jTabbedPanel.setSelectedIndex(4);
        });


//        config this panel

//        panelLeftBody Configuration

        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelLeftBodyLayout = new javax.swing.GroupLayout(this);
        setLayout(panelLeftBodyLayout);
        panelLeftBodyLayout.setHorizontalGroup(
                panelLeftBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLeftBodyLayout.createSequentialGroup()
                                .addContainerGap(9, Short.MAX_VALUE)
                                .addGroup(panelLeftBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrolPanelPlayLists)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonEpisodes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonFavorites, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonCreatePlayList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLibrary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
        );
        panelLeftBodyLayout.setVerticalGroup(
                panelLeftBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLeftBodyLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(buttonHome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLibrary)
                                .addGap(25, 25, 25)
                                .addComponent(buttonCreatePlayList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonFavorites)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEpisodes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrolPanelPlayLists, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

    }
}
