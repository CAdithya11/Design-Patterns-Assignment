package Task3;

public class Square implements Shape{
    @Override
    public void draw() {
        for (int i=0; i!=5; i++){
            for (int x=0; x!=5; x++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
