package AAelement;

public class stringLength {

    public static void main(String[] args) {
        String s="mithun";
        int i=0;
        s+='\0';
        while(s.charAt(i)!='\0'){
            i++;
        }
        System.out.println(s+" - "+i);
    }   

}
