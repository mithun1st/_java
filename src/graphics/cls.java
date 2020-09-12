package graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class cls extends JFrame{
    
    public cls(){
        setTitle("Graphics Frame...");
        setBounds(300,100,800,500);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 220, 120);
        System.out.println("cls");
    }
}