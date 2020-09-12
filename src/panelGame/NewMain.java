package panelGame;

import javax.swing.JFrame;
import java.util.Scanner;

public class NewMain extends JFrame {
    


    public static void main(String[] args) {
        c ob = new c();
        Scanner sc=new Scanner(System.in);
        
        if(sc.nextInt()==1){
            ob.fn();
        }
    }

}
