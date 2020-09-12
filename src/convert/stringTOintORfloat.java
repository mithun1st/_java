package convert;

public class stringTOintORfloat {

    public static void main(String[] args) {
        int i;
        float f;
        String s1="234",s2="3.24";
        i=Integer.parseInt(s1);
        f=Float.parseFloat(s2);
        
        System.out.println(i+" and "+f);
    }

}
