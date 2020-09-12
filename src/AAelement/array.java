package AAelement;

import java.util.Scanner;
public class array {

    public static void main(String[] args) {
        int[] num;
        num=new int[5];
        int i;
        Scanner scn = new Scanner(System.in);
        for(i=0;i<5;i++){
            num[i]=scn.nextInt();
        }      
        num[1]=135;
        System.out.println("out put-------:");
        for(int tem : num){
            System.out.print(tem+"\t");
        }
    }

}
