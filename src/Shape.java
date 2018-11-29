public abstract class Shape {
    private String name;

    public Shape( String name ) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();

}
