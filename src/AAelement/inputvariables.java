package AAelement;

import java.util.Scanner;
public class inputvariables {

    public static void main(String[] args) {
        
        final int const1=10;
      int a;
      float b;
      double c;
      char d;
      String e;

      Scanner scn=new Scanner(System.in);
      
      System.out.println("entet a integer number");
      a=scn.nextInt();
      System.out.println("Enter a float number");
      b=scn.nextFloat();
      System.out.println("Enter a double number");
      c=scn.nextDouble();
      System.out.println("Enter a char");
      d=scn.next().charAt(0);
      
      Scanner scn1=new Scanner(System.in);
      System.out.println("Enter a string");
      e=scn1.nextLine();
      
      System.out.println("The result\na= "+a+"\tb= "+b+"\tc= "+c);
      System.out.println("d= "+d+"\te= "+e);
    }
}