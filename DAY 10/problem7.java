interface Notification {

    void send();
}

class Email implements Notification {

    public void send() {
        System.out.println("Email Notification Sent");
    }
}

class SMS implements Notification {

    public void send() {
        System.out.println("SMS Notification Sent");
    }
}

class Push implements Notification {

    public void send() {
        System.out.println("Push Notification Sent");
    }
}

public class Main {

    public static void main(String[] args) {

        Notification n;

        n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new Push();
        n.send();
    }
}