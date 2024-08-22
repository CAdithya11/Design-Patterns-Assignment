package Task3;

public class ShapeTest {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("SQUARE"); // Shape Factory creates the according to the specific type
        if (square!= null){
            System.out.println("Square:");
            square.draw();  // rectangle class contains the methode draw() with the design
            System.out.println(); // gives a space after every square draw
        }

        Shape circle = shapeFactory.getShape("CIRCLE"); // Shape Factory creates the according to the specific type
        if (circle!=null){
            System.out.println("Circle:");
            circle.draw(); // rectangle class contains the methode draw() with the design
            System.out.println(); // gives a space after every circle draw
        }

        Shape rectangle = shapeFactory.getShape("RECTANGLE"); // Shape Factory creates the according to the specific type
        if (rectangle!=null){
            System.out.println("Rectangle:");
            rectangle.draw();   // rectangle class contains the methode draw() with the design
            System.out.println(); // gives a space after every rectangle draw
        }
//        Shape triangle = shapeFactory.getShape("TRIANGLE"); // Shape Factory creates the according to the specific type
//        if (triangle!=null){
//            System.out.println("Triangle");
//            triangle.draw(); // rectangle class contains the methode draw() with the design
//            System.out.println(); // gives a space after every triangle draw
//        }


        Shape invaildShape = shapeFactory.getShape("PENTAGON"); // Shape Factory creates the according to the specific type
        if (invaildShape!= null){
            invaildShape.draw(); // rectangle class contains the methode draw() with the design
        }
    }
}
