/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapchuong0;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.layout.Pane;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class MyFrameBt9 extends JFrame {
    Label lb1=new Label("Bài tập 9");
    Label lb2=new Label("Nhập chuỗi :");
    Label lb3=new Label("Nhập số k :");
    Label lb4=new Label("Nhập số n :");
    Label lb5=new Label("Kết quả câu a");
    Label lb6=new Label("Kết quả câu b");
    Label lb7=new Label("Kết quả câu c");
    Label lb8=new Label("Kết quả câu d");
    Label lb9=new Label("Kết quả câu e");
    TextField txt1=new TextField();
    TextField txt2=new TextField();
    TextField txt3=new TextField();
    TextField txt4=new TextField();
    TextField txt5=new TextField();
    TextField txt6=new TextField();
    TextField txt7=new TextField();
    TextField txt8=new TextField();
    TextField txt9=new TextField();
    TextField txt10=new TextField();
    Button bt1=new Button("Kết quả");
    Button bt2=new Button("Thoát");
    Panel p1=new Panel();
    Panel p2=new Panel();
    Panel p3=new Panel();
    Panel p4=new Panel();
    MyFrameBt9()
    {
        setSize(500,700);
        setLayout(new GridLayout(4,1));
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         String s=txt1.getText();
         int a=s.length();
         txt4.setText(String.valueOf(a));
         String s1=s.trim();
         String s2=s1.replaceAll("\\s+"," ");
         String s6=s2;
         txt5.setText(s2);
         int dem=0;String tam="";
         for(int i=0;i<s6.length();i++)
         {
             if(s6.charAt(i)==' ') {dem++;
             }
             
             if(Character.isSpace(s6.charAt(i))) {tam=tam+"/n";}
             else tam=tam+s6.charAt(i);
         }
         if(s6.charAt(0)!=' ') dem++;
         txt6.setText(String.valueOf(dem));
         txt7.setText(tam);
         int k=Integer.parseInt(txt2.getText());
         int n=Integer.parseInt(txt3.getText());
         String s3=s.substring(0,k);
         String s4=s.substring(k,s.length());
         txt8.setText(s3);txt9.setText(s4);
         String s5=s.substring(k,s.length()-(s.length()-n)+k);
         txt10.setText(s5);
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         System.exit(0);
            }
        });
        p1.setBackground(Color.red);
        p1.add(lb1);
        p2.setLayout(new GridLayout(6,2));
        p2.add(lb2);p2.add(txt1);
        p2.add(lb3);p2.add(txt2);
        p2.add(lb4);p2.add(txt3);
        p2.add(lb5);p2.add(txt4);
        p2.add(lb6);p2.add(txt5);
        p2.add(lb9);p2.add(txt10);
        p3.setLayout(new GridLayout(2,3));
        p3.add(lb7);p3.add(txt6);p3.add(txt7);
        p3.add(lb8);p3.add(txt8);p3.add(txt9);
        p4.add(bt1);p4.add(bt2);
        add(p1);add(p2);add(p3);add(p4);
    }
}
