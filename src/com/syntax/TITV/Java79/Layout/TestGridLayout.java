package com.syntax.TITV.Java79.Layout;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Binh
 * Date : 3/23/2023 - 10:33 PM
 * Description :
 */
public class TestGridLayout {
    public TestGridLayout() {
        Frame f = new Frame("GridLayout");
        f.setSize(200,100);

//        set row and col for Layout
        f.setLayout(new GridLayout(3,3,10,10));
        f.add(new Button("1"));

//        create 0 jbutton
        for (int i = 0; i < 10; i++) {
            f.add(new JButton(i + ""));
        }




        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TestGridLayout();
    }
}
