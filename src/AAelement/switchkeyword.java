package AAelement;

import java.util.Scanner;
public class switchkeyword {

    public static void main(String[] args) {
        int s;
        Scanner sc=new Scanner (System.in);
        s=sc.nextInt();
        //s/=2;
        switch(s/10){
            case 10:
                System.out.println("Great");
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("A-");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            default:
            {
                System.out.println("Error");
            }
        }       
    }

}
