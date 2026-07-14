abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike Started");
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v = new Bike();
        v.start();
    }
}