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
public class PBai9 extends JPanel implements MouseListener{
    JLabel soa;
    JLabel sok;
    JLabel son;
    JLabel back;
    JTextField tfa;
    JTextField tfk;
    JTextField tfn;
    JButton btnketqua;
    JTextField tfkq;
    CallBack callBack;
    public PBai9(CallBack callback){
      this.callBack =callback;
      initData();
      initEvent();
      initUI();
       
    }

    private void initData() {
        back=new JLabel("Back");
        soa= new JLabel("Nhap Chuoi");
        sok= new JLabel("Nhap K");
        son= new JLabel("Nhap N");
        tfa= new JTextField();
        tfk= new JTextField();
        tfn= new JTextField();
        tfkq= new JTextField();
        tfkq.setEnabled(false);
        Font font1 = new Font("SansSerif", Font.BOLD, 10);
        tfkq.setFont(font1);
        tfkq.setHorizontalAlignment(JTextField.CENTER);
        back.setBounds(20,0,50,40);
        soa.setBounds(20, 20, 200, 50);
        tfa.setBounds(220, 20, 220, 50);
        
        sok.setBounds(20, 70, 200, 50);
        tfk.setBounds(220, 70, 220, 50);
        
        son.setBounds(20, 120, 200, 50);
        tfn.setBounds(220, 120, 220, 50);
        
        tfkq.setBounds(20, 180, 420, 120);
        btnketqua = new JButton("ketqua");
        btnketqua.setBounds(190,440,100,100);
        back.setName("back");
        soa.setName("soa");
        tfa.setName("tfa");
        btnketqua.setName("ketqua");
    }

    private void initEvent() {
        back.addMouseListener(this);
        soa.addMouseListener(this);
        tfa.addMouseListener(this);
        tfkq.addMouseListener(this);
        btnketqua.addMouseListener(this);
        
    }

    private void initUI() {
        setBackground(Color.decode("#54ce87"));
        setLayout(null);
        add(back);
        add(soa);
        add(tfa);
        add(sok);
        add(tfk);
        add(son);
        add(tfn);
        add(tfkq);
        add(btnketqua);
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Component temp = me.getComponent();
        System.out.println(temp.getName());
        switch(temp.getName()){
            case "ketqua" :{
                int dem=0;
      
             String after =tfa.getText().trim().replaceAll(" +", " ");
             for(int i=0;i<after.length();i++){
                    if(tfa.getText().charAt(i)==' ') {
                        dem++;
                }  
            
             }
             String kleft=after.substring(0,Integer.parseInt(tfk.getText().trim().toString()));
             String kright=after.substring(Integer.parseInt(tfk.getText().trim().toString()),after.length());
             String nk=after.substring(Integer.parseInt(tfk.getText().trim().toString()),after.length()
                     -(after.length()-Integer.parseInt(tfn.getText().trim().toString()))+Integer.parseInt(tfk.getText().trim().toString()));


                tfkq.setText("Do dai cua chuoi : "+tfa.getText().length()+"\n"+
                            after+"so luong :"+dem+"ben trai"+kleft+"ben phai"+kright+"n"+nk
                );
                
//               tfkq.setText(Integer.parseInt(tfa.getText())+Integer.parseInt(tfb.getText())+"");
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