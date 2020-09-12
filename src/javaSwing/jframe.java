package javaSwing;

import javax.swing.*;
import java.awt.*;

public class jframe {

    public static void main(String[] args) {
        
        //frame
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(3);
        f.setSize(400, 500);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        
        
        //frame panel 
        JPanel p=new JPanel();
        p.setLayout(null);
        p.setBackground(Color.DARK_GRAY);
        f.add(p);
        
        //panel
        JPanel p1=new JPanel();
        p1.setBackground(Color.yellow);
        p1.setLocation(200,300);
        p1.setSize(80,100);
        p.add(p1);
    }

}
