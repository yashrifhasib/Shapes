public class Circle extends Shape {
    private double radius;

    public Circle( String name, double radius ) {
        super( name );
        this.radius = radius;
    }

    public double area() {
        return ( Math.PI * Math.pow( this.radius, 2 ) );
    }
    public double perimeter() {
        return ( 2 * Math.PI * this.radius );
    }
    public double degrees() { return 360; }
}
