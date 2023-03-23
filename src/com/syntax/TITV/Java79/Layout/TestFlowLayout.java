package com.syntax.TITV.Java79.Layout;

import com.syntax.TITV.Java79.JComponent.JavaButton;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Binh
 * Date : 3/23/2023 - 10:28 PM
 * Description :
 */
public class TestFlowLayout extends JFrame {
    public TestFlowLayout() {
        this.setTitle("FlowLayout");
        this.setSize(600,400);
//        nếu bằng null thì sẽ tự căn giữa cửa sổ chương trình
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

//        Set Layout
        FlowLayout fl1 = new FlowLayout();
        FlowLayout fl2 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout fl3 = new FlowLayout(FlowLayout.CENTER,10, 10);

//        Set Button
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");


//        add Component
        this.add(btn1);
        this.add(btn2);
        this.add(btn3);




        JButton in = new JButton("ok");
        for(int i =1;i<=4;i++){
            for (int j=1; j<=4;j++) {
                in.setPreferredSize(new Dimension(100,100));
                this.add(in);
        }
        }


        JButton out = new JButton("Cancel");
        for(int i =1;i<=4;i++){
            for (int j=1; j<=4;j++) {
                out.setPreferredSize(new Dimension(100,100));
                this.add(out);
            }
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {

        new TestFlowLayout();


        JFrame frame = new JFrame("Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new GridLayout(4,4));


        JPanel secondPanel = new JPanel();

        JButton jButton = new JButton("hi");

        secondPanel.setLayout(new GridLayout(5,14));
        for(int i = 1; i<=5; i++){
            for (int j = 1; j <= 13; j++) {
                jButton.setPreferredSize(new Dimension(40,40));
                secondPanel.add(jButton);
            }
        }

        main.add(firstPanel);
        main.add(secondPanel);
        frame.add(main);

        frame.setSize(400,400);
        frame.setVisible(true);

    }
}
