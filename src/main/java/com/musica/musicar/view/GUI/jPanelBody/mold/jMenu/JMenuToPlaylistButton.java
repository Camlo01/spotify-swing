package com.musica.musicar.view.GUI.jPanelBody.mold.jMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuToPlaylistButton extends JPopupMenu {

    JMenuItem addToPlayQueue, playlistRadio, addToProfile, report, deleteFromLibrary, download, createPlaylist,
            createCarpet, addToOtherPlaylist, share;

    public JMenuToPlaylistButton(JButton buttonToAddMenu) {
        initComponents(buttonToAddMenu);
    }

    public void initComponents(JButton buttonToAddMenu) {

//        Initializing menu items
        addToPlayQueue = new JMenuItem("Agregar a la fila de reproducción");
        playlistRadio = new JMenuItem("Ir a la radio de playlist");
        addToProfile = new JMenuItem("Agregar al perfil");
        report = new JMenuItem("Reportar");
        deleteFromLibrary = new JMenuItem("Eliminar de tu biblioteca");
        download = new JMenuItem("Descargar");
        createPlaylist = new JMenuItem("Crear playlist");
        createCarpet = new JMenuItem("Crear carpeta");
        addToOtherPlaylist = new JMenuItem("Agregar a otra playlist");
        share = new JMenuItem("Compartir");

//        Set behaviors

        addToPlayQueue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Agregado a otra fila de reproducción");
            }
        });


//        Setting configuration to menu items

        setConfigurationMenuItem(addToPlayQueue);
        setConfigurationMenuItem(playlistRadio);
        setConfigurationMenuItem(addToProfile);
        setConfigurationMenuItem(report);
        setConfigurationMenuItem(deleteFromLibrary);
        setConfigurationMenuItem(download);
        setConfigurationMenuItem(createPlaylist);
        setConfigurationMenuItem(createCarpet);
        setConfigurationMenuItem(addToOtherPlaylist);
        setConfigurationMenuItem(share);

//        Adding elements to this JPopMenu

        add(addToPlayQueue);
        add(playlistRadio);
        addSeparator();
        add(addToProfile);
        addSeparator();
        add(report);
        add(deleteFromLibrary);
        addSeparator();
        add(download);
        add(createPlaylist);
        add(createCarpet);
        add(addToOtherPlaylist);
        addSeparator();
        add(share);

//        Configuring this JPopUpMenu
        setBackground(Color.black);

        show(buttonToAddMenu, buttonToAddMenu.getWidth() / 2, buttonToAddMenu.getHeight() / 2);
    }

    /**
     * General configuration of styles of each menu item
     *
     * @param item to apply configuration
     */
    private void setConfigurationMenuItem(JMenuItem item) {
        item.setBackground(Color.black);
        item.setForeground(Color.white);
    }

}