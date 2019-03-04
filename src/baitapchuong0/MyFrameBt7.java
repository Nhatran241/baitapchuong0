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
public class MyFrameBt7 extends JFrame{
Label lb1=new Label("Bài tập 7");
Label lb2=new Label("Nhập số tự nhiên N :");
Label lb3=new Label("Kết quả câu a");
Label lb4=new Label("Kết quả câu b");
Label lb5=new Label("Kết quả câu c");
Label lb6=new Label("Kết quả câu d");
Label lb7=new Label("Kết quả câu e");
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
Panel p1=new Panel();
Panel p2=new Panel();
Panel p3=new Panel();
Panel p4=new Panel();
Panel p5=new Panel();
Button bt1=new Button("Kết quả");
Button bt2=new Button("Thoát");
MyFrameBt7()
{
    setLayout(new GridLayout(5,1));
    setSize(700,800);
    p1.setBackground(Color.BLUE);
    bt1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        String ca="",cb="",cc="",cd="",ce="";
        int n=Integer.parseInt(txt1.getText());
        int sa=0,sb=0,sc=0,sd=0;
        for(int i=1;i<=n;i++)
        {
        ca=ca+" "+i;sa=sa+i;
        if(i%2==0) {cb=cb+" "+i;sb=sb+i;}
        else {cc=cc+" "+i;sc=sc+i;}
        if(ktng(i)==1) {cd=cd+" "+i;sd=sd+i;}
        }
        int t=0,t1=1;
        while(t!=n)
        {
            if(ktng(t1)==1) {ce=ce+" "+t1;t++;}
            t1++;
        }
        txt2.setText(ca); txt3.setText(String.valueOf(sa));
        txt4.setText(cb); txt5.setText(String.valueOf(sb));
        txt6.setText(cc); txt7.setText(String.valueOf(sc));
        txt8.setText(cd); txt9.setText(String.valueOf(sd));
        txt10.setText(ce);
        }
        
    });
    bt2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           System.exit(0);
        }
    });
    p1.add(lb1);
    p2.setLayout(new GridLayout(1,2));
    p2.add(lb2);p2.add(txt1);
    p3.setLayout(new GridLayout(4,3));
    p3.add(lb3);p3.add(txt2);p3.add(txt3);
    p3.add(lb4);p3.add(txt4);p3.add(txt5);
    p3.add(lb5);p3.add(txt6);p3.add(txt7);
    p3.add(lb6);p3.add(txt8);p3.add(txt9);
    p4.setLayout(new GridLayout(1,2));
    p4.add(lb7);p4.add(txt10);
    p5.add(bt1);p5.add(bt2);
    add(p1);add(p2);add(p3);add(p4);add(p5);
}
 public int ktng(int n)
    {if(n<2) return 0;
    for(int i=2;i<=Math.sqrt(n);i++)
        if(n%2==0) return 0;
    return 1;
    }
}