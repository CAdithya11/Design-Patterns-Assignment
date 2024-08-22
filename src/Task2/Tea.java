package Task2;

public class Tea extends Beverages{
    @Override
    public void addExtras() {
        System.out.println("Adding Sugar");
    }
    public void brew(){
        System.out.println("Steeping the tea");
    }
    public void  addCondiments(){
        System.out.println("Adding lemon");
    }
}
