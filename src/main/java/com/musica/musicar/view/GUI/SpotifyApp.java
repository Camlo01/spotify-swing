package com.musica.musicar.view.GUI;

import com.musica.musicar.view.GUI.jPanelBody.PanelBody;
import com.musica.musicar.view.GUI.jPanelBottomBar.PanelBottomBar;
import com.musica.musicar.view.GUI.jPanelTopBar.JPanelTopBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpotifyApp extends javax.swing.JFrame {

    //    buttons to manage this JFrame
    private final JButton buttonMinimize = new JButton("__");
    private final JButton buttonOpen = new JButton("[ ]");
    private final JButton buttonClose = new JButton("X");

    //    value that stores the state of the window
    private boolean isFullOpen;

    //    mouse position
    private int mouseX, mouseY;

    public SpotifyApp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        isFullOpen = false;

//        Construct panels
        panelBottomBar = new PanelBottomBar();
        panelBody = new PanelBody();
        panelTopBar = new JPanelTopBar(buttonMinimize, buttonOpen, buttonClose);

//        Set configuration to buttons that are into the panelTopBar

        buttonOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manageWindow();
            }
        });

        buttonMinimize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setExtendedState(JFrame.ICONIFIED);
            }
        });

//        Setting behaviors to the panelTopBar for can move it
        panelTopBar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                setLocation(getX() + e.getX() - mouseX, getY() + e.getY() - mouseY);
            }
        });

        panelTopBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        panelBody.setMinimumSize(new Dimension(800, 524));
//        Hide title bar of this JFrame
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelBottomBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBody, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelTopBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelTopBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelBody, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
                                .addComponent(panelBottomBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
//        setMinimumSize(new Dimension(700, 800));
        setBackground(Color.red);

        pack();
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getRootPane().setWindowDecorationStyle(JRootPane.WHEN_FOCUSED);

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SpotifyApp app = new SpotifyApp();
                app.setTitle("Spotify");
                app.setVisible(true);
//                app.setResizable(true);
            }
        });
    }

    /**
     * Method in charge
     */
    private void manageWindow() {
        if (!isFullOpen) {
//            setExtendedState(JFrame.MAXIMIZED_BOTH);
            maximizedWindow();
        } else {
            setSize(new Dimension(900, 800));
            isFullOpen = false;
            setLocationRelativeTo(null);
        }
    }

    /**
     * Method in charge of maximizing the JFrame allowing to show the taskbar
     */
    private void maximizedWindow() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Insets taskbar = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        setBounds(0, 0, screenSize.width, screenSize.height - taskbar.bottom);
        isFullOpen = true;
    }

    private JPanelTopBar panelTopBar;
    private PanelBottomBar panelBottomBar;
    private PanelBody panelBody;


}
