package AAelement;

import java.util.*;

public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>(2);
        
        //add,get,set,remove,clear,size
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        System.out.println(""+num);
        //length
        System.out.println(""+num.size());
        //index call
        System.out.println(""+num.get(2));
        //edit
        num.set(4, num.get(5));
        System.out.println("dd--"+num);
        //delete index
        num.remove(4);
        System.out.println(""+num);
        //delete all
        num.clear();
        System.out.println(""+num);
    
    }

}
