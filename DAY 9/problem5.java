class Employee {

    int id;

    Employee(int id) {
        this.id = id;   // Resolves variable shadowing
    }

    void display() {
        System.out.println("Employee ID : " + id);
    }

    public static void main(String[] args) {
        Employee e = new Employee(101);
        e.display();
    }
}