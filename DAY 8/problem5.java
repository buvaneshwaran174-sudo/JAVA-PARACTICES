class Car {

    String brand;
    String color;

    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    void display() {
        System.out.println(brand + " - " + color);
    }

    public static void main(String[] args) {

        Car c1 = new Car("BMW", "Black");
        Car c2 = new Car("Audi", "White");
        Car c3 = new Car("Toyota", "Red");

        c1.display();
        c2.display();
        c3.display();
    }
}