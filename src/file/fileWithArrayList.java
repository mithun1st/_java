package file;
import java.util.ArrayList;
import java.io.*;

public class fileWithArrayList {

    public static void main(String[] nn){ 
        
        ArrayList<Integer> var = new ArrayList<Integer>();
        
        
        var.add(11);
        var.add(12);
        var.add(13);
        var.add(14);
        var.add(15);
        
        
        try {
            FileOutputStream file = new FileOutputStream("arraylist.txt");
            ObjectOutputStream o = new ObjectOutputStream(file);
            for (int i=0; i<var.size();i++){
                o.writeObject(var.get(i));
            }
            o.close();
            
            
        } catch (IOException e) {
        
        }

        
        
        ArrayList<Integer> a = new ArrayList<>();
            
        try {
            FileInputStream file1 = new FileInputStream("arraylist.txt");
            ObjectInputStream o1 = new ObjectInputStream(file1);
            for(int i=0;i<var.size();i++){
                a.add((Integer)o1.readObject());
            }
            o1.close();
            
        } catch (Exception e) {
            
        }
        
        System.out.println(""+a);
    }

    
}
