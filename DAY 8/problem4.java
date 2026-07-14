class Employee {

    int empId = 101;              // Instance variable
    static String company = "ABC Pvt Ltd"; // Static variable

    void display() {

        int salary = 30000;       // Local variable

        System.out.println("Employee ID : " + empId);
        System.out.println("Company     : " + company);
        System.out.println("Salary      : " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.display();
    }
}