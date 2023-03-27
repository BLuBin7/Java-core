package com.syntax.TITV.Java81.view;

import com.syntax.TITV.Java81.model.CounterModel;

import javax.swing.*;

/**
 * Created by Binh
 * Date : 3/27/2023 - 8:11 PM
 * Description :
 */
public class CounterView extends JFrame {
    private CounterModel countermodel;

    public CounterView(){
//      tạo 1 obj ngay trong hàm khởi tạo, giúp không cần phải tạo 1 obj ở ngoài hàm main
        this.countermodel = new CounterModel();

//        hàm khởi tạo
        this.init();
    }

    public void init() {
        this.setTitle("Counter");

        this.setSize(300,300);
//        căn giữa
        this.setLocationRelativeTo(null);
    }
}
