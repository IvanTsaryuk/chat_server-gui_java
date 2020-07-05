package homework;

import javax.swing.*;
import java.awt.*;

public class FontStyle extends JComponent {
    String s;
    Font f;
    Color c;

    public FontStyle(String s, Font f, Color c) {
        this.f = f;
        this.c = c;
        this.s = s;
    }

    public void paintComponent(Graphics g) {
        g.setFont(f);
        g.setColor(c);
        g.drawString(s, 0, getHeight() / 2);
    }
}