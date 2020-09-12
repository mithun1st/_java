
package graphics1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class cls extends Frame{
    cls(){
        this.setSize(600,400);
        this.setLocationRelativeTo(this);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(3);
            }
            
        });
    }
    
    
    public void paint(Graphics g){
        g.drawLine(200, 200,201,201);
        g.setColor(Color.yellow);
        g.fillOval(100,100,3,3);
        g.setColor(Color.red);
        g.fillOval(200,200,100,100);
        
    }
    
    
    public static void main(String[] args) {
        new cls();
    }
}
