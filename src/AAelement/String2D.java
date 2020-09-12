package AAelement;


public class String2D {

  
    public static void main(String[] args) {
        String[] [] name= {
            {"mahadi ","hassan ","Mithun"},
            {"aaa ","bbb "},
            {"mohidul ","hasan ","Moin"},
            {"111 ","222 "}
        };
        
        System.out.println("num of row- "+name.length+"\n");
        
        for (int i = 0; i < name.length; i++) {
            for (String s : name[i]) {
                System.out.print(""+s);
            }
            System.out.println("");
        }
        
    }
    
}
