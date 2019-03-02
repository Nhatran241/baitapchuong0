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
public class PBai1 extends JPanel implements MouseListener{
    JLabel soa;
    JLabel sob;
    JLabel back;
    JTextField tfa;
    JTextField tfb;
    JButton btntong;
    JButton btnhieu;
    JButton btntich;
    JButton btnthuong;
    JTextField tfkq;
    CallBack callBack;
    public PBai1(CallBack callback){
      this.callBack =callback;
      initData();
      initEvent();
      initUI();
       
    }

    private void initData() {
        back=new JLabel("Back");
        soa= new JLabel("So A");
        sob= new JLabel("So B");
        tfa= new JTextField();
        tfb= new JTextField();
        tfkq= new JTextField();
        tfkq.setEnabled(false);
        Font font1 = new Font("SansSerif", Font.BOLD, 50);
        tfkq.setFont(font1);
        tfkq.setHorizontalAlignment(JTextField.CENTER);
        back.setBounds(20,0,50,40);
        soa.setBounds(20, 20, 50, 50);
        sob.setBounds(20, 90, 50, 50);
        tfa.setBounds(90, 20, 100, 50);
        tfb.setBounds(90, 90, 100, 50);
        tfkq.setBounds(210, 20, 230, 120);
        btntong = new JButton("Tong");
        btntong.setBounds(70,250,100,100);
        btnhieu = new JButton("Hieu");
        btnhieu.setBounds(310,250,100,100);
        btntich = new JButton("Tich");
        btntich.setBounds(70,420,100,100);
        btnthuong = new JButton("Thuong");
        btnthuong.setBounds(310,420,100,100);
        back.setName("back");
        soa.setName("soa");
        sob.setName("sob");
        tfa.setName("tfa");
        tfb.setName("tfb");
        btntong.setName("btntong");
        btnhieu.setName("btnhieu");
        btntich.setName("btntich");
        btnthuong.setName("btnthuong");
    }

    private void initEvent() {
        back.addMouseListener(this);
        soa.addMouseListener(this);
        sob.addMouseListener(this);
        tfa.addMouseListener(this);
        tfb.addMouseListener(this);
        tfkq.addMouseListener(this);
        btntong.addMouseListener(this);
        btnhieu.addMouseListener(this);
        btntich.addMouseListener(this);
        btnthuong.addMouseListener(this);
        
    }

    private void initUI() {
        setBackground(Color.decode("#54ce87"));
        setLayout(null);
        add(back);
        add(soa);
        add(tfa);
        add(sob);
        add(tfb);
        add(tfkq);
        add(btntong);
        add(btnhieu);
        add(btntich);
        add(btnthuong);
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Component temp = me.getComponent();
        System.out.println(temp.getName());
        switch(temp.getName()){
            case "btntong" :{
               tfkq.setText(Integer.parseInt(tfa.getText())+Integer.parseInt(tfb.getText())+"");
               break;
            }
            case "btnhieu" :{
               tfkq.setText(Integer.parseInt(tfa.getText())-Integer.parseInt(tfb.getText())+"");
               break;
            }
            case "btntich" :{
               tfkq.setText(Integer.parseInt(tfa.getText())*Integer.parseInt(tfb.getText())+"");
               break;
            }
            case "btnthuong" :{
               tfkq.setText(Integer.parseInt(tfa.getText())/Integer.parseInt(tfb.getText())+"");
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
