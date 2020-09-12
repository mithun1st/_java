package AAelement;

import java.util.Scanner;
public class BasicComponent{
    public static void main(String[] args){
        String s1="miTHun",s2;
        boolean bl;
        Scanner sc;
        sc=new Scanner (System.in);
        s2=sc.nextLine();
        bl=s1.equals(s2);
        if(bl==true){
        System.out.println("Match password");
        }
        else{
            System.out.println("Wrong password");
        }
    }
}