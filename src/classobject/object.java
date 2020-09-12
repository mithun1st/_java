package classobject;

import java.util.Scanner;
public class object {

    public static void main(String[] args) {
        //class declare type of
        cls mahadi;
        cls hassan;
        mahadi=new cls();
        hassan=new cls();
    
        //class declare type of
        cls mithun=new cls();
        
        Scanner sc;
        sc=new Scanner(System.in);
        
        //for mahadi
        System.out.println("Enter salary for mahadi");
        mahadi.salary=sc.nextInt();
        System.out.println("Enter bonous for mahadi");
        mahadi.bonous=sc.nextDouble();
        mahadi.pay();
        
        //for mithun
        System.out.println("Enter salary for mithun:");
        mithun.salary=sc.nextInt();
        System.out.println("Enter bonous:");
        mithun.bonous=sc.nextDouble();
        mithun.pay();
        
    }

}
