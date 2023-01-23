package com.musica.musicar.view.GUI.jPanelBody;

import com.musica.musicar.view.GUI.SpotifyApp;
import com.musica.musicar.view.GUI.jPanelBody.central.PanelBodyCentral;
import com.musica.musicar.view.GUI.jPanelBody.mold.jMenu.JMenuToPlaylistButton;
import com.musica.musicar.view.GUI.jPanelBody.panelLeftBody.buttonOptions.MenuOptions;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class PanelLeftBody extends javax.swing.JPanel {

    private int yWhereLoadPlaylistButtons = 0;
    private final javax.swing.JSlider jSlider3 = new JSlider();
    private final javax.swing.JScrollPane jScrollPane2 = new JScrollPane();

    //    Panel Up
    private final javax.swing.JButton buttonHome = new JButton();
    private final javax.swing.JButton buttonSearch = new JButton();
    private final javax.swing.JButton buttonLibrary = new JButton();
    private final javax.swing.JButton buttonCreatePlayList = new JButton();
    private final javax.swing.JButton buttonFavorites = new JButton();
    private final javax.swing.JButton buttonEpisodes = new JButton();
    private final JSeparator jSeparator1 = new JSeparator();

    //    Panel Down
    private final JScrollPane jScrollPanelPlayLists = new JScrollPane();
    private final JPanel whereLoadButtonsOfPlaylist = new JPanel(new BorderLayout());

    /**
     * Constructor
     */
    public PanelLeftBody() {
        initComponents();
    }

    private void initComponents() {


//        LEFT PANEL

//        Separator between buttons and panel of playlist buttons
        jSeparator1.setSize(0, 1);
        jSeparator1.setForeground(new Color(13, 13, 13));
        jSeparator1.setBackground(new Color(13, 13, 13));
        jSeparator1.setBorder(null);

//        Configuration buttons
        setConfigurationsButton(buttonHome, "Inicio", "1");
        setConfigurationsButton(buttonSearch, "Buscar", "2");
        setConfigurationsButton(buttonLibrary, "Tu Biblioteca", "3");
        setConfigurationsButton(buttonFavorites, "Tus me gusta", "4");
        setConfigurationsButton(buttonEpisodes, "Tus episodios", "5");
        setConfigurationsButton(buttonCreatePlayList, "Crear Playlist", null);


//        logic of creating a playlist
        buttonCreatePlayList.addActionListener((e) -> {
            createNewPlaylist();
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
                        .addGap(0, 150, Short.MAX_VALUE)
        );
        jScrollPanelPlayLists.setBorder(new LineBorder(Color.black));
        jScrollPanelPlayLists.setViewportView(whereLoadButtonsOfPlaylist);


//        config this panel

//        panelLeftBody Configuration

        setBackground(new java.awt.Color(0, 0, 0));
//        setMinimumSize(new Dimension(107, 524));

        javax.swing.GroupLayout panelLeftBodyLayout = new javax.swing.GroupLayout(this);
        setLayout(panelLeftBodyLayout);
        panelLeftBodyLayout.setHorizontalGroup(
                panelLeftBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.CENTER, panelLeftBodyLayout.createSequentialGroup()
                                .addContainerGap(9, Short.MAX_VALUE)
                                .addGroup(panelLeftBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPanelPlayLists)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonEpisodes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonFavorites, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonCreatePlayList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLibrary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(9, 9, 9)))
        );
//        buttonOptions
        panelLeftBodyLayout.setVerticalGroup(
                panelLeftBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLeftBodyLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
//                                .addGap(50, 50, 50)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(jScrollPanelPlayLists, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        buttonHome.setForeground(Color.white);
    }

    /**
     * Function that apply general configuration to a button
     * without indicate what tab select
     *
     * @param button to configure
     * @param title  to set in the button
     */
    private void setConfigurationsButton(JButton button, String title, String panelToSelect) {
        setGenericButtonConfiguration(button, title);

//        Styles que button is pressed
        button.addActionListener(e1 -> {
            PanelBodyCentral.selectPanel(panelToSelect);
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

    }

    private void setConfigurationToButtonAdded(JButton buttonToAdd, String title, String panelToSelect, int y) {
        setGenericButtonConfiguration(buttonToAdd, title);
        buttonToAdd.setFont(new java.awt.Font("Dialog", 1, 12));
        buttonToAdd.setHorizontalAlignment(SwingConstants.LEFT);
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
        buttonToAdd.setBounds(0, yWhereLoadPlaylistButtons, 131, 30);
        buttonToAdd.addActionListener(e1 -> {
            PanelBodyCentral.selectPanel(panelToSelect);
        });
        buttonToAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (mouseEventRight(e)) {
                    menuPlaylistButton(buttonToAdd);
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
        button.setFont(new java.awt.Font("Dialog", 1, 13));
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBackground(Color.black);
        button.setForeground(new Color(179, 179, 179));
        button.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        button.setContentAreaFilled(false);
        button.setHorizontalAlignment(SwingConstants.LEFT);
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
    public void menuPlaylistButton(JButton button) {
        JMenuToPlaylistButton menu = new JMenuToPlaylistButton();
        button.setComponentPopupMenu(menu);

    }


    /**
     * Update whereLoadButtonsOfPlaylist JPanel after add a new button
     *
     * @param newSize value to increase the size of the panel
     */
    private void updatePanelPlaylistButtons(JButton buttonToAdd, int newSize) {

        yWhereLoadPlaylistButtons += 30;

        whereLoadButtonsOfPlaylist.add(buttonToAdd);
        buttonToAdd.setVisible(true);


        javax.swing.GroupLayout whereLoadButtonsOfPlaylistLayout = new javax.swing.GroupLayout(whereLoadButtonsOfPlaylist);
        whereLoadButtonsOfPlaylist.setLayout(whereLoadButtonsOfPlaylistLayout);
        whereLoadButtonsOfPlaylistLayout.setHorizontalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 131, Short.MAX_VALUE)
        );
        jScrollPanelPlayLists.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        whereLoadButtonsOfPlaylistLayout.setVerticalGroup(
                whereLoadButtonsOfPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, newSize, Short.MAX_VALUE)
        );
    }

    /**
     * Logic for create new Playlist and set the playlist panel in the central body
     */
    private void createNewPlaylist() {
//            Number of the position where the new playlist panel is created
        String positionOfNewPlaylist = PanelBodyCentral.createNewPanel();

//            The new panel button is created with its name
        String playlistNameByDefect = "Playlist #" + (Integer.parseInt(positionOfNewPlaylist) - 5);
        JButton playlistButton = new JButton(playlistNameByDefect);
//            The playlist button is configured
        setConfigurationToButtonAdded(playlistButton, playlistNameByDefect, positionOfNewPlaylist, yWhereLoadPlaylistButtons);

//            Resizing the size of the jPanel with the playlist buttons
        updatePanelPlaylistButtons(playlistButton, yWhereLoadPlaylistButtons);
        playlistButton.setBackground(Color.red);
    }


}
