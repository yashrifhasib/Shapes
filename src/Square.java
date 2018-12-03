public class Square extends Quadrilateral {
    public Square( String name, double side ) {
        super( name, side, side, side, side );
    }
    public double area() {
        return Math.pow( getSide1(), 2 );
    }
}
