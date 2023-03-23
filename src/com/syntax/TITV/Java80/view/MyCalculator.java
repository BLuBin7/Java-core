package com.syntax.TITV.Java80.view;

import com.syntax.jmasterCoBan.Java50.SimpleCalculator;

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


//       L&F: Look and Fell
        JTextField jtext = new JTextField(50);
//        create onr container JPanel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jtext, BorderLayout.CENTER);





        JPanel jPanel_btn = new JPanel();
        jPanel_btn.setLayout(new GridLayout(5,3));
//        add button into container JPanel
        for (int i = 0; i < 10;i++) {
            jPanel_btn.add(new JButton(i + ""));
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MyCalculator();
    }
}
