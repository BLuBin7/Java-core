package com.syntax.TITV.Java81.view;

import com.syntax.TITV.Java81.model.CounterModel;

import javax.swing.*;

/**
 * Created by Binh
 * Date : 3/27/2023 - 8:36 PM
 * Description :
 */
public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private  JButton jButton_down;

    private JLabel JLabel_value;

    public CounterView(){
//        khai báo 1 obj trong hàm tạo
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init(){
        this.setTitle("Counter");
        this.setSize(300,300);
//        căn giữa
        this.setLocationRelativeTo(null);
//        cho phép tắt app( tránh chạy ngầm)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton_up = new JButton("Up");
        jButton_down = new JButton("down");
    }
}
