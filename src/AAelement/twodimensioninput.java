package AAelement;


public class twodimensioninput {

    public static void main(String[] args) {
        int[][] num={{1,2,3},{4,5,6}};
        int i,j;
        
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print("\t"+num[i][j]);
            }
            System.out.println();
        }
    }

}
