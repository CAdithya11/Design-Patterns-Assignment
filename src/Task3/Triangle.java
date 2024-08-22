package Task3;

public class Triangle implements Shape{
    @Override
    public void draw() {
        for (int x=0;x<=5;x++){
            for (int y=x;y<=5;y++){
                System.out.print("  ");
            }
            for (int z=0; z<=x;z++){
                System.out.print("* ");
            }
            for (int w=x;w>0;w--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}