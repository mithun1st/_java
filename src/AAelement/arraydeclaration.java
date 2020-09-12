package AAelement;


public class arraydeclaration {

    public static void main(String[] args) {
        String[][] str = {{"aa","bb","cc"},{"dd","ee","ff"}};
        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(str[i][j]+" ");
            }
            System.out.println();
        }
    }

}
