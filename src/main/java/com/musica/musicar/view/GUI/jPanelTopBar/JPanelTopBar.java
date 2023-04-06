package com.musica.musicar.view.GUI.jPanelTopBar;

import com.musica.musicar.view.GUI.jPanelBody.panelLeftBody.buttonOptions.MenuOptions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Class that extends from JPanel that serves as a title bar showing
 * the options button and the window state management buttons (minimize, maximize, close)
 */
public class JPanelTopBar extends javax.swing.JPanel {

    private final JButton buttonOptions = new JButton();
    private final MenuOptions popUpMenuOptions = new MenuOptions(buttonOptions);

    public JPanelTopBar(JButton buttonMinimize, JButton buttonOpen, JButton buttonClose) {
        initComponents(buttonMinimize, buttonOpen, buttonClose);
    }


    private void initComponents(JButton buttonMinimize, JButton buttonOpen, JButton buttonClose) {

//        config Button Options
        setConfigButtonOptions();

//        Config buttons of this panel
        setConfigurationButton(buttonMinimize);
        setConfigurationButton(buttonOpen);
        setConfigurationButton(buttonClose);

//        CONFIG THIS PANEL

//        setOpaque(true);
        setBackground(new Color(0, 0, 0, 0));
        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelTopBarLayout = new javax.swing.GroupLayout(this);
        setLayout(panelTopBarLayout);
        panelTopBarLayout.setHorizontalGroup(
                panelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTopBarLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(buttonOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(buttonMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonOpen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        )
        );
        panelTopBarLayout.setVerticalGroup(
                panelTopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonClose, 31, 31, 31)
                        .addComponent(buttonOpen, 31, 31, 31)
                        .addComponent(buttonMinimize, 31, 31, 31)
                        .addComponent(buttonOptions, 36, 36, 36)
                        .addGap(5, 5, 5)
        );

    }

    /**
     * General configuration to buttons
     *
     * @param button to config
     */
    private void setConfigurationButton(JButton button) {
        button.setFont(new java.awt.Font("Dialog", 1, 13));
        button.setBackground(new Color(8, 8, 8));
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setForeground(Color.white);
        button.setContentAreaFilled(true);

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

    /**
     * Styles to apply a button
     *
     * @param evt    detect movement
     * @param button to apply styles
     */
    private void buttonStylesMouseMoved(MouseEvent evt, JButton button) {
        button.setBackground(new Color(87, 87, 87));
    }

    /**
     * Styles to apply a button
     *
     * @param evt    detect movement
     * @param button to apply styles
     */
    private void buttonStylesMouseExited(MouseEvent evt, JButton button) {
        button.setBackground(new Color(8, 8, 8));
    }


    /**
     * Configuring the options button that displays a menu
     */
    private void setConfigButtonOptions() {
        buttonOptions.setText("...");
        buttonOptions.setFont(new java.awt.Font("Dialog", 1, 26));
        buttonOptions.setFocusable(false);
        buttonOptions.setFocusPainted(false);
        buttonOptions.setBackground(Color.black);
        buttonOptions.setForeground(Color.white);
        buttonOptions.setContentAreaFilled(true);
        buttonOptions.setBorder(BorderFactory.createEmptyBorder(4, 4, 1, 4));
        setConfigurationPopUpMenu();

        buttonOptions.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
//                buttonOptions.setBackground(Color.red);
            }
        });
        buttonOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
//                buttonOptions.setBackground(Color.blue);
            }
        });
    }

    /**
     * set PopUpMenu to buttonOptions
     */
    private void setConfigurationPopUpMenu() {
        // Create popup menu, attach popup menu listener
        buttonOptions.setComponentPopupMenu(popUpMenuOptions);
    }


}
