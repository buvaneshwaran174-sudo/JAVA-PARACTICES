class Payment {
    void pay() {
        System.out.println("Payment Processing...");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}

class Card extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Card");
    }
}

class Cash extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}

public class Main {
    public static void main(String[] args) {

        Payment p;

        p = new UPI();
        p.pay();

        p = new Card();
        p.pay();

        p = new Cash();
        p.pay();
    }
}