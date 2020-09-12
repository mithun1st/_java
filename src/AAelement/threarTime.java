package AAelement;

public class threarTime {

    public static void main(String[] args) {
        int mi=0,s=0,m=0;
        for(;;){
            System.out.println(m+"  /   "+s+"   /   "+mi);
            try {
                Thread.sleep(1000);
                s++;
            } catch (InterruptedException e) {
                System.err.println(""+e);
            }
            if(mi==1000){
                mi=0;
                s++;
            }
            
            if(s==60){
                s=0;
                m++;
            }
        }  
    }

}
