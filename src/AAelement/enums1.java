
package AAelement;

public class enums1 {
    
    public enum gate{
        AND(11), OR(22), NOT(33);
        int var;
        gate(int a){
            System.out.println(">"+a);
            this.var=a;
        }     
    }
   
    public static void main(String[] args) {
        
        System.out.println(""+gate.values()[1].var);
        
        }
    
}
