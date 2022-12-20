package com.musica.musicar.view.GUI.jPanelBody;

import com.musica.musicar.view.GUI.jPanelBody.mold.JTabPlaylist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelLeftBody extends javax.swing.JPanel {

    private int yWhereLoadPlayList = 0;
    private javax.swing.JSlider jSlider3 = new JSlider();
    private javax.swing.JScrollPane jScrollPane2 = new JScrollPane();

    private JTabbedPane jTabbedPanel = PanelBodyCentral.jTabbedPanel;


    //    Panel Up
    private javax.swing.JButton buttonHome = new JButton();
    private javax.swing.JButton buttonSearch = new JButton();
    private javax.swing.JButton buttonLibrary = new JButton();
    private javax.swing.JButton buttonCreatePlayList = new JButton();
    private javax.swing.JButton buttonFavorites = new JButton();
    private javax.swing.JButton buttonEpisodes = new JButton();
    private JSeparator jSeparator1 = new JSeparator();

    //    Panel Down
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

        setConfigurationsButton(buttonHome, "Inicio", 0);
        setConfigurationsButton(buttonSearch, "Buscar", 1);
        setConfigurationsButton(buttonLibrary, "Tu Biblioteca", 2);
        setConfigurationsButton(buttonFavorites, "Tus me gusta", 3);
        setConfigurationsButton(buttonEpisodes, "Tus episodios", 4);
        setConfigurationsButton(buttonCreatePlayList, "Crear Playlist");
//        function create Playlist
        buttonCreatePlayList.addActionListener((e) -> {
            int count = jTabbedPanel.getTabCount();
            int numberOfPlayList = count - 4;

//            LABEL
            JLabel labelPlayListTittle = new javax.swing.JLabel();
            labelPlayListTittle.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
            labelPlayListTittle.setText("PlayList " + numberOfPlayList);

//            PANEL
            JTabPlaylist jPanelPlayList = new JTabPlaylist(labelPlayListTittle);

            jTabbedPanel.addTab("play" + numberOfPlayList, jPanelPlayList);
            jTabbedPanel.setSelectedIndex(count);

            JButton buttonToAdd = new JButton();
            String buttonNameByDefect = "PlayList #" + numberOfPlayList;
            setConfigurationButtonToAdd(buttonToAdd, buttonNameByDefect, count, yWhereLoadPlayList);
            yWhereLoadPlayList += 30;
            whereLoadButtonsOfPlaylist.add(buttonToAdd);
            updatePanelPlaylistButtons(yWhereLoadPlayList);
            buttonToAdd.setVisible(true);

        });

//        Config whereLoadButtonsOfPlaylist

        whereLoadButtonsOfPlaylist.setBackground(Color.black);

        javax.swing.GroupLayout whereLoadButtonsOfPlaylistLayout = new javax.swing.GroupLayout(whereLoadButtonsOfPlaylist);
        whereLoadButtonsOfPlaylist.setLayout(whereLoadButtonsOfPlaylistLayout);
        whereLoadButtonsOfPlaylistLayout.setHorizontalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 131, Short.MAX_VALUE)
        );
        whereLoadButtonsOfPlaylistLayout.setVerticalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );
        jScrolPanelPlayLists.setViewportView(whereLoadButtonsOfPlaylist);


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

    /**
     * Function that apply general configuration to a button of different tabs in the JPannedPane
     *
     * @param button   to configure
     * @param title    to set in the button
     * @param indexTab tab to select in jTabbedPanel
     */
    private void setConfigurationsButton(JButton button, String title, int indexTab) {
        setGenericButtonConfiguration(button, title);
        button.addActionListener((e) -> {
            jTabbedPanel.setSelectedIndex(indexTab);
        });
        button.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                buttonStylesMouseMoved(evt, button);
            }
        });
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonStylesMouseExited(evt, button);
            }
        });
        button.setVisible(true);
    }

    /**
     * Function that apply general configuration to a button
     * without indicate what tab select
     *
     * @param button to configure
     * @param title  to set in the button
     */
    private void setConfigurationsButton(JButton button, String title) {
        setGenericButtonConfiguration(button, title);
        button.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                buttonStylesMouseMoved(evt, button);
            }
        });
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonStylesMouseExited(evt, button);
            }
        });
    }

    private void setConfigurationButtonToAdd(JButton buttonToAdd, String title, int tabToOpen, int y) {
        setGenericButtonConfiguration(buttonToAdd, title);

        buttonToAdd.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                buttonStylesMouseMoved(evt, buttonToAdd);
            }
        });
        buttonToAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonStylesMouseExited(evt, buttonToAdd);
            }
        });
        buttonToAdd.setBounds(0, yWhereLoadPlayList, 131, 30);
        buttonToAdd.addActionListener(e1 -> {
            jTabbedPanel.setSelectedIndex(tabToOpen);
        });
        buttonToAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (mouseEventRight(e)) {
                    functionOfMenu(buttonToAdd);
                }
            }
        });
    }

    /**
     * Configuration for every button
     *
     * @param button to apply styles
     * @param title  of the button
     */
    private void setGenericButtonConfiguration(JButton button, String title) {
        button.setText(title);
        button.setFont(new java.awt.Font("Dialog", 1, 14));
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBackground(Color.black);
        button.setForeground(new Color(179, 179, 179));
        button.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button.setContentAreaFilled(false);
    }


    /**
     * Apply styles to button when mouse is over
     *
     * @param evt    action
     * @param button to apply styles
     */
    private void buttonStylesMouseMoved(MouseEvent evt, JButton button) {
        button.setForeground(Color.WHITE);
    }

    /**
     * Reapplies normal styles before mouse over
     *
     * @param evt    action
     * @param button to apply styles
     */
    private void buttonStylesMouseExited(MouseEvent evt, JButton button) {
        button.setForeground(new Color(179, 179, 179));
    }

    /**
     * Function that evaluates if the click pressed is the right one
     *
     * @param e event to evaluate
     * @return true if it is
     */
    private boolean mouseEventRight(MouseEvent e) {
        return (e.getButton() == MouseEvent.BUTTON3);
    }

    /**
     * Function that displays a menu to execute on the button of a playlist
     *
     * @param button to add pop up menu
     */
    public void functionOfMenu(JButton button) {
        JPopupMenu menu = new JPopupMenu("Menu");
        menu.add(new JMenuItem(new AbstractAction("Agregar a la fila de reproducción") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.add(new JMenuItem(new AbstractAction("Ir a la radio de playlist") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.addSeparator();
        menu.add(new JMenuItem(new AbstractAction("Agregar al perfil") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.addSeparator();
        menu.add(new JMenuItem(new AbstractAction("Reportar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.add(new JMenuItem(new AbstractAction("Eliminar de Tu biblioteca") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.addSeparator();
        menu.add(new JMenuItem(new AbstractAction("Descargar") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.add(new JMenuItem(new AbstractAction("Crear playlist") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.add(new JMenuItem(new AbstractAction("Crear carpeta") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.add(new JMenuItem(new AbstractAction("Agregar a otra playlist") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.addSeparator();
        menu.add(new JMenuItem(new AbstractAction("Compartir") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You pressed a jMenuItem");
            }
        }));
        menu.show(button, button.getWidth() / 2, button.getHeight() / 2);
    }


    /**
     * Update whereLoadButtonsOfPlaylist JPanel after add a new button
     *
     * @param newSize value to increase the size of the panel
     */
    private void updatePanelPlaylistButtons(int newSize) {
        javax.swing.GroupLayout whereLoadButtonsOfPlaylistLayout = new javax.swing.GroupLayout(whereLoadButtonsOfPlaylist);
        whereLoadButtonsOfPlaylist.setLayout(whereLoadButtonsOfPlaylistLayout);
        whereLoadButtonsOfPlaylistLayout.setHorizontalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 131, Short.MAX_VALUE)
        );
        jScrolPanelPlayLists.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        whereLoadButtonsOfPlaylistLayout.setVerticalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, newSize, Short.MAX_VALUE)
        );
    }


}
