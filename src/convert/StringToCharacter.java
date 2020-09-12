package convert;

public class StringToCharacter {

    public static void main(String[] args) {
        char[] chh=new char[20];
        String str="Mahadi Hassan";
        char[] ch=str.toCharArray(); //<--another way
        int i;
        for(i=0;i<str.length();i++){
            chh[i]=str.charAt(i);
        }
        System.out.println(chh);
        System.out.println(ch);
    }

}
