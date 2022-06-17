package shapes;

public class Circle {
    private double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double getArea() {
        Double area =(this.radius * this.radius) * 3.14;
        System.out.printf("Area: %f",area);
        return area;
    }

    public double getCircumference() {
      double circum = 2 * 3.14 * this.radius;
        System.out.printf("Circumference: %f",circum);
        return circum;
    }

}
