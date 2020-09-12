package MethodsKind;

public class calling {
    public static int mul(int a,int b){
        System.out.println("Own class >int");
        int x=a*b;
        return x;
    }

    public static void main(String[] args) {
        sumsub ob=new sumsub();
        int s,m;
        
        s=ob.sum(6, 4);
        System.out.println(s);
        
        ob.sub(6, 4);
        
        m=mul(6,4);
        System.out.println(m);
    }

}
