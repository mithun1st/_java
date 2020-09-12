
package pattern;


public class piramid {

    public static void main(String[] args) {
        int l=4;
        for (int i = 0; i < l; i++) {
            for (int j =i; j<l; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j<i*2-1; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
        //------------
        for (int i = l; i > 0; i--) {
            for (int j =i; j<l; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j<i*2-1; j++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }

}
