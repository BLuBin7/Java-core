package com.syntax.TITV.Java81.controller;

import com.syntax.TITV.Java81.view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Binh
 * Date : 3/29/2023 - 9:29 PM
 * Description :
 */
public class CounterListener implements ActionListener {
    private CounterView ctv ;
    public CounterListener(CounterView ctv) {
        this.ctv = ctv;

    }
    @Override
    public void actionPerformed(ActionEvent e) {

//        tuong tac voi jButton_up and jButton_down
        String src = e.getActionCommand();

        System.out.println("ban da nhan nut : "+src);

    }
}
