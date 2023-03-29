package com.syntax.TITV.Java81.view;

import com.syntax.TITV.Java81.model.CounterModel;

import javax.swing.*;
import java.awt.*;

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

    /**
     * Instantiates a new Counter view.
     */
    public CounterView(){
//        khai báo 1 obj trong hàm tạo
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    /**
     * Init.
     */
    public void init(){
        this.setTitle("Counter");
        this.setSize(300,300);
//        căn giữa
        this.setLocationRelativeTo(null);//        cho phép tắt app( tránh chạy ngầm)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton_up = new JButton("Up");
        jButton_down = new JButton("Down");
//        Label chỉ nhận vào text, nhưng value lại là int, nên phải cộng ""
        JLabel_value = new JLabel(this.counterModel.getValue()+"");

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jButton_up, BorderLayout.WEST);
    }
}
