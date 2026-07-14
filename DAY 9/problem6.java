class Person {

    String name = "Buvanesh";

    void displayPerson() {
        System.out.println("Name : " + name);
    }
}

class Employee extends Person {

    int empId = 101;

    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.displayPerson();     // Inherited method
        e.displayEmployee();
    }
}