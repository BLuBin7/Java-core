package com.syntax.TITV.Java80.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Binh
 * Date : 3/23/2023 - 11:36 PM
 * Description :
 */
public class MyCalculator extends JFrame {
    public MyCalculator() throws HeadlessException {
        this.setTitle("Test");
        this.setSize(300, 600);
        JTextField jtext = new JTextField();

        for (int i = 0; i < 10;i++) {
            this.add(new Button(i + ""));
        }
        this.setLayout(new FlowLayout());


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MyCalculator();
    }
}
