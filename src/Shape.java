import java.util.List;

public abstract class Shape implements Comparable<Shape> {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract double degrees();
    public double semiperimeter() {
        return perimeter() / 2;
    }
    public String toString() {
        return this.name + ", area = " + area() + ", perimeter = " + perimeter();
    }

    public int compareTo( Shape other ) {
        if (this.area() < other.area() )
            return -1;
        if (this.area() > other.area() )
            return 1;
        return 0;
    }

    public int compareToByPerimeter( Shape other ) {
        if (this.perimeter() < other.perimeter() )
            return -1;
        if (this.perimeter() > other.perimeter() )
            return 1;
        return 0;
    }

    public int compareToByDegrees( Shape other ) {
        if (this.degrees() < this.degrees() )
            return -1;
        if (this.degrees() > other.degrees() )
            return 1;
        return 0;
    }

    public static void sortByArea( List<Shape> shapes ) {
        for ( int i = 0; i < shapes.size() - 1; i++ ) {
            int lowPosition = i;
            for ( int j = i + 1; j < shapes.size(); j++ )
                if ( shapes.get( i ).compareTo( shapes.get( lowPosition ) ) < 0 )
                    lowPosition = j;
            swap( i, lowPosition, shapes );
        }
    }

    public static void sortByPerimeter( List<Shape> shapes ) {
        for ( int i = 0; i < shapes.size() - 1; i++ ) {
            int lowPosition = i;
            for ( int j = i + 1; j < shapes.size(); j++ )
                if ( shapes.get( i ).compareToByPerimeter( shapes.get( lowPosition ) ) < 0 )
                    lowPosition = j;
            swap( i, lowPosition, shapes );
        }
    }

    public static void sortByDegrees( List<Shape> shapes ) {
        for ( int i = 0; i < shapes.size() - 1; i++ ) {
            int lowPosition = i;
            for ( int j = i + 1; j < shapes.size(); j++ )
                if ( shapes.get( i ).compareToByDegrees( shapes.get( lowPosition ) ) < 0 )
                    lowPosition = j;
            swap( i, lowPosition, shapes );
        }
    }

    private static void swap(int indexOne, int indexTwo, List<Shape> list ) {
        list.set( indexOne, list.set( indexTwo, list.get( indexOne ) ) );
    }
}