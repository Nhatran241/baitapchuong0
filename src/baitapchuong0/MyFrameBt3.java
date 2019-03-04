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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

/**
 *
 * @author Administrator
 */
public class MyFrameBt3 extends JFrame{
    Label lb1= new Label("Bài tập 3");
    Label lb2=new Label("Bán kính :");
    Label lb3=new Label("Chu vi :");
    Label lb4= new Label("Diện tích :");
    TextField txt1 =new TextField();
    TextField txt2 =new TextField();
    TextField txt3 =new TextField();
    Panel p1=new Panel();
    Panel p2=new Panel();
    Panel p3=new Panel();
    Button bt1=new Button("Kết quả");
    Button bt2=new Button("Thoát");
    MyFrameBt3()
    {
        setSize(400,500);
        setLayout(new GridLayout(3,1));
        p1.setBackground(Color.BLUE);
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int a= Integer.parseInt(txt1.getText());
            txt2.setText(String.valueOf(a*2*3.14));
            txt3.setText(String.valueOf((a*a)*3.14));
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        p2.setLayout(new GridLayout(3,2));
        p1.add(lb1);p2.add(lb2);p2.add(txt1);
        p2.add(lb3);p2.add(txt2);p2.add(lb4);p2.add(txt3);p3.add(bt1);p3.add(bt2);
        add(p1);add(p2);add(p3);
    }
}


