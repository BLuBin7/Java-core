package com.syntax.TITV.Java81.view;

import com.syntax.TITV.Java81.controller.CounterListener;
import com.syntax.TITV.Java81.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Binh
 * Date : 3/28/2023 - 8:36 PM
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

        ActionListener ac = new CounterListener(this);

//       xu ly viec nhan nut cua jButton_up
        jButton_up = new JButton("Up");
        jButton_up.addActionListener(ac);

//        xu ly viec nhan nut cua jButton_down
        jButton_down = new JButton("Down");
        jButton_down.addActionListener(ac);

//        Label chỉ nhận vào text, nhưng value lại là int, nên phải cộng ""
        JLabel_value = new JLabel(this.counterModel.getValue()+"",JLabel.CENTER);

        JPanel jpanel = new JPanel();
        jpanel.setLayout(new BorderLayout());
        jpanel.add(jButton_up, BorderLayout.WEST);
        jpanel.add(JLabel_value, BorderLayout.CENTER );
        jpanel.add(jButton_down, BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(jpanel, BorderLayout.CENTER);
    }
}
