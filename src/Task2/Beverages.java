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
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtras();
        }
    }


}
