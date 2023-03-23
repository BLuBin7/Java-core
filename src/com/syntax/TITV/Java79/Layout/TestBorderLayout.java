package com.syntax.TITV.Java79.Layout;

import java.awt.*;

/**
 * Created by Binh
 * Date : 3/23/2023 - 10:36 PM
 * Description :
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame f = new Frame("Test BorderLayout");
        f.setSize(200,100);
        f.setLayout(new BorderLayout());
        f.add(new Button("North"),BorderLayout.NORTH);
        f.add(new Button("South"), BorderLayout.SOUTH);
        f.add(new Button("East"), BorderLayout.EAST);
        f.add(new Button("West"), BorderLayout.WEST);
        f.add(new Button("Center"), BorderLayout.CENTER);

        f.setVisible(true);
    }
}
