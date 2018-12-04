public class Triangle extends Shape {
    private double a, b, c;

    public Triangle( String name, double a, double b, double c ) {
        super( name );
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = semiperimeter();
        return Math.sqrt( ( s ) * ( s - this.a ) * ( s - this.b ) * ( s - this.c ) );
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
    public double degrees() { return 180; }
}
