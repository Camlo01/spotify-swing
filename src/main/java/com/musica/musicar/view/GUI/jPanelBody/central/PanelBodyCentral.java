package com.musica.musicar.view.GUI.jPanelBody.central;

import com.musica.musicar.view.GUI.jPanelBody.central.panels.*;

import javax.swing.*;
import java.awt.*;

public class PanelBodyCentral extends javax.swing.JPanel {
    //  make accessible this panel in static methods
    public static JPanel parentContainer;
    {
        parentContainer = this;
    }

    //    Panel central
    public static CardLayout cardLayout = new CardLayout();


    private PanelHome jPanelHome = new PanelHome();
    private PanelSearch jPanelSearch = new PanelSearch();
    private PanelLibrary jPanelLibrary = new PanelLibrary();
    private PanelFavorites jPanelFavorites = new PanelFavorites();
    private PanelEpisodes jPanelEpisodes = new PanelEpisodes();


    public PanelBodyCentral() {
        initComponents();
    }

    private void initComponents() {
//        set a background color to verify all the components take up its size
        setBackground(new java.awt.Color(51, 255, 0));

        //        To configure this panel
        this.setLayout(cardLayout);
        this.add(jPanelHome, "1");
        this.add(jPanelSearch, "2");
        this.add(jPanelLibrary, "3");
        this.add(jPanelFavorites, "4");
        this.add(jPanelEpisodes, "5");
        setVisible(true);
    }

    public static void selectPanel(String panelToSelect) {
        cardLayout.show(parentContainer, panelToSelect);
    }

    public static String createNewPanel() {
        int numberOfPanels = parentContainer.getComponentCount();
        String newPanelNumber = String.valueOf(numberOfPanels + 1);
        int numberOfPlaylist = Integer.parseInt(newPanelNumber) - 5;
        PanelPlaylistMold jPanelPlaylistMold = new PanelPlaylistMold();
        jPanelPlaylistMold.setTitle("My playlist n.º" + numberOfPlaylist);
        parentContainer.add(jPanelPlaylistMold, newPanelNumber);
        selectPanel(newPanelNumber);
        return newPanelNumber;
    }

}
