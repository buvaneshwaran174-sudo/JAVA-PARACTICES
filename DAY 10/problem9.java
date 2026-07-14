class Student {

    private int id;
    private String name;
    private double marks;

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.setId(101);
        s.setName("Buvanesh");
        s.setMarks(92.5);

        System.out.println("Student ID : " + s.getId());
        System.out.println("Student Name : " + s.getName());
        System.out.println("Marks : " + s.getMarks());
    }
}