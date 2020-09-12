package convert;

public class CharToStringConvert {

    public static void main(String[] args) {
        char[] chh={'M','I','T','H','U','N'};
        String str;
//character to String >---
//      str=Character.toString(chh[2]);
        
        str=String.valueOf(chh);
        
        System.out.println(str);
    }

}
