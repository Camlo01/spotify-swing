package com.musica.musicar.styles;

import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class StylesJSliderOver extends BasicSliderUI {

    private int widthProgressBar;

    public StylesJSliderOver(int value) {
        widthProgressBar = value;
    }

//    public StylesJSliderOver() {
//        widthProgressBar = 1;
//    }

    //Override the paint Focus method to remove the dotted border that appears on the JSlideBar
    @Override
    public void paintFocus(Graphics g) {
    }

    //providing styles over the bar
    @Override
    public void paintTrack(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(new Color(94, 94, 94));
        g2d.fillRoundRect(trackRect.x, (trackRect.height / 2), trackRect.width, 4, 10, 10);


        // paint progress bar
        g2d.setColor(new Color(29, 185, 84));
        g2d.fillRoundRect(trackRect.x, (trackRect.height / 2), widthProgressBar, 4, 10, 10);
    }

    //Providing styles on the progress bar button
    public void paintThumb(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(
//                Math.min(widthProgressBar, trackRect.width)
                Math.min(widthProgressBar, trackRect.width)
                , (thumbRect.height / 2) - 3, thumbRect.width, thumbRect.height / 2);

    }


}
