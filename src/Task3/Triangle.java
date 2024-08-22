package Task3;

public class Triangle implements Shape{
    @Override
    public void draw() {
        for (int x=0;x<=5;x++){
            // First invisible Triangle
            for (int y=x;y<=5;y++){
                System.out.print("  ");
            }
            // Second Visible left Triangle
            for (int z=0; z<=x;z++){
                System.out.print("* ");
            }
            // Third Visible right triangle
            for (int w=x;w>0;w--){
                System.out.print("* ");
            }
            // Breaks the lines of each iterate
            System.out.println();
        }
    }
}