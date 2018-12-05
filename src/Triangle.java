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

    public boolean isIsosceles() {
        return ( isValidTriangle() && ( this.a == this.b || this.a == this.c || this.c == this.b ) );
    }

    public boolean isRightTriangle() {
        return ( isValidTriangle() && ( ( this.a * this.b / 2 ) == area() || ( this.c * this.b / 2 ) == area() || ( this.a * this.c / 2 ) == area() ) );
    }

    public boolean isValidTriangle() {
        return !( ( this.a + this.b ) < this.c || ( this.b + this.c ) < this.a || ( this.c + this.a ) < this.b );
    }
}
