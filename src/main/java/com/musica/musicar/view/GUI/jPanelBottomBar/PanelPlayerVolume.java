package com.musica.musicar.view.GUI.jPanelBottomBar;

import com.musica.musicar.styles.StylesJSliderNormal;
import com.musica.musicar.styles.StylesJSliderOver;

import javax.swing.*;
import javax.swing.plaf.SliderUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPlayerVolume extends JPanel {


    private final javax.swing.JSlider jSliderVolumeBar = new javax.swing.JSlider();

    private final JButton volumeSwitcher = new JButton("<)");
    private final JButton devicesPlaying = new JButton("[0]");
    private final JButton playQueue = new JButton("|||");
    private final JButton lyricsButton = new JButton("/°");

    private final int progressBarAndValue = 1; //for initialization
    private int actualProgressBar = progressBarAndValue;

    public PanelPlayerVolume() {
        initComponents();
    }

    private void initComponents() {

//        Configuring buttons

        buttonConfiguration(volumeSwitcher);
        buttonConfiguration(devicesPlaying);
        buttonConfiguration(playQueue);
        buttonConfiguration(lyricsButton);

//        Configuring styles to JSlider min 0 - max 77

        jSliderVolumeBar.setBackground(new Color(24, 24, 24));
        jSliderVolumeBar.setUI(new StylesJSliderNormal(actualProgressBar));
        jSliderVolumeBar.setModel(new DefaultBoundedRangeModel(1, 0, 0, 77));
        jSliderVolumeBar.setMajorTickSpacing(1);
        jSliderVolumeBar.setValue(progressBarAndValue);

        jSliderVolumeBar.addMouseListener(new MouseAdapter() {

            // Styles for when only clicked
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                jSliderVolumeBar.setValue(e.getX() - 5);
                actualProgressBar = jSliderVolumeBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderOver(actualProgressBar);
                        jSliderVolumeBar.setUI(toApply);
                    }
                });
            }

            // Styles when mouse is no longer over
            @Override
            public void mouseExited(MouseEvent e) {
                actualProgressBar = jSliderVolumeBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderNormal(actualProgressBar);
                        jSliderVolumeBar.setUI(toApply);
                    }
                });
            }

            // Styles when mouse is over mouse
            @Override
            public void mouseEntered(MouseEvent e) {
                actualProgressBar = jSliderVolumeBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderOver(actualProgressBar);
                        jSliderVolumeBar.setUI(toApply);
                    }
                });
            }
        });
        jSliderVolumeBar.addMouseMotionListener(new MouseAdapter() {

            // Styles are applied each time the mouse is moved while the click is held
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                jSliderVolumeBar.setValue(e.getX() - 5);
                actualProgressBar = jSliderVolumeBar.getValue();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        SliderUI toApply = new StylesJSliderOver(actualProgressBar);
                        jSliderVolumeBar.setUI(toApply);
                    }
                });
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
