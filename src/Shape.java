public abstract class Shape {
    private String name;

    public Shape( String name ) {
        this.name = name;
    }
    public abstract double area();
    public abstract double perimeter();
    public double semiperimeter() {
        return perimeter() / 2;
    }
    public String toString() {
        return this.name + ", area = " + area() + ", perimeter = " + perimeter();
    }

}
