abstract class Shape {

    abstract void area();
}

class Circle extends Shape {

    double radius = 5;

    @Override
    void area() {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;

    @Override
    void area() {
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}

public class Main {

    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}