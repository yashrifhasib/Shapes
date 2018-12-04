public class Trapezoid extends Quadrilateral {
    public Trapezoid( String name, double topSide, double bottomSide, double leftSide, double rightSide) {
        super( name, topSide, bottomSide, leftSide, rightSide );
    }

    public double area() {
        double area = 0;
        if ( getSide1() > getSide2() ) {

        }
        if ( getSide2() > getSide1() ) {

        }
        return area;
    }
}
