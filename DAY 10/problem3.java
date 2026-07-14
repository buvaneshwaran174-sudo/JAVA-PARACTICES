class Employee {

    private int empId;
    private String name;
    private double salary;

    // Setter Methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary!");
        }
    }

    // Getter Methods
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmpId(101);
        e.setName("Buvanesh");
        e.setSalary(45000);

        System.out.println("Employee ID : " + e.getEmpId());
        System.out.println("Name        : " + e.getName());
        System.out.println("Salary      : " + e.getSalary());
    }
}