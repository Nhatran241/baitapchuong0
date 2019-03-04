/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.chuong.pkg0.java;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
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
public class MyFrameBt1 extends JFrame{
Panel p0 =new Panel();
Panel p1 =new Panel();
Panel p2 =new Panel();
Label lb1=new Label("Bài tập 1");
Label lb2=new Label ("Nhập số A :");
Label lb3=new Label ("Nhập số B :");
Label lb4=new Label ("Tổng :");
Label lb5=new Label ("Hiệu :");
Label lb6=new Label ("Tích :");
Label lb7=new Label ("Thương :");
TextField txt1=new TextField();
TextField txt2=new TextField();
TextField txt3=new TextField();
TextField txt4=new TextField();
TextField txt5=new TextField();
TextField txt6=new TextField();
Button bt1=new Button("kết quả");
Button bt2=new Button("thoát");
MyFrameBt1(){
    setSize(400,700);
    setLayout( new GridLayout(4,1));
    p0.setBackground(Color.BLUE);
    lb1.setFont(new Font("Arial" ,Font.BOLD, 0x14));
    bt1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       int a= Integer.parseInt(txt1.getText());
       int b= Integer.parseInt(txt2.getText());
       txt3.setText(String.valueOf(a+b));
       txt4.setText(String.valueOf(a-b));
       txt5.setText(String.valueOf(a*b));
       txt6.setText(String.valueOf(a*1.0/b));
        }
    });
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
  System.exit(0);
        }
    });
    Panel p3=new Panel();
    p1.setLayout(new GridLayout(2,2));
    p2.setLayout(new GridLayout(4,2));
    p0.add(lb1);p1.add(lb2);p1.add(lb2);p1.add(txt1);
    p1.add(lb3);p1.add(txt2);p2.add(lb4);p2.add(txt3);
    p2.add(lb5);p2.add(txt4);p2.add(lb6);p2.add(txt5);
    p2.add(lb7);p2.add(txt6);
    p3.add(bt1);p3.add(bt2);
    add(p0);    add(p1);    add(p2);    add(p3);
}
}
