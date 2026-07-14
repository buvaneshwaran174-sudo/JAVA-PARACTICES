class Person {

    String name = "Buvanesh";

    void displayPerson() {
        System.out.println("Name : " + name);
    }
}

class Student extends Person {

    int rollNo = 21;

    void displayStudent() {
        System.out.println("Roll No : " + rollNo);
    }
}

class Teacher extends Person {

    String subject = "Java";

    void displayTeacher() {
        System.out.println("Subject : " + subject);
    }
}

public class CollegeManagement {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Student Details");
        s.displayPerson();
        s.displayStudent();

        System.out.println();

        Teacher t = new Teacher();

        System.out.println("Teacher Details");
        t.displayPerson();
        t.displayTeacher();
    }
}