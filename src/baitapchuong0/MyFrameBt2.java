/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.chuong.pkg0.java;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class MyFrameBt2 extends JFrame{
    Label lb1= new Label("Bài tập 2");
    Label lb2=new Label("Chiều dài :");
    Label lb3=new Label("Chiều rộng :");
    Label lb4= new Label("Chu vi :");
    Label lb5=new Label("Diện tích :");
    TextField txt1 =new TextField();
    TextField txt2 =new TextField();
    TextField txt3 =new TextField();
    TextField txt4 =new TextField();
    Panel p1=new Panel();
    Panel p2=new Panel();
    Panel p3=new Panel();
    Button bt1=new Button("Kết quả");
    Button bt2=new Button("Thoát");
    MyFrameBt2()
    {
        setSize(400,500);
        setLayout(new GridLayout(3,1));
        p1.setBackground(Color.BLUE);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int a= Integer.parseInt(txt1.getText());
            int b= Integer.parseInt(txt2.getText());
            txt4.setText(String.valueOf(a*b));
            txt3.setText(String.valueOf((a+b)*2));
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        p2.setLayout(new GridLayout(4,2));
        p1.add(lb1);p2.add(lb2);p2.add(txt1);
        p2.add(lb3);p2.add(txt2);p2.add(lb4);p2.add(txt3);
        p2.add(lb5);p2.add(txt4);p3.add(bt1);p3.add(bt2);
        add(p1);add(p2);add(p3);
    }
}
