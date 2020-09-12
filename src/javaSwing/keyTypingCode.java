package javaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class keyTypingCode extends JFrame implements KeyListener{
        
    JLabel l;
    JTextField t;
    
    public keyTypingCode(){
        this.setTitle("title");
        this.setSize(300,200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        t=new JTextField("hi");
        t.setSize(90,20);
        t.setLocation(20,10);
        this.add(t);
        
        l=new JLabel("text");
        l.setSize(80,20);
        l.setLocation(10,10);
        this.add(l);
        
        t.addKeyListener(this);
        
        this.setVisible(true);
        
    }
    
    
    
    public static void main(String[] args) {
        new keyTypingCode();
    }

    
    
    @Override
    public void keyTyped(KeyEvent ke) {
        l.setText(t.getText());
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
