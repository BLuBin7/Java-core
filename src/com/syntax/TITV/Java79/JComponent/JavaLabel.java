package com.syntax.TITV.Java79.JComponent;

import javax.swing.*;

/**
 * Created by Binh
 * Date : 3/23/2023 - 10:17 PM
 * Description : JavaLabel extends from JLabel
 */
public class JavaLabel extends JLabel {
    public static void main(String[] args){
        JLabel lb =new JLabel("hello world");

        lb.show();
        lb.getIcon();
        System.out.println(lb.getText());
        lb.setVisible(true);

    }
}
