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
public class PBai2 extends JPanel implements MouseListener{
    JLabel chieudai;
    JLabel chieurong;
    JTextField tfchieudai;
    JTextField tfchieurong;
    JButton btnchuvi;
    JButton btndientich;
    JTextField tfkq;
    JLabel back;
    CallBack callBack;
    public PBai2(CallBack callBack){
      this.callBack =callBack;
      initData();
      initEvent();
      initUI();
       
    }

    private void initData() {
        back=new JLabel("Back");
        back.setBounds(20,0,50,40);
        back.setName("back");
        chieudai= new JLabel("Chieu Dai");
        chieurong= new JLabel("Chieu Rong");
        tfchieudai= new JTextField();
        tfchieurong= new JTextField();
        tfkq= new JTextField();
        tfkq.setEnabled(false);
        Font font1 = new Font("SansSerif", Font.BOLD, 50);
        tfkq.setFont(font1);
        tfkq.setHorizontalAlignment(JTextField.CENTER);
        chieudai.setBounds(20, 20, 50, 50);
        chieurong.setBounds(20, 90, 50, 50);
        tfchieudai.setBounds(90, 20, 100, 50);
        tfchieurong.setBounds(90, 90, 100, 50);
        tfkq.setBounds(210, 20, 230, 120);
        btnchuvi = new JButton("Chu Vi");
        btnchuvi.setBounds(70,250,100,100);
        btndientich = new JButton("Dien Tich");
        btndientich.setBounds(310,250,100,100);
        back.setName("back");
        chieudai.setName("soa");
        chieurong.setName("sob");
        tfchieudai.setName("tfa");
        tfchieurong.setName("tfb");
        btnchuvi.setName("btnchuvi");
        btndientich.setName("btndientich");
    }

    private void initEvent() {
        back.addMouseListener(this);
        chieudai.addMouseListener(this);
        chieurong.addMouseListener(this);
        tfchieudai.addMouseListener(this);
        tfchieurong.addMouseListener(this);
        tfkq.addMouseListener(this);
        btnchuvi.addMouseListener(this);
        btndientich.addMouseListener(this);
        
    }

    private void initUI() {
        setBackground(Color.decode("#54ce87"));
        setLayout(null);
        add(back);
        add(chieudai);
        add(tfchieudai);
        add(chieurong);
        add(tfchieurong);
        add(tfkq);
        add(btnchuvi);
        add(btndientich);
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Component temp = me.getComponent();
        System.out.println(temp.getName());
        switch(temp.getName()){
            case "btnchuvi" :{
               tfkq.setText((Integer.parseInt(tfchieudai.getText())+Integer.parseInt(tfchieurong.getText()))*2+"");
               break;
            }
            case "btndientich" :{
               tfkq.setText(Integer.parseInt(tfchieudai.getText())*Integer.parseInt(tfchieurong.getText())+"");
               break;
            }
            case "back" :{
                callBack.onBack();
               break;
            }
           
        }
        
     }

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
