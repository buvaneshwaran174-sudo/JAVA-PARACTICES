import java.util.Scanner;

public class ReadSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.println("Age = " + age);
        System.out.println("Name = " + name);

        sc.close();
    }
}