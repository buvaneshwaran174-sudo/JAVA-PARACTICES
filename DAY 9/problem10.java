class Professor {

    String name;

    Professor(String name) {
        this.name = name;
    }
}

class College {

    String collegeName;
    Professor professor;

    College(String collegeName, Professor professor) {
        this.collegeName = collegeName;
        this.professor = professor;
    }

    void display() {

        System.out.println("College : " + collegeName);
        System.out.println("Professor : " + professor.name);
    }
}

public class Main {

    public static void main(String[] args) {

        Professor p = new Professor("Dr. Kumar");

        College c = new College("ABC Engineering College", p);

        c.display();
    }
}