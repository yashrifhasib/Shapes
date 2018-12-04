public class Rhombus extends Quadrilateral {
    public Rhombus( String name, double side1, double side2 ) {
        super( name, side1, side2, side1, side2 );
    }
    public double area() {
        return ( getSide1() * getSide2() ) / 2;
    }
}
