
package enums;


public class main {


    public static void main(String[] args) {
        final int n=2;
        
        Mobile m = Mobile.values()[1];
        
        System.out.println(""+m);
        System.out.println(""+Mobile.values()[2]);
        
        System.out.println(""+Mobile.appale.ordinal());
        System.out.println(""+Mobile.samsung.ordinal());
        System.out.println(""+Mobile.xiaomi.ordinal());
        
        for (Mobile s : Mobile.values()) {
            System.out.println("> "+s+" "+s.var);
        }
        
        System.out.println(""+Mobile.xiaomi.var);
    }
    
}
