public class Rectangle extends Quadrilateral {
    public Rectangle( String name, double length, double width ) {
        super( name, length, width, length, width );
    }
    public double area() {
        return getSide1() * getSide2();
    }
}
