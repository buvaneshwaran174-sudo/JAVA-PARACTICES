import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int t = sc.nextInt();

        System.out.println(num + (2 * t));

        sc.close();
    }
}