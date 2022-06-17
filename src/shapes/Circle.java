package shapes;

public class Circle {
    private double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public double getArea() {
       Double pi = Math.PI;
        Double area =(this.radius * this.radius) * pi;
        System.out.printf("Area: %f",area);
        return area;
    }

    public double getCircumference() {
        Double pi = Math.PI;
      double circum = 2 * pi * this.radius;
        System.out.printf("Circumference: %f",circum);
        return circum;
    }

}
