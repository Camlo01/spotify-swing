package com.musica.musicar.view.GUI.jPanelBody.panelLeftBody.buttonOptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.event.ActionEvent.ALT_MASK;

public class MenuOptions extends JPopupMenu {

    //    Background normal color
    private final Color grayColor = new Color(41, 42, 46);

    private final String spaceString = "       ";

    //    Principal menus
    private JMenu menuArchive, menuEdit, menuSee, menuReproduction, menuHelp;

    //    menuArchive
    private JMenuItem itemNewPlaylist, itemNewPlaylistCarpet, itemPrivateSession, itemSingOff, itemExit;
    //    menuEdit
    private JMenuItem itemUndo, itemRedo, itemCut, itemCopy, itemPaste, itemDelete, itemSelectAll,
            itemSearch, itemFilter, itemPreferences;

    //    menuSee
    private JMenuItem itemZoomIn, itemZoomOut, itemResetZoom, itemAccelerateHardware, itemFriendsActivity;

    //    menuReproduction
    private JMenuItem itemPlay, itemNextSong, itemPreviousSong, itemFindNext, itemFindPrevious,
            itemAleatory, itemRepeat, itemUpVolume, itemDownVolume;

    //    menuHelp
    private JMenuItem itemHelpSpotify, itemSpotifyCommunity, itemYourAccount, itemLicences, itemAboutSpotify;

    public MenuOptions(JButton button) {
        initComponents(button);
    }

    private void initComponents(JButton buttonOptions) {
        //    menuArchive

        itemNewPlaylist = new JMenuItem(spaceString + "Nueva playlist");
        itemNewPlaylist.setAccelerator(KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        itemNewPlaylist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nueva playlist creada");
            }
        });

        itemNewPlaylistCarpet = new JMenuItem(spaceString + "Nueva carpeta de playlist") {
            @Override
            public Dimension getPreferredSize() {
                Dimension d = super.getPreferredSize();
                d.width = Math.max(d.width, 245); // set minimums
                d.height = Math.max(d.height, 15);
                return d;
            }
        };
        itemNewPlaylistCarpet.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK + ALT_MASK));
        itemNewPlaylistCarpet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nueva carpeta de playlist creada");
            }
        });

        itemPrivateSession = new JMenuItem(spaceString + "Sesión Privada");
        itemSingOff = new JMenuItem(spaceString + "Cerrar Sesión");
        itemSingOff.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK + InputEvent.SHIFT_DOWN_MASK));


        itemExit = new JMenuItem(spaceString + "Salir");
        itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK + InputEvent.SHIFT_DOWN_MASK));
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setConfigItem(itemNewPlaylist);
        setConfigItem(itemNewPlaylistCarpet);
        setConfigItem(itemPrivateSession);
        setConfigItem(itemSingOff);
        setConfigItem(itemExit);

        //    menuEdit
        itemUndo = new JMenuItem(spaceString + "Deshacer");
        itemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));

        itemRedo = new JMenuItem(spaceString + "Rehacer");
        itemRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));

        itemCut = new JMenuItem(spaceString + "Cortar");
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

        itemCopy = new JMenuItem(spaceString + "Copiar");
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));

        itemPaste = new JMenuItem(spaceString + "Pegar");
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));

        itemDelete = new JMenuItem(spaceString + "Eliminar");
        itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));

        itemSelectAll = new JMenuItem(spaceString + "Seleccionar todo");
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));

        itemSearch = new JMenuItem(spaceString + "Buscar");
        itemSearch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

        itemFilter = new JMenuItem(spaceString + "Filtrar");
        itemFilter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));

        itemPreferences = new JMenuItem(spaceString + "Preferencias...");
        itemPreferences.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        setConfigItem(itemUndo);
        setConfigItem(itemRedo);
        setConfigItem(itemCut);
        setConfigItem(itemCopy);
        setConfigItem(itemPaste);
        setConfigItem(itemDelete);
        setConfigItem(itemSelectAll);
        setConfigItem(itemSearch);
        setConfigItem(itemFilter);
        setConfigItem(itemPreferences);

        //    menuSee
        itemZoomIn = new JMenuItem(spaceString + "Acercar");
        itemZoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, ActionEvent.CTRL_MASK));

        itemZoomOut = new JMenuItem(spaceString + "Alejar");
        itemZoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, ActionEvent.CTRL_MASK));

        itemResetZoom = new JMenuItem(spaceString + "Restablecer zoom");
        itemResetZoom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));

        itemAccelerateHardware = new JMenuItem(spaceString + "Aceleración de hardware");

        itemFriendsActivity = new JMenuItem(spaceString + "Actividad de amigos");


        setConfigItem(itemZoomIn);
        setConfigItem(itemZoomOut);
        setConfigItem(itemResetZoom);
        setConfigItem(itemAccelerateHardware);
        setConfigItem(itemFriendsActivity);

        //    menuReproduction
        itemPlay = new JMenuItem(spaceString + "Reproducir");
        itemPlay.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0));

        itemNextSong = new JMenuItem(spaceString + "Siguiente");
        itemNextSong.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, ActionEvent.CTRL_MASK));

        itemPreviousSong = new JMenuItem(spaceString + "Anterior");
        itemPreviousSong.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, ActionEvent.CTRL_MASK));

        itemFindNext = new JMenuItem(spaceString + "buscar hacia adelante");
        itemFindNext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, InputEvent.SHIFT_DOWN_MASK));

        itemFindPrevious = new JMenuItem(spaceString + "Buscar hacia atrás");
        itemFindPrevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, InputEvent.SHIFT_DOWN_MASK));

        itemAleatory = new JMenuItem(spaceString + "Aleatorio");
        itemAleatory.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        itemRepeat = new JMenuItem(spaceString + "Repetir");
        itemRepeat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));

        itemUpVolume = new JMenuItem(spaceString + "Subir volumen");
        itemUpVolume.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UP, ActionEvent.CTRL_MASK));

        itemDownVolume = new JMenuItem(spaceString + "Bajar volumen");
        itemDownVolume.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, ActionEvent.CTRL_MASK));


        setConfigItem(itemPlay);
        setConfigItem(itemNextSong);
        setConfigItem(itemPreviousSong);
        setConfigItem(itemFindNext);
        setConfigItem(itemFindPrevious);
        setConfigItem(itemAleatory);
        setConfigItem(itemRepeat);
        setConfigItem(itemUpVolume);
        setConfigItem(itemDownVolume);


        //    menuHelp
        itemHelpSpotify = new JMenuItem(spaceString + "Ayuda de Spotify");
        itemHelpSpotify.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));

        itemSpotifyCommunity = new JMenuItem(spaceString + "Comunidad Spotify");
        itemYourAccount = new JMenuItem(spaceString + "Tu cuenta");
        itemLicences = new JMenuItem(spaceString + "Licencias de terceros");
        itemAboutSpotify = new JMenuItem(spaceString + "Acerca de Spotify");

        setConfigItem(itemHelpSpotify);
        setConfigItem(itemSpotifyCommunity);
        setConfigItem(itemYourAccount);
        setConfigItem(itemLicences);
        setConfigItem(itemAboutSpotify);
//        ---Menus

//        JPopUpMenu
        menuArchive = new JMenu(spaceString + "Archivo")
//        {
//            @Override
//            public Dimension getPreferredSize() {
//                Dimension d = super.getPreferredSize();
//                d.width = Math.max(d.width, 245); // set minimums
//                d.height = Math.max(d.height, 15);
//                return d;
//            }
//        }
        ;
        //----------------------------
        menuEdit = new JMenu(spaceString + "Editar");
        menuSee = new JMenu(spaceString + "Ver");
        menuReproduction = new JMenu(spaceString + "Reproducción");
        menuHelp = new JMenu(spaceString + "Ayuda");


//        menuArchive
        menuArchive.add(itemNewPlaylist);
        menuArchive.add(itemNewPlaylistCarpet);
        menuArchive.addSeparator();
        menuArchive.add(itemPrivateSession);
        menuArchive.addSeparator();
        menuArchive.add(itemSingOff);
        menuArchive.addSeparator();
        menuArchive.add(itemExit);

//        menuEdit
        menuEdit.add(itemUndo);
        menuEdit.add(itemRedo);
        menuEdit.addSeparator();
        menuEdit.add(itemCut);
        menuEdit.add(itemCopy);
        menuEdit.add(itemPaste);
        menuEdit.add(itemDelete);
        menuEdit.addSeparator();
        menuEdit.add(itemSelectAll);
        menuEdit.addSeparator();
        menuEdit.add(itemSearch);
        menuEdit.add(itemFilter);
        menuEdit.addSeparator();
        menuEdit.add(itemPreferences);

//        menuSee
        menuSee.add(itemZoomIn);
        menuSee.add(itemZoomOut);
        menuSee.add(itemResetZoom);
        menuSee.addSeparator();
        menuSee.add(itemAccelerateHardware);
        menuSee.add(itemFriendsActivity);
        menuEdit.addSeparator();

//        menuReproduction
        menuReproduction.add(itemPlay);
        menuReproduction.addSeparator();
        menuReproduction.add(itemNextSong);
        menuReproduction.add(itemPreviousSong);
        menuReproduction.add(itemFindNext);
        menuReproduction.add(itemFindPrevious);
        menuReproduction.addSeparator();
        menuReproduction.add(itemAleatory);
        menuReproduction.add(itemRepeat);
        menuReproduction.addSeparator();
        menuReproduction.add(itemUpVolume);
        menuReproduction.add(itemDownVolume);

//        menuHelp
        menuHelp.add(itemHelpSpotify);
        menuHelp.add(itemSpotifyCommunity);
        menuHelp.add(itemYourAccount);
        menuHelp.addSeparator();
        menuHelp.add(itemLicences);
        menuHelp.addSeparator();
        menuHelp.add(itemAboutSpotify);


        setConfigurationMenu(menuArchive);
        setConfigurationMenu(menuEdit);
        setConfigurationMenu(menuSee);
        setConfigurationMenu(menuReproduction);
        setConfigurationMenu(menuHelp);

//        Adding menus to this JPupUpMenu
//        menuArchive.setAlignmentX(CENTER_ALIGNMENT);


        add(menuArchive);
        add(menuEdit);
        add(menuSee);
        add(menuReproduction);
        add(menuHelp);

//        Config of this JPopUpMenu
        setBackground(grayColor);
//        show(buttonOptions, buttonOptions.getWidth() / 2, buttonOptions.getHeight() / 2);
    }

    private void setConfigurationMenu(JMenu menu) {
        menu.setFont(new java.awt.Font("Dialog", 0, 12));
        menu.setHorizontalAlignment(SwingConstants.LEFT);
        menu.setBackground(grayColor);
        menu.setForeground(Color.white);
    }

    private void setConfigItem(JMenuItem item) {
        item.setFont(new java.awt.Font("Dialog", 0, 12));
        item.setHorizontalAlignment(SwingConstants.LEFT);
        item.setBackground(grayColor);
        item.setForeground(Color.white);
    }


    @Override
    public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        d.width = Math.max(d.width, 150); // set minimums
        d.height = Math.max(d.height, 15);
        return d;
    }

}
