class Payment {

    void pay() {
        System.out.println("Payment Successful");
    }
}

class UPI extends Payment {

    @Override
    void pay() {
        System.out.println("Paid using UPI");
    }
}

class Restaurant {

    String name = "A2B Restaurant";

    void showRestaurant() {
        System.out.println("Restaurant : " + name);
    }
}

class Order {

    Restaurant restaurant = new Restaurant(); // Composition

    void placeOrder() {
        restaurant.showRestaurant();
        System.out.println("Order Placed");
    }
}

public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        order.placeOrder();

        Payment payment = new UPI(); // Polymorphism

        payment.pay();
    }
}