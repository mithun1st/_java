package AAelement;

import java.text.DecimalFormat;

public class setDicimalDigit {

    public static void main(String[] args) {
        double p=123456789.14163121;
        DecimalFormat df=new DecimalFormat("#,###.##");
        
        System.out.println(""+df.format(p));
        System.out.println(""+String.format("%.2f",p));
    }

}
