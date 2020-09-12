package import1;

import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class NewMain {

    public static void main(String[] args) {
        
        System.out.println(""+Math.pow(3, 2));
        System.out.println(""+Math.sqrt(49));
        
        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        double b=sc.nextDouble();
//        String str=sc.nextLine();
        
        DecimalFormat df=new DecimalFormat("#,##.##");
        System.out.println(""+df.format(1234.112233));
        
        JOptionPane.showMessageDialog(null,"Check");
    }

}
