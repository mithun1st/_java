package AAelement;


public class loop {

    public static void main(String[] args) {
        int i,j;
        for (i=0;i<=20;i++){
            if (i==16){
                continue;
            }
            if (i%2==0){
                System.out.println(i+" is Even");
            }
        }
    }

}
