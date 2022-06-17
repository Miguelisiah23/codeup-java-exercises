package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Double data = input.getDouble("Enter a radius");
        Circle circle1 = new Circle(data);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
    }
}
