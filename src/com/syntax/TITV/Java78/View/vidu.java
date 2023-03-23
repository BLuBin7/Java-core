package com.syntax.TITV.Java78.View;

import javax.swing.*;

/**
 * Created by Binh
 * Date : 3/23/2023 - 6:58 PM
 * Description :
 */
public class vidu {
    public static void main(String[] args) {
        JFrame fp = new JFrame("hello");
        fp.setSize(600,400);

//        hiển thị cửa sổ tại 1 vị trí nhất định trên màn hình
        fp.setLocation(500,250);

//        thoát ra khỏi chương trình khi đóng cửa sổ
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        cho phép hiển thị, luôn nên đặt ở cuối
        fp.setVisible(true);
    }
}
