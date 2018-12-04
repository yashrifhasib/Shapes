public class Trapezoid extends Quadrilateral {
    private double height;
    public Trapezoid( String name, double topSide, double bottomSide, double leftSide, double rightSide, double height ) {
        super( name, topSide, bottomSide, leftSide, rightSide );
        this.height = height;
    }

    public double area() { return ( ( getSide1() + getSide2() ) * this.height ) / 2; }
}
