package com.musica.musicar.view.GUI.jPanelBottomBar;

import javax.swing.*;
import javax.swing.plaf.SliderUI;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPlayerVolumen extends JPanel {


    private final javax.swing.JSlider jSliderVolumeBar = new javax.swing.JSlider();

    private final JButton volumeSwitcher = new JButton("<)");
    private final JButton devicesPlaying = new JButton("[0]");
    private final JButton playQueue = new JButton("|||");
    private final JButton lyricsButton = new JButton("/°");

    public PanelPlayerVolumen() {
        initComponents();
    }

    private void initComponents() {

//        Configuring buttons

        buttonConfiguration(volumeSwitcher);
        buttonConfiguration(devicesPlaying);
        buttonConfiguration(playQueue);
        buttonConfiguration(lyricsButton);

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


        jSliderVolumeBar.setBackground(new Color(24, 24, 24));
        jSliderVolumeBar.setUI(stylesNormal);

        jSliderVolumeBar.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                jSliderVolumeBar.setUI(stylesOver);
            }
        });
        jSliderVolumeBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                jSliderVolumeBar.setUI(stylesNormal);
            }
        });

//        Config this panel

        javax.swing.GroupLayout panelPlayerVolumeLayout = new javax.swing.GroupLayout(this);
        setLayout(panelPlayerVolumeLayout);
        panelPlayerVolumeLayout.setHorizontalGroup(
                panelPlayerVolumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerVolumeLayout.createSequentialGroup()
                                .addContainerGap(1, Short.MAX_VALUE)
                                .addGap(5)
                                .addComponent(lyricsButton, 25, 25, 25)
                                .addGap(5)
                                .addComponent(playQueue, 25, 25, 25)
                                .addGap(5)
                                .addComponent(devicesPlaying, 25, 25, 25)
                                .addGap(5)
                                .addComponent(volumeSwitcher, 25, 25, 25)
                                .addGap(5)
                                .addComponent(jSliderVolumeBar, 87, 87, 87)
                                .addGap(12)
                        )
        );
        panelPlayerVolumeLayout.setVerticalGroup(
                panelPlayerVolumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPlayerVolumeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGap(26)
                                .addGroup(panelPlayerVolumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jSliderVolumeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(volumeSwitcher, 25, 25, 25)
                                        .addComponent(devicesPlaying, 25, 25, 25)
                                        .addComponent(playQueue, 25, 25, 25)
                                        .addComponent(lyricsButton, 25, 25, 25))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    /**
     * General styles are applied to button entered
     *
     * @param button to add styles
     */
    private void buttonConfiguration(JButton button) {
        button.setFont(new Font("Dialog", 1, 4));
        button.setBackground(new Color(24, 24, 24));
        button.setForeground(Color.white);
        button.setPreferredSize(new Dimension(10, 10));

    }

}
