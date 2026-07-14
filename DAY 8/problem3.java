class Person {

    void showPerson() {
        System.out.println("Person Details");
    }
}

class Employee extends Person {

    void showEmployee() {
        System.out.println("Employee Details");
    }
}

class Manager extends Employee {

    void showManager() {
        System.out.println("Manager Details");
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}