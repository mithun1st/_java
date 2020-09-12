package AAelement;

import java.util.Scanner;
public class twodimensions {

    public static void main(String[] args) {
        int[][] num = new int [3][5];
        int i, j;
        Scanner sc = new Scanner(System.in);
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                num[i][j] = sc.nextInt();
            }
        }
        
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }

}