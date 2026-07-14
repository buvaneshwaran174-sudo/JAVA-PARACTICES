class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is running.");
    }

    public static void main(String[] args) {
        Bike b = new Bike();

        b.start();   // Inherited method
        b.ride();
    }
}