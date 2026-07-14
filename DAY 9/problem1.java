class Laptop {
    String brand;
    String model;
    int price;

    // Parameterized Constructor
    Laptop(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", "Inspiron 15", 65000);
        l1.display();
    }
}