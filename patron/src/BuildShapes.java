import java.util.HashMap;

public class BuildShapes {
    private static final HashMap<String, Shape> MapCircle = new HashMap<>();

    public static Shape getCircle(String color){

        Circle circle = (Circle)MapCircle.get(color);
        if(circle == null) {
            circle = new Circle(color);
            MapCircle.put(color, circle);
            System.out.println("Creating circle color: " + color);
        }
        return circle;
    }
}
