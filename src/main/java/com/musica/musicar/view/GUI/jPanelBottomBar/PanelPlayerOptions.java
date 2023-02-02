package com.musica.musicar.view.GUI.jPanelBottomBar;

import com.musica.musicar.RoundedButtonHelper;
import com.musica.musicar.logic.Display;
import com.musica.musicar.logic.reproduction.HandlePlayback;

import javax.swing.*;
import javax.swing.plaf.SliderUI;
import javax.swing.plaf.basic.BasicSliderUI;
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
    private final String song1 = "Aventura - Volví.mp3";
    //    private final String song = "50 Cent - 21 Questions.mp3";
    //    private final String song = "Bad Bunny - Tití Me Preguntó.mp3";
    //    private final String song = "Childish Gambino - Me and Your Mama.mp3";
    //    private final String song2 = "The Weeknd - Is There Someone Else.mp3";
    //    private final String song = "Lil Nas X - THATS WHAT I WANT.mp3";
    //    private final String song = "Entamoeba Histolytica - You Suffer (Napalm Death Cover).mp3";
    //    private final String song = "Maluma - Cositas de la USA.mp3";
    private final String path = "C:\\Users\\Camilo\\Desktop\\music-library\\";


    //useful classes
    private final HandlePlayback HANDLE = new HandlePlayback();
    private final Display DISPLAY = new Display();

    private final javax.swing.JSlider jSliderMusicBar = new JSlider();
    private final javax.swing.JButton buttonPlayerBackSong = new JButton();
    private final javax.swing.JButton buttonPlayerNextSong = new JButton();
    private final javax.swing.JButton buttonPlayerPlayPause = new JButton();
    private final javax.swing.JButton buttonPlayerRandomMusic = new JButton();
    private final javax.swing.JButton buttonPlayerRepeat = new JButton();

    private JLabel currentMinute = new JLabel("0:00");
    private JLabel totalDuration = new JLabel("1:11");

    public PanelPlayerOptions(JPanel cover, JLabel title, JLabel artist) {
        initComponents(cover, title, artist);
    }


    private void initComponents(JPanel cover, JLabel title, JLabel artist) {

//        Configuring text
        setTextSettings(currentMinute);
        setTextSettings(totalDuration);

//        Configuring styles to JSlider
        SliderUI stylesNormal = new BasicSliderUI() {
            @Override
            public void paintFocus(Graphics g) {
            }

            @Override
            public void paintThumb(Graphics g) {
            }

            @Override
            public void paintTrack(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(new Color(94, 94, 94));
                g2d.fillRoundRect(trackRect.x, (trackRect.height / 2), trackRect.width, 4, 10, 10);
            }
        };
        SliderUI stylesOver = new BasicSliderUI() {

            //Override the paint Focus method to remove the dotted border that appears on the JSlideBar
            @Override
            public void paintFocus(Graphics g) {
            }

            //Providing styles on the progress bar button
            public void paintThumb(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.WHITE);
                g2d.fillOval(thumbRect.x, (thumbRect.height / 2) - 3, thumbRect.width, thumbRect.height / 2);

            }

            //providing styles over the bar
            @Override
            public void paintTrack(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(new Color(94, 94, 94));
                g2d.fillRoundRect(trackRect.x, (trackRect.height / 2), trackRect.width, 4, 10, 10);
            }


        };

        jSliderMusicBar.setBackground(new Color(24, 24, 24));
        jSliderMusicBar.setUI(stylesNormal);
        jSliderMusicBar.setModel(new DefaultBoundedRangeModel(1, 0, 0, 100));


        jSliderMusicBar.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                jSliderMusicBar.setUI(stylesOver);
            }
        });
        jSliderMusicBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                jSliderMusicBar.setUI(stylesNormal);
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

                File song = new File(path + song1);
                if (!isInfoDisplayed) {
                    isInfoDisplayed = true;

                    //Selecting file to use
                    try {
                        DISPLAY.displayInformation(song, cover, title, artist);
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                                .addComponent(buttonPlayerRandomMusic, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerBackSong, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerPlayPause, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerNextSong, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonPlayerRepeat, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
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

}
