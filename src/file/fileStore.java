package file;

import java.io.*;
import java.text.DecimalFormat;

public class fileStore {

    public static void main(String[] args) {

        
//write data

        int x=6,y=4;
        double pi=123453.1416;
        String s1="mahadi",s2="hassan";
        
        try{
            FileOutputStream file=new FileOutputStream("File.txt");
            ObjectOutputStream o=new ObjectOutputStream(file);
            o.writeObject(x);
            o.writeObject(y);
            o.writeObject(pi);
            o.writeObject(s1);
            o.writeObject(s2);
            o.close();
        }
        catch(IOException e){
            System.err.println(""+e);
            e.printStackTrace();
        }
        
        
//read data

        int a=0,b=0;
        double p=0;
        String st1="",st2="";
        DecimalFormat d=new DecimalFormat("######,###.##");
        
        try{
            FileInputStream file=new FileInputStream("File.txt");
            ObjectInputStream o  =new ObjectInputStream(file);
            a=(Integer) o.readObject();
            b=(Integer) o.readObject();
            p=(Double) o.readObject();
            st1=(String) o.readObject();
            st2=(String) o.readObject();
            o.close();
        }
        catch(Exception e){
            System.err.println("err");
        }
        System.out.println(""+a);
        System.out.println(""+b);
        System.out.println(""+d.format(p));
        System.out.println(""+String.format("%.1f", p));
        System.out.println(""+st1);
        System.out.println(""+st2);
    }

}
