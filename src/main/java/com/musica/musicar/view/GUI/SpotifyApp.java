package com.musica.musicar.view.GUI;


import com.musica.musicar.view.GUI.jPanelBody.PanelBody;
import com.musica.musicar.view.GUI.jPanelBottomBar.PanelBottomBar;
import com.musica.musicar.view.GUI.jPanelTopBar.JPanelTopBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Main window of the application with all the panels to show
 */
public class SpotifyApp extends javax.swing.JFrame {

    //    buttons to manage this JFrame
    private final JButton buttonMinimize = new JButton("__");
    private final JButton buttonOpen = new JButton("[ ]");
    private final JButton buttonClose = new JButton("X");

    //    value that stores the state of the window
    private boolean isFullOpen;

    //    mouse position for move title bar
    private int positionX, positionY;

    //      variables for resize screen
    private static final double RESIZE_MARGIN = 5.0;

    //  Cursors to define the mouse position
    private static final Cursor DEFAULT_CURSOR = new Cursor(Cursor.DEFAULT_CURSOR);
    private static final Cursor TOP_CURSOR = new Cursor(Cursor.N_RESIZE_CURSOR);
    private static final Cursor RIGHT_CURSOR = new Cursor(Cursor.E_RESIZE_CURSOR);
    private static final Cursor BOTTOM_CURSOR = new Cursor(Cursor.S_RESIZE_CURSOR);
    private static final Cursor LEFT_CURSOR = new Cursor(Cursor.W_RESIZE_CURSOR);
    private static final Cursor DIAGONAL_NW_CURSOR = new Cursor(Cursor.NW_RESIZE_CURSOR);
    private static final Cursor DIAGONAL_NE_CURSOR = new Cursor(Cursor.NE_RESIZE_CURSOR);
    private static final Cursor DIAGONAL_SE_CURSOR = new Cursor(Cursor.SE_RESIZE_CURSOR);
    private static final Cursor DIAGONAL_SW_CURSOR = new Cursor(Cursor.SW_RESIZE_CURSOR);

    //  minimum sizes
    private static final int MINIMIUM_WIDTH = 800;
    private static final int MINIMIUM_HEIGHT = 600;


    // Values that store the last size and position value of the window
    // They are also used for window position and resizing logic
    private int lBeforeX; // last X axis location
    private int lBeforeY; // last Y axis location
    private int wBeforeWidth = 800; // last window width measurement
    private int wBeforeHeight = 600; // last window height measurement


    // Variable declared to be accessible to the class from a block of code
    private final JFrame THIS_JFRAME;

    {
        THIS_JFRAME = this;
    }

    public SpotifyApp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        isFullOpen = false; // The isFullOpen value is initialized to false because the window is opened minimized

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

        //Configuring this JFrame

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
        setBackground(Color.red);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getRootPane().setWindowDecorationStyle(JRootPane.WHEN_FOCUSED);
        setLocationRelativeTo(null);

        THIS_JFRAME.addMouseMotionListener(new MouseAdapter() {
            int lBeforeX = (int) getLocation().getX();
            int lBeforeY = (int) getLocation().getY();
            int wBeforeWidth = getWidth();
            int wBeforeHeight = getHeight();

            /**
             * The cursor style is set according to the captured position
             * @param e MouseEvent
             */
            @Override
            public void mouseMoved(MouseEvent e) {
                if (!isFullOpen) {
                    double width = getWidth();
                    double height = getHeight();
                    double XAxis = e.getX();
                    double YAxis = e.getY();
                    setCursorWithParameters(width, height, XAxis, YAxis);
                }
            }

            /**
             * Depending on where the mouse position moves while it is being pressed,
             * it will resize from the pressed edge or the Jframe will move.
             * @param e MouseEvent
             */
            @Override
            public void mouseDragged(MouseEvent e) {

                int mouseX = e.getX();
                int mouseY = e.getY();

//                DIAGONALS ---
                if (getCursor() == DIAGONAL_NW_CURSOR) {
                    int newWidth = wBeforeWidth + (e.getX() * -1);
                    int newXAxis = lBeforeX + e.getX();
                    int newYAxis = (int) getLocation().getY() + mouseY;
                    int newHeight = newYAxis * -1 + (wBeforeHeight + lBeforeY);

//                            Set width and height
                    if (newWidth >= MINIMIUM_WIDTH && newHeight >= MINIMIUM_HEIGHT) {
                        setLocation(newXAxis, newYAxis);
                        setSize(newWidth, newHeight);

//                            Set only height if width is minimal
                    } else if (newHeight >= MINIMIUM_HEIGHT && newWidth < MINIMIUM_WIDTH) {
                        setLocation(getX(), newYAxis);
                        setSize(getWidth(), Math.max(newHeight, MINIMIUM_HEIGHT));

//                            Set width only if height is minimal
                    } else if (newWidth >= MINIMIUM_WIDTH && newHeight < MINIMIUM_HEIGHT) {
                        setSize(Math.max(newWidth, MINIMIUM_WIDTH), getHeight());
                        setLocation(newXAxis, getY());
                    }

                } else if (getCursor() == DIAGONAL_NE_CURSOR) {
                    int newWidth = lBeforeX + (mouseX - lBeforeX);
                    int newYAxis = (int) getLocation().getY() + mouseY;
                    int maxEdge = (wBeforeHeight + lBeforeY);
                    int newHeight = newYAxis * -1 + maxEdge;

                    if (newWidth >= MINIMIUM_WIDTH && newHeight >= MINIMIUM_HEIGHT) {
                        setLocation(getX(), newYAxis);
                        setSize(newWidth, newHeight);

                    } else if (newWidth < MINIMIUM_WIDTH && newHeight >= MINIMIUM_HEIGHT) {
                        setLocation(getX(), newYAxis);
                        setSize(getWidth(), newHeight);

                    } else {
                        setSize(Math.max(newWidth, MINIMIUM_WIDTH), getHeight());
                    }

                } else if (getCursor() == DIAGONAL_SW_CURSOR) {
                    int newHeight = lBeforeY + (mouseY - lBeforeY);
                    int newWidth = wBeforeWidth + (e.getX() * -1);
                    int newXAxis = lBeforeX + e.getX();

                    if (newWidth >= MINIMIUM_WIDTH && newHeight >= MINIMIUM_HEIGHT) {
                        setSize(newWidth, newHeight);
                        setLocation(newXAxis, lBeforeY);

                    } else if (newWidth < MINIMIUM_WIDTH) {
                        setSize(wBeforeWidth, Math.max(MINIMIUM_HEIGHT, newHeight));

                    } else {
                        setSize(newWidth, wBeforeHeight);
                        setLocation(newXAxis, lBeforeY);
                    }

                } else if (getCursor() == DIAGONAL_SE_CURSOR) {
                    int newWidth = lBeforeX + (mouseX - lBeforeX);
                    int newHeight = lBeforeY + (mouseY - lBeforeY);

                    if (newWidth >= MINIMIUM_WIDTH && newHeight >= MINIMIUM_HEIGHT) {
                        setSize(newWidth, newHeight);

                    } else if (newWidth < MINIMIUM_WIDTH) {
                        setSize(MINIMIUM_WIDTH, Math.max(newHeight, MINIMIUM_HEIGHT));

                    } else {
                        setSize(newWidth, MINIMIUM_HEIGHT);
                    }

//                EDGED ---

                } else if (getCursor() == TOP_CURSOR) {
                    int newYAxis = (int) getLocation().getY() + mouseY;
                    int newHeight = newYAxis * -1 + (wBeforeHeight + lBeforeY);

                    if (newHeight >= MINIMIUM_HEIGHT) {
                        setSize(getWidth(), Math.max(newHeight, MINIMIUM_HEIGHT));
                        setLocation(getX(), newYAxis);
                    }
                } else if (getCursor() == BOTTOM_CURSOR) {
                    int newHeight = lBeforeY + (mouseY - lBeforeY);

                    if (newHeight > MINIMIUM_HEIGHT) {
                        setSize(getWidth(), newHeight);
                    }
                } else if (getCursor() == LEFT_CURSOR) {
                    int newXAxis = (int) getLocation().getX() + mouseX;
                    int newWidth = (newXAxis * -1 + (wBeforeWidth + lBeforeX));

                    if (newWidth >= MINIMIUM_WIDTH) {
                        setSize(newWidth, getHeight());
                        setLocation(newXAxis, getY());
                    }
                } else if (getCursor() == RIGHT_CURSOR) {
                    int newWidth = lBeforeX + (mouseX - lBeforeX);

                    if (newWidth >= MINIMIUM_WIDTH) {
                        setSize(newWidth, getHeight());
                    }
                }

                //It is validated that from the taskbar you are pressing to be able to move the window
                if (getCursor() == DEFAULT_CURSOR && isClickedOnTopEdge(THIS_JFRAME, e)) {
                    setLocation(getX() + e.getX() - positionX, getY() + e.getY() - positionY);
                }

//                updating values
                lBeforeX = (int) getLocation().getX();
                lBeforeY = (int) getLocation().getY();
                wBeforeWidth = getWidth();
                wBeforeHeight = getHeight();
            }
        });

        THIS_JFRAME.addMouseListener(new MouseAdapter() {
            /**
             * Capture mouse position on pressing the JFrame
             * @param e MouseEvent
             * @Override
             */
            @Override
            public void mousePressed(MouseEvent e) {
                positionX = e.getX();
                positionY = e.getY();
            }
        });
    }

    //-------------------------------------------------------
    //------------------- MAIN METHOD------------------------
    //-------------------------------------------------------
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SpotifyApp app = new SpotifyApp();
                app.setTitle("Spotify");
                app.setVisible(true);
            }
        });
    }

    /**
     * Method in charge of managing the logic of the button to maximize the window to show
     * the full window or in the last size and position it had before being resized
     */
    private void manageWindow() {
        if (!isFullOpen) {
//            The size and location values are saved before the window is maximized
            lBeforeX = (int) getLocation().getX();
            lBeforeY = (int) getLocation().getY();
            wBeforeWidth = getWidth();
            wBeforeHeight = getHeight();
            //configure the size of the JFrame allowing to see the taskbar
            maximizedWindow();
        } else {
            setSize(new Dimension(wBeforeWidth, wBeforeHeight));
            isFullOpen = false;
            setLocation(new Point(lBeforeX, lBeforeY));
        }
    }

    /**
     * Method in charge of maximizing the JFrame allowing to show the taskbar
     * and set the value of isFullOpen to true to disable the styles of the
     * cursor on the borders, which allows its resizing
     */
    private void maximizedWindow() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Insets taskbar = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        setBounds(0, 0, screenSize.width, screenSize.height - taskbar.bottom);
        isFullOpen = true;
    }

    /**
     * Method in charge of verifying that it has been pressed from the title bar
     *
     * @param frame frame to evaluate
     * @param e     MouseEvent to evaluate
     * @return True if pressed from the title bar
     */
    private boolean isClickedOnTopEdge(JFrame frame, MouseEvent e) {
        double MARGIN = RESIZE_MARGIN;
        return (e.getX() > MARGIN && e.getX() <= frame.getWidth() - MARGIN &&
                e.getY() > MARGIN && e.getY() <= 36);
    }

    /**
     * Method in charge of setting the styles of the cursor according to the position that is captured
     * Exam. when the mouse is over the top border the TOP_CURSOR cursor is set
     *
     * @param width  of JFrame
     * @param height of JFrame
     * @param XAxis  position of mouse
     * @param YAxis  position of mouse
     */
    private void setCursorWithParameters(double width, double height, double XAxis, double YAxis) {
        //                DIAGONALS ---
        if (YAxis <= RESIZE_MARGIN && XAxis < RESIZE_MARGIN + 1) { // Diagonal TOP-left
            setCursor(DIAGONAL_NW_CURSOR);
        } else if (YAxis <= RESIZE_MARGIN && XAxis >= width - RESIZE_MARGIN) { // Diagonal TOP-right
            setCursor(DIAGONAL_NE_CURSOR);
        } else if (YAxis >= height - RESIZE_MARGIN && XAxis <= RESIZE_MARGIN) { // Diagonal BOTTOM-left
            setCursor(DIAGONAL_SW_CURSOR);
        } else if (YAxis >= height - RESIZE_MARGIN && XAxis >= width - RESIZE_MARGIN) { // Diagonal BOTTOM-right
            setCursor(DIAGONAL_SE_CURSOR);
//                    EDGES ---
        } else if (YAxis <= RESIZE_MARGIN && (XAxis > RESIZE_MARGIN && XAxis < width - RESIZE_MARGIN)) { // TOP Edge
            setCursor(TOP_CURSOR);
        } else if (YAxis > height - RESIZE_MARGIN && (XAxis > RESIZE_MARGIN && XAxis < width - RESIZE_MARGIN)) { // BOTTOM Edge
            setCursor(BOTTOM_CURSOR);
        } else if (XAxis <= RESIZE_MARGIN && (YAxis > RESIZE_MARGIN && YAxis < height - RESIZE_MARGIN)) { // LEFT Edge
            setCursor(LEFT_CURSOR);
        } else if (XAxis > width - RESIZE_MARGIN && (YAxis > RESIZE_MARGIN && YAxis < height - RESIZE_MARGIN)) { // RIGHT Edge
            setCursor(RIGHT_CURSOR);
        } else {
            setCursor(DEFAULT_CURSOR);
        }
    }

    private JPanelTopBar panelTopBar;
    private PanelBottomBar panelBottomBar;
    private PanelBody panelBody;

}