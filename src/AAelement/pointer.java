package AAelement;

public class pointer {
    
    class IntObj {
        public int value;
    }
    
    public static void main(String[] args) {
        IntObj  x;  // Allocate the pointers x and y
        IntObj  y;  // (but not the IntObj pointees)

        x = new IntObj();   // Allocate an IntObj pointee
                            // and set x to point to it

        x.value = 42;   // Dereference x to store 42 in its pointee

        y.value = 13;   // CRASH -- y does not have a pointee yet

        y = x;  // Pointer assignment sets y to point to x's pointee

        y.value = 13; 
    }

}
