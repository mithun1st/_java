package AAelement;

import java.util.Scanner;

public class tryCatch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //input value without number to check. 
        try{
            int a=sc.nextInt();
            System.out.println(""+a);
        }
        catch(Exception e){
            System.err.println("Code Error");
        }
    }

}
