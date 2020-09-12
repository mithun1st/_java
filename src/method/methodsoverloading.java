package method;


public class methodsoverloading {
    public static void fn(int a,int b){
        System.out.println("1st fnc");
    }
    public static void fn(int a,double b){
        System.out.println("2nd fnc");
    }
    public static void fn(double a,double b){
        System.out.println("3rd fnc");
    }
    public static void fn(int a,int b,int c){
        System.out.println("4th fnc");
    }

    public static void main(String[] args) {
        fn(4,5);
        fn(4,5.5);
        fn(5.43,4.65);
        fn(5,3,7);       
    }

}
