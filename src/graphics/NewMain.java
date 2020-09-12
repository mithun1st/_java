package graphics;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class NewMain extends JFrame implements KeyListener{
    
    public NewMain(){
        this.addKeyListener(this);
        this.setTitle("Graphics Frame...");
        this.setBounds(300,100,800,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);      
    }
    
    
    public void paint(Graphics g){  
        g.setColor(Color.green);
        g.fillOval(100, 100, 100, 100);
        g.setColor(Color.red);
        g.fillRect(300, 300, 100, 100);
        g.setColor(Color.blue);
        g.drawLine(200, 100,500, 400);
        g.drawOval(200, 200, 200, 200);
        
    }
    
    

    public void keyTyped(KeyEvent ke) {
    }

    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_SPACE){
            System.out.println("Space");
        }
    }

    public void keyReleased(KeyEvent ke) {
    }
    

    public static void main(String[] args) {
        new NewMain();
        //cls o = new cls();
     
    }
}
