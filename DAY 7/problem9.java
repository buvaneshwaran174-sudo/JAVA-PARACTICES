class Laptop {

    String brand;

    Laptop() {
        brand = "Dell";
        System.out.println("Constructor Called");
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {

        Laptop lap = new Laptop();

        lap.display();
    }
}