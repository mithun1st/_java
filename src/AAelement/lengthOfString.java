package AAelement;

public class lengthOfString {

    public static void main(String[] args) {
        String s="mahadi hassan";
        int l = 0;
        s+='\0';
        
        for (int i = 0; s.charAt(i)!='\0'; i++) {
            l=i;
        }
        System.out.println(""+s);
    }

}
