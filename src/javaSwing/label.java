package javaSwing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class label {

    public static void main(String[] args) {
                //frame
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(3);
        f.setBounds(400, 100, 400, 500);
        f.setResizable(false);
        f.setVisible(true);
        
        
        //frame panel 
        JPanel p=new JPanel();
        p.setLayout(null);
        p.setBackground(Color.DARK_GRAY);
        f.add(p);
        
        //label
        JLabel l=new JLabel();
        l.setBounds(100, 200, 80, 10);
        l.setForeground(Color.WHITE);
        l.setText("Simpla Text");
        p.add(l);
    }

}
