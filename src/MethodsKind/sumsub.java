package MethodsKind;


public class sumsub {
    int sum(int a,int b){
        System.out.println("Derivative class >int");
        int x=a+b;
        return x;
    }
    void sub(int a,int b){
        System.out.println("Derivative class >void");
        int x=a-b;
        System.out.println(x);
    }
    public static void main (String[] args){
        calling ob=new calling ();
        int x=ob.mul(4,5);
        System.out.println(x);
    }

}
