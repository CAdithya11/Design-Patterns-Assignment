package Task3;

import java.util.IllegalFormatException;

public class ShapeFactory {
    public Shape getShape(String type){
        // According to the request objects get created
        if (type.equalsIgnoreCase("square")){
            return new Square();
        }else if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }else if(type.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        else {
            System.out.println("Invalid shape type provided");
        }
        return null;
    }
}
