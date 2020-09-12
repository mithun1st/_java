package AAelement;


public class threedimensionstring {

    public static void main(String[] args) {
        String[][] st={{"mahadi","hassan","MITHUN"},{"mohidul","hassan","MOIN"}};
        int i,j;
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(st[i][j]+"\t");
            }
            System.out.println("");
        }
    }

}
