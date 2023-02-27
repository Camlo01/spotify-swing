package com.musica.musicar.styles;

import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class StylesJSliderNormal extends BasicSliderUI {

    private int widthProgressBar;

    public StylesJSliderNormal(int value) {
        widthProgressBar = value;
    }

    public StylesJSliderNormal() {
        widthProgressBar = 1;
    }

    @Override
    public void paintFocus(Graphics g) {
    }

    @Override
    public void paintTrack(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(new Color(94, 94, 94));
        g2d.fillRoundRect(trackRect.x, (trackRect.height / 2), trackRect.width, 4, 10, 10);

        // paint progress bar
        g2d.setColor(new Color(255, 255, 255));
        g2d.fillRoundRect(trackRect.x, (trackRect.height / 2), Math.min(widthProgressBar, trackRect.width), 4, 10, 10);
    }

    @Override
    public void paintThumb(Graphics g) {
    }


}
