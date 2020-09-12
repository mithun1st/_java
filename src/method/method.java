package method;


public class method {
    
    public static void fn(){
        System.out.println("Welcome to Java Method");
    }
    public static int add (int a, int b){
        int s=a+b;
        return s;
    }
    public static void sub (int a, int b){
        int s=a-b;
        System.out.println("Subtraction: "+s);     
    }

    public static void main(String[] args) {
        fn();
        int x=add(6,4);
        System.out.println("Summation: "+x);
        sub(6,4);     
    }

}
