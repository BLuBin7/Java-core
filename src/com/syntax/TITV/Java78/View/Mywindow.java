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

    public void show() {
        this.setVisible(true);

    }

    public void show(String tittle){
        this.setTitle(tittle);
    }
}
