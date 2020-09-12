
package clsObj;


public class cls {
    int count=0;
    public String name;
    public int sal;
    
    public void tot(){
        System.out.println("Total Employe: "+count);
    }
    
    public void dis(){
        count+=count;
        System.out.println("Name: "+name+"\t Salary: "+ sal);
    }

    
}
