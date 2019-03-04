/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt.chuong.pkg0.java;

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
public class MyFrameBt8 extends JFrame{
    Label lb1=new Label("Bài tập 8");
    Label lb2=new Label("Nhập số n");
    Label lb3=new Label("Nhập mảng");
    Label lb4=new Label("Kết quả câu a");
    Label lb5=new Label("kết quả câu b");
    Label lb6=new Label("kết quả câu c");
    Label lb7=new Label("kết quả câu d");
    Label lb8=new Label("nhập giá trị cần thêm");
    Label lb9=new Label("nhập vị trí cần xóa");
    Label lb10=new Label("Nhập giá trị cần tìm");
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
    TextField txt11=new TextField();
    TextField txt12=new TextField();
    TextField txt13=new TextField();
    TextField txt14=new TextField();
    Panel p1=new Panel();
    Panel p2=new Panel();
    Panel p3=new Panel();
    Panel p4=new Panel();
    Panel p5=new Panel();
    Button bt1=new Button("kết quả");
    Button bt2=new Button("thêm");
    Button bt3=new Button("xóa");
    Button bt4=new Button("tìm kiếm");
    Button bt5=new Button("thoát");
    MyFrameBt8()
    {
        setSize(700,800);
        setLayout(new GridLayout(5,1));
        p1.setBackground(Color.red);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        int a=Integer.parseInt(txt1.getText());
        String arr[]; arr=new String [a];
        arr=txt2.getText().split(" ");
        String ca="",cb="",cc="",cd="";
        int sa=0,sb=0,sc=0,sd=0;
        for(int i=0;i<arr.length;i++)
        {   int t=Integer.parseInt(arr[i]);
            ca=ca+t+" ";sa=sa+t;
            if(t%2==0) {cb=cb+t+" ";sb=sb+t;}
            else {cc=cc+t+" ";sc=sc+t;}
            if(ktng(t)==1) {cd=cd+t+" ";sd=sd+t;}
        }
        txt6.setText(ca);txt7.setText(String.valueOf(sa));
        txt8.setText(cb);txt9.setText(String.valueOf(sb));
        txt10.setText(cc);txt11.setText(String.valueOf(sc));
        txt12.setText(cd);txt13.setText(String.valueOf(sd));
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         String arr[]=txt2.getText().split(" ");
         String t=txt3.getText();
         String t1="";
         for(int i=0;i<arr.length;i++)
         {
             t1=t1+arr[i]+" ";
         }
         txt14.setText(t1+t);
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         int t=Integer.parseInt(txt4.getText());
         String arr[]=txt2.getText().split(" ");
         String tam="";
         for(int i=0;i<arr.length;i++)
         {
             if(i!=t){tam=tam+arr[i]+" ";}
         }
         txt14.setText(tam);
            }
        });
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         String arr[]=txt2.getText().split(" ");
         int t=Integer.parseInt(txt5.getText());
         int tam=0;
         for(int i=0;i<arr.length;i++)
         {             int tam1=Integer.parseInt(arr[i]);
         if(tam1==t) {tam=i; break;}
         }
         txt14.setText("tìm thấy x tại vị trí "+tam);
            }
        });
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          System.exit(0);
            }
        });
        p1.add(lb1);
        p2.setLayout(new GridLayout(5,2));
        p2.add(lb2);p2.add(txt1);p2.add(lb3);p2.add(txt2);
        p2.add(lb8);p2.add(txt3);p2.add(lb9);p2.add(txt4);
        p2.add(lb10);p2.add(txt5);
        p3.setLayout(new GridLayout(4,3));
        p3.add(lb4);p3.add(txt6);p3.add(txt7);
        p3.add(lb5);p3.add(txt8);p3.add(txt9);
        p3.add(lb6);p3.add(txt10);p3.add(txt11);
        p3.add(lb7);p3.add(txt12);p3.add(txt13);
        txt14.setSize(500,50);
        p4.setLayout(new GridLayout(1,1));
        p4.add(txt14);
        p5.add(bt1);p5.add(bt2);p5.add(bt3);p5.add(bt4);p5.add(bt5);add(p1);
        add(p2);add(p3);add(p4);add(p5);
    }
    public int ktng(int n)
    {if(n<2) return 0;
    for(int i=2;i<=Math.sqrt(n);i++)
        if(n%2==0) return 0;
    return 1;
    }
}
