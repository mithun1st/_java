/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mahadi Hassan
 */
public class cls extends JFrame implements KeyListener,ActionListener{
    
    
    private int i=100,i1=100,j=110,j1=110;
    JPanel p=new JPanel();
    boolean t=true;
    
    cls(){
        this.addKeyListener(this);
        
        this.setSize(800,600);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        //panel setting
//        p.setLayout(null);
//        p.setBackground(Color.blue);
//        this.add(p);
    }
    
    public void paint(Graphics g){

        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.YELLOW);
        g.drawLine(i,i1, j, j1);
    }
    
    
    
    public static void main(String[] args) {
        new cls();
    }
    
    

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_UP){
            i=200;
            i1=200;
            j=240;
            j1=240;
            repaint();
            System.out.println(""+i);
        }
        if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            i=100;
            i1=100;
            j=140;
            j1=140;
            repaint();
            System.out.println(""+i);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
