/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelGame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Mahadi Hassan
 */
public class c extends JFrame{
    JPanel ob = new JPanel();
    
    c(){
        this.setTitle("main");
        this.setSize(400,600);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        JPanel p = new JPanel();
        p.setBackground(Color.blue);
        p.setLayout(null);
        this.add(p);
        
        
        ob.setBackground(Color.WHITE);
        ob.setSize(20,20);
        ob.setLocation(40,40);
        p.add(ob);
   
    }
    
    void fn(){
       
        Thread t= new Thread(){
        public void run(){
            for (;;) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                }
                ob.setLocation(200,ob.getLocation().y+10);
            }
        }
    };
    t.start();
        
    }
    
}
