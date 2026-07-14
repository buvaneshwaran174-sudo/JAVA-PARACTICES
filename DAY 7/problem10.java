class Person {

    void display() {
        System.out.println("I am a Person");
    }
}

class Student extends Person {

    @Override
    void display() {
        System.out.println("I am a Student");
    }
}

public class Main {

    public static void main(String[] args) {

        Person p = new Student(); // Upcasting

        p.display();
    }
}