package accessSpecificartion;

public class MainClass extends A{

    
    public static void main(String[] args) {
        A obj=new A();
        
        //public
        new A().pub();          //can call from anywhere
        
        //protected
        obj.pro();          //can call by create obj 
        new MainClass().pro();  //                        or extends
        
        //protected
        new A().fn();
        new MainClass().fn();  //                        or extends
        
    }
}
