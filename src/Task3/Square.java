package Task3;

public class Square implements Shape{
    @Override
    public void draw() {
        // without print, iterate 5 times
        for (int i=0; i!=5; i++){
            // Iterate the loop 5 times
            // without line break
            for (int x=0; x!=5; x++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
