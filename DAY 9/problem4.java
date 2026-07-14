class Student {

    Student() {
        this("Buvanesh");
        System.out.println("Default Constructor");
    }

    Student(String name) {
        this(name, 22);
        System.out.println("Name : " + name);
    }

    Student(String name, int age) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        new Student();
    }
}