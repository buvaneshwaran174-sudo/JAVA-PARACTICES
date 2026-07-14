class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike Started");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bike(),
                new Vehicle()
        };

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}