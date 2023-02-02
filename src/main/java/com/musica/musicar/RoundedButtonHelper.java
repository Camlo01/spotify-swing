package com.musica.musicar;

import javax.swing.border.AbstractBorder;
import java.awt.*;

public class RoundedButtonHelper extends AbstractBorder {

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.black);
        g.drawRoundRect(x, y, width - 1, height - 1, 20, 20);
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(3, 3, 3, 3);
    }

    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.top = insets.right = insets.bottom = 3;
        return insets;
    }
}
