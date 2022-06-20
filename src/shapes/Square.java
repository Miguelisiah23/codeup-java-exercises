package shapes;

public class Square extends Rectangle{
    private int side;

    public  Square( int sides) {
        super(sides,sides);
        side = sides;

    }
    public int getPerimeter(){
        System.out.println("square");
        return this.side * 4;
    }
    public int getArea(){
        System.out.println("square");
        return side * side;
    }
}
