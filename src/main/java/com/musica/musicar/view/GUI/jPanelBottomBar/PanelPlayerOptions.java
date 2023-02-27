package com.musica.musicar.view.GUI.jPanelBottomBar;

import com.musica.musicar.RoundedButtonHelper;
import com.musica.musicar.logic.Display;
import com.musica.musicar.logic.reproduction.HandlePlayback;
import com.musica.musicar.styles.StylesJSliderNormal;
import com.musica.musicar.styles.StylesJSliderOver;

import javax.swing.*;
import javax.swing.plaf.SliderUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * Class that contains the buttons with the logic to manage the music playback
 */
public class PanelPlayerOptions extends JPanel {

    private boolean isInfoDisplayed = false;
    private final String songToReproduce = "Aventura - Volví.mp3";
    //    private final String songToReproduce = "50 Cent - 21 Questions.mp3";
    //    private final String songToReproduce = "Bad Bunny - Tití Me Preguntó.mp3";
    //    private final String songToReproduce = "Childish Gambino - Me and Your Mama.mp3";
    private final String songToReproduce2 = "The Weeknd - Is There Someone Else.mp3";
    //    private final String songToReproduce = "Lil Nas X - THATS WHAT I WANT.mp3";
    //    private final String songToReproduce = "Entamoeba Histolytica - You Suffer (Napalm Death Cover).mp3";
    //    private final String songToReproduce = "Maluma - Cositas de la USA.mp3";
    private final String path = "C:\\Users\\Milo\\Desktop\\music-library\\";


    //useful classes
    private final HandlePlayback HANDLE = new HandlePlayback();
    private final Display DISPLAY = new Display();

    private final javax.swing.JSlider jSliderMusicBar = new JSlider();
    private final javax.swing.JButton buttonPlayerBackSong = new JButton();
    private final javax.swing.JButton buttonPlayerNextSong = new JButton();
    private final javax.swing.JButton buttonPlayerPlayPause = new JButton();
    private final javax.swing.JButton buttonPlayerRandomMusic = new JButton();
    private final javax.swing.JButton buttonPlayerRepeat = new JButton();

    private final JLabel currentMinute = new JLabel("0:00");
    private final JLabel totalDuration = new JLabel("0:00");

    private final int PROGRESS_BAR_AND_VALUE = 1; //for initialization PROGRESS_BAR_AND_VALUE
    private int actualProgressBar = PROGRESS_BAR_AND_VALUE;

//    private final int lastWidthJSliderMusicBar = 270;

    public PanelPlayerOptions(JPanel cover, JLabel title, JLabel artist) {
        initComponents(cover, title, artist);
    }


    private void initComponents(JPanel cover, JLabel title, JLabel artist) {

//        Configuring text
        setTextSettings(currentMinute);
        setTextSettings(totalDuration);

//        Configuring styles to JSlider

        jSliderMusicBar.setBackground(new Color(24, 24, 24));
        jSliderMusicBar.setUI(new StylesJSliderNormal(actualProgressBar));
        jSliderMusicBar.setModel(new DefaultBoundedRangeModel(1, 0, 0, 100));
        jSliderMusicBar.setMajorTickSpacing(1);
        jSliderMusicBar.setValue(actualProgressBar);


        jSliderMusicBar.addMouseListener(new MouseAdapter() {

            // Styles for when only clicked
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                jSliderMusicBar.setValue(e.getX());
                actualProgressBar = jSliderMusicBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderOver(actualProgressBar);
                        jSliderMusicBar.setUI(toApply);
                    }
                });
            }

            // Styles when mouse is no longer over
            @Override
            public void mouseExited(MouseEvent e) {
                actualProgressBar = jSliderMusicBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderNormal(actualProgressBar);
                        jSliderMusicBar.setUI(toApply);
                    }
                });

            }

            // Styles when mouse is over mouse
            @Override
            public void mouseEntered(MouseEvent e) {
                updateMaxValue(jSliderMusicBar);
                actualProgressBar = jSliderMusicBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderOver(actualProgressBar);
                        jSliderMusicBar.setUI(toApply);
                    }
                });
            }
        });
        jSliderMusicBar.addMouseMotionListener(new MouseAdapter() {

            // Styles are applied each time the mouse is moved while the click is held
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                jSliderMusicBar.setValue(e.getX());
                updateMaxValue(jSliderMusicBar);
                actualProgressBar = jSliderMusicBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderOver(actualProgressBar);
                        jSliderMusicBar.setUI(toApply);
                    }
                });
            }
        });


        //        Configuring buttons

        buttonPlayerRandomMusic.setText("X");
        buttonPlayerBackSong.setText("<");
        buttonPlayerPlayPause.setText("W");
        buttonPlayerNextSong.setText(">");
        buttonPlayerRepeat.setText("O");

        generalButtonStyles(buttonPlayerRandomMusic);
        generalButtonStyles(buttonPlayerBackSong);
        generalButtonStyles(buttonPlayerPlayPause);
        generalButtonStyles(buttonPlayerNextSong);
        generalButtonStyles(buttonPlayerRepeat);


        buttonPlayerBackSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Back song button pressed!");
            }
        });

        buttonPlayerPlayPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                File song = new File(path + songToReproduce);
                if (!isInfoDisplayed) {
                    isInfoDisplayed = true;

                    //Selecting file to use
                    try {
                        DISPLAY.displayInformation(song, cover, title, artist);
                        DISPLAY.displayTime(song, currentMinute, totalDuration);
                    } catch (Exception x) {
                        System.out.println(x);
                    }
                }
                System.out.println();
                HANDLE.manageMusicPlayback(song);
                System.out.println();
            }
        });

        buttonPlayerNextSong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isInfoDisplayed = false;
                HANDLE.stopSong();

                File song = new File(path + songToReproduce2);
                if (!isInfoDisplayed) {
                    isInfoDisplayed = true;

                    //Selecting file to use
                    try {
                        DISPLAY.displayInformation(song, cover, title, artist);
                        DISPLAY.displayTime(song, currentMinute, totalDuration);
                    } catch (Exception x) {
                        System.out.println(x);
                    }
                }
                System.out.println();
                HANDLE.manageMusicPlayback(song);
                System.out.println();

                System.out.println("Next Song Button pressed!");
            }
        });


//        Config of this panel

        GroupLayout panelPlayerOptionsLayout = new GroupLayout(this);
        setLayout(panelPlayerOptionsLayout);
        panelPlayerOptionsLayout.setHorizontalGroup(
                panelPlayerOptionsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelPlayerOptionsLayout.createSequentialGroup()
                                .addGroup(panelPlayerOptionsLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addGroup(GroupLayout.Alignment.CENTER, panelPlayerOptionsLayout.createSequentialGroup()
                                                .addGap(8)
                                                .addComponent(currentMinute)
                                                .addGap(3)
                                                .addComponent(jSliderMusicBar, 240, 240, 529)
                                                .addGap(3)
                                                .addComponent(totalDuration)
                                                .addGap(8)
                                        )
                                        .addGroup(GroupLayout.Alignment.CENTER, panelPlayerOptionsLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                                .addComponent(buttonPlayerRandomMusic, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerBackSong, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerPlayPause, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerNextSong, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerRepeat, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                        )
                                )
                        )
        );

        panelPlayerOptionsLayout.setVerticalGroup(
                panelPlayerOptionsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, panelPlayerOptionsLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelPlayerOptionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonPlayerPlayPause, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonPlayerNextSong)
                                        .addComponent(buttonPlayerBackSong)
                                        .addComponent(buttonPlayerRandomMusic)
                                        .addComponent(buttonPlayerRepeat))
                                .addGroup(panelPlayerOptionsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalDuration, GroupLayout.Alignment.CENTER)
                                        .addComponent(jSliderMusicBar, GroupLayout.Alignment.CENTER)
                                        .addComponent(currentMinute, GroupLayout.Alignment.CENTER)
                                )
                                .addGap(12)
                        )
        );
    }

    /**
     * Method in charge of providing styles to the text of the labels of the duration of the songs
     *
     * @param label to add styles
     */
    private void setTextSettings(JLabel label) {
        label.setFont(new Font("Dialog", 1, 10));
        label.setForeground(new Color(167, 167, 153));
    }

    /**
     * General styles are applied to buttons
     *
     * @param button to add styles
     */
    private void generalButtonStyles(JButton button) {
        button.setFocusable(false);
        button.setFocusPainted(false);
        button.setBorder(new RoundedButtonHelper());
        button.setBackground(new Color(24, 24, 24));
        button.setForeground(Color.white);
    }

//    private void getInfoSlider(JSlider slider) {
//        int width = slider.getWidth();
//        if (lastWidthJSliderMusicBar != width) {
//
//            System.out.println("Tamaño Slider");
//            System.out.println(slider.getWidth());
//            System.out.println();
//            System.out.println("Slider");
//            System.out.println(slider.getValue());
//            int lastValue = slider.getValue();
//            int newMax = slider.getWidth();
//            slider.setValue(newMax);
//            slider.setModel(new DefaultBoundedRangeModel(lastValue, 0, 1, newMax));
//
//        }
//    }


    private void updateMaxValue(JSlider slider) {
        int lastValue = slider.getValue();
        Rectangle trackRect = slider.getBounds();
        int trackRectWidth = trackRect.width;
//        System.out.println("Medida de la barra " +trackRectWidth);

        slider.setModel(new DefaultBoundedRangeModel(lastValue, 0, 1, trackRectWidth));
    }

}
