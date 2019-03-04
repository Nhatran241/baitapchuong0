/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapchuong0;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author trann
 */
public class PMain extends JPanel implements MouseListener{
    JButton btnbai1; 
    JButton btnbai2; 
    JButton btnbai3; 
    JButton btnbai4; 
    JButton btnbai5; 
    JButton btnbai6; 
    JButton btnbai7; 
    JButton btnbai8; 
    JButton btnbai9;
    CallBack callBack;

    public PMain(CallBack callBack) {
      this.callBack=callBack;
      intitData();
      intitUI();
      intitEvent();
    }

    private void intitUI() {
        setLayout(new GridLayout(9, 1));
      add(btnbai1);
      add(btnbai2);
      add(btnbai3);
      add(btnbai4);
      add(btnbai5);
      add(btnbai6);
      add(btnbai7);
      add(btnbai8);
      add(btnbai9); }

    private void intitEvent() {
    
      btnbai1.addMouseListener(this);
      btnbai2.addMouseListener(this);
      btnbai3.addMouseListener(this);
      btnbai4.addMouseListener(this);
      btnbai5.addMouseListener(this);
      btnbai6.addMouseListener(this);
      btnbai7.addMouseListener(this);
      btnbai8.addMouseListener(this);
      btnbai9.addMouseListener(this);  }

    private void intitData() {
     
      btnbai1=new JButton("Bai 1");
      btnbai2=new JButton("Bai 2");
      btnbai3=new JButton("Bai 3");
      btnbai4=new JButton("Bai 4");
      btnbai5=new JButton("Bai 5");
      btnbai6=new JButton("Bai 6");
      btnbai7=new JButton("Bai 7");
      btnbai8=new JButton("Bai 8");
      btnbai9=new JButton("Bai 9"); }

    @Override
    public void mouseClicked(MouseEvent me) {
      JButton temp =(JButton) me.getComponent();
                System.out.println(""+temp.getText());   
                switch(temp.getText()){
                    case "Bai 1":{
                        callBack.onChoosePanel(new PBai1(callBack));
                        break;
                    }
                    case "Bai 2":{
                        callBack.onChoosePanel(new PBai2(callBack));
                        break;
                    }
                     case "Bai 9":{
                        callBack.onChoosePanel(new PBai9(callBack));
                        break;
                    }
                } }

    @Override
    public void mousePressed(MouseEvent me) {
     }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    
}
