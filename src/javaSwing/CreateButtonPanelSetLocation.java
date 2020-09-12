package javaSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class CreateButtonPanelSetLocation  {

    public static void main(String[] args) {
        
        JFrame f= new JFrame();
        f.setSize(600,400);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.ORANGE);
        f.add(p);
        
        JPanel[] s =new JPanel[10];
        s[0]=new JPanel();
        s[0].setBackground(Color.BLUE);
        s[0].setLocation(20, 20);
        s[0].setSize(200, 150);
        p.add(s[0]);  
        
        JButton b=new JButton("click");
        b.setSize(80,40);
        b.setBackground(Color.RED);
        b.setLocation(500,80);
        p.add(b);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                s[0].setBackground(Color.BLACK);
                p.setBackground(Color.orange);
            }
        });
        
    }

  
}
