package homework;

import javax.swing.*;
import java.awt.*;

public class Styles extends JFrame {


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font f = new Font("Serif", Font.BOLD, 15);
        String s = "Я не знаю пока как прикрутить это в чат";
        Color c = Color.RED;
        FontStyle fs = new FontStyle(s, f, c);

        frame.add(fs);
        frame.setSize(300,100);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}

