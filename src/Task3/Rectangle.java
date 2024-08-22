package Task3;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        for (int i=0; i!=4; i++){
            for (int x=0; x!=6; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
