/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapchuong0;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author trann
 */
public class FMain extends JFrame implements CallBack{
   
    JPanel pmain;
    Container contentPane;
    public FMain(){
      initData();
      initEvent();
      initUI();

    }

    private void initUI() {
      setVisible(true);
      setSize(480, 600);
      getContentPane().add(new PMain(this));
    }

    private void initData() { 
       setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }
    private void initEvent() {
    }


    @Override
    public void onBack() {
        getContentPane().removeAll();
                        add(new PMain(this));
                        getContentPane().invalidate();
                        getContentPane().validate();
    }

    @Override
    public void onChoosePanel(JPanel panel) {
        getContentPane().removeAll();
                        add(panel);
                        getContentPane().invalidate();
                        getContentPane().validate();
     }
 
  
   
}
