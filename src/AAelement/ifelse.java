package AAelement;

import java.util.Scanner;
public class ifelse {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if (n>0){
            System.out.println("This is a Positive Number: "+n);
        }
        else if (n<0){
            System.out.println("This is a Negative Number: "+ n);
        }
        else{
            System.out.println("This value is ZERO");
        }
    }

}
