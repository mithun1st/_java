package accessSpecificartion;


public class A {
    
    public void pub(){
        System.out.println("Public level- 1");
    }
    protected void pro(){
        System.out.println("Protected level- 2");
    }
    private void pri(){
        System.out.println("Private level- 3");
    }
    
    //need to create another fnc. coz, private can be used in only own class//
    protected void fn(){
        pri();
    }


}
