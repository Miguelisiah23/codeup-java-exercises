package shapes;

public class Square extends Quadrilateral {
    protected int sides;

    public Square(int side) {
        super(side, side);
        sides = side;
    }

    @Override
    public double getPerimeter() {
        return (this.sides * 2) + (this.sides * 2);
    }

    @Override
    public double getArea() {
        return this.sides * this.sides;
    }

    public double getLength() {
        return this.sides;
    }

    @Override
    public void setLength(int side) {
        this.sides = side;
    }

    @Override
    public void setWidth(int side) {
        this.sides = side;
    }

//    private int side;
//
//    public  Square( int sides) {
//        super(sides,sides);
//        side = sides;
//
//    }
//    public int getPerimeter(){
//        System.out.println("square");
//        return this.side * 4;
//    }
//    public int getArea(){
//        System.out.println("square");
//        return side * side;
//    }
}
