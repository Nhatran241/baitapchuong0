/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.chuong.pkg0.java;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.Color;
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
public class MyFrameBt5 extends JFrame {
     Label lb1 =new Label("Bài tập 4");
    Label lb2 =new Label("Nhập số N : ");
    Label lb3 =new Label("Kết quả : ");
    TextField txt1=new TextField();
    TextField txt2=new TextField();
    Panel p1=new Panel();
    Panel p2=new Panel();
    Panel p3=new Panel();
    Button bt1=new Button("kết quả");
    Button bt2=new Button("thoát");
    MyFrameBt5()
    {
        setSize(400,500);
        setLayout(new GridLayout(3,1));
        setBackground(Color.BLUE);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         int a=Integer.parseInt(txt1.getText());
         if(a<0) txt2.setText("Đây là số âm .");
         else if(a>0) txt2.setText("Đây là số dương .");
         else txt2.setText("Đây là số 0 .");
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           System.exit(0);
            }
        });
        p2.setLayout(new GridLayout(2,2));
        p1.add(lb1);p2.add(lb2);p2.add(txt1);
        p2.add(lb3);p2.add(txt2);
p3.add(bt1);p3.add(bt2);
add(p1);add(p2);add(p3);
    
}
}
