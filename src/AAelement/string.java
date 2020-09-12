package AAelement;


public class string {

    public static void main(String[] args) {
        String s1="mahadi hassan";
        String s2=" Mithun",s3="mahadi has";
        System.out.println("Length: "+s1.length());
        System.out.println("Add two str: "+s1.concat(s2));
        System.out.println("Element num: "+s1.indexOf('s'));
        System.out.println("Character find: "+s1.charAt(7));
        System.out.println("Sub string: "+s2.substring(3,5));
        System.out.println("with    space: "+s2);
        System.out.println("without space: "+s2.trim());
        System.out.println("capital later: "+s1.toUpperCase());
        System.out.println("string match: "+s1.equals(s2));
        System.out.println("blank string: "+s3.isEmpty());
        System.out.println("first match: "+s1.startsWith(s3));
         }

}
