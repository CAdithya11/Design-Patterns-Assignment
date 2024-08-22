package Task2;

public abstract class Beverages {
    abstract public void addExtras();
    private boolean wantsExtras;

    public void  setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }

    abstract public void  brew();
    abstract public void addCondiments();

    public void  boilWater(){
        System.out.println("Boiling Water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

    public void finalTemplateMethod(){
        // All the methods are declared inorder to
        // provide the availability of each method
        // As a parent of these all methods
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtras();
        }
    }


}
