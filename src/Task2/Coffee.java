package Task2;

public class Coffee extends Beverages{
    @Override
    public void addExtras() {
        System.out.println("Adding vanilla syrup");
    }

    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }

    public void brew(){
        System.out.println("Dripping coffee through filter");
    }



}
