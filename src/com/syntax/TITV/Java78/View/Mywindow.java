package com.syntax.TITV.Java78.View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Binh
 * Date : 3/23/2023 - 9:01 PM
 * Description :
 */

//JFame là 1 abstract class
public class Mywindow extends JFrame {
    public Mywindow()  {

    }

    public void showit() {
        this.setVisible(true);

    }

    public void showit(String tittle){
        this.setTitle(tittle);
    }

    public void showit(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
    }

    public static void main(String[] args) {
//        tính đa hình, trỏ tới địa chỉ của class cha
        JFrame fp = new JFrame("new window");
        fp.show();

//      đương nhiên vẫn có thể multi-thread
        Mywindow mw1 = new Mywindow();
        mw1.showit();

        Mywindow mw2 = new Mywindow();
        mw2.showit("title");

        Mywindow mw3 = new Mywindow();
        mw3.showit("title",300,800);
    }
}
