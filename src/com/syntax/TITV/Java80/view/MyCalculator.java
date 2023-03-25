package com.syntax.TITV.Java80.view;

import com.syntax.jmasterCoBan.Java50.SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

/**
 * Created by Binh
 * Date : 3/23/2023 - 11:36 PM
 * Description :
 */
public class MyCalculator extends JFrame {


    public MyCalculator() {
        this.setTitle("Test");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       L&F: Look and Fell
        JTextField jtext = new JTextField(50);
//        JPanel là 1 container, nó có thể gom nhóm các object khác lại
        JPanel janel_head = new JPanel();
//        set layout
        janel_head.setLayout(new BorderLayout());
        janel_head.add(jtext,BorderLayout.CENTER);


        JButton j_btn_0 = new JButton("0");
        JButton j_btn_1 = new JButton("1");
        JButton j_btn_2 = new JButton("2");
        JButton j_btn_3 = new JButton("3");
        JButton j_btn_4 = new JButton("4");
        JButton j_btn_5 = new JButton("5");
        JButton j_btn_6 = new JButton("6");
        JButton j_btn_7 = new JButton("7");
        JButton j_btn_8 = new JButton("8");
        JButton j_btn_9 = new JButton("9");
        JButton j_btn_cong = new JButton("+");
        JButton j_btn_tru = new JButton("-");
        JButton j_btn_nhan = new JButton("x");
        JButton j_btn_chia= new JButton(":");
        JButton j_btn_bang= new JButton("=");

//        tạo ra JPanel để chứa các button này
        JPanel jpanel_buttons = new JPanel();
        jpanel_buttons.setLayout(new GridLayout(5,3));

//        thêm nút nhấn
        jpanel_buttons.add(j_btn_0);
        jpanel_buttons.add(j_btn_1);
        jpanel_buttons.add(j_btn_2);
        jpanel_buttons.add(j_btn_3);
        jpanel_buttons.add(j_btn_4);
        jpanel_buttons.add(j_btn_5);
        jpanel_buttons.add(j_btn_6);
        jpanel_buttons.add(j_btn_7);
        jpanel_buttons.add(j_btn_8);
        jpanel_buttons.add(j_btn_9);
        jpanel_buttons.add(j_btn_cong);
        jpanel_buttons.add(j_btn_tru);
        jpanel_buttons.add(j_btn_nhan);
        jpanel_buttons.add(j_btn_chia);
        jpanel_buttons.add(j_btn_bang);

        this.setLayout(new BorderLayout());

//      thêm jpanel_head
        this.add(janel_head,BorderLayout.NORTH);
//      thêm jpanel_button
        this.add(jpanel_buttons, BorderLayout.CENTER);



        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MyCalculator();
    }
}
