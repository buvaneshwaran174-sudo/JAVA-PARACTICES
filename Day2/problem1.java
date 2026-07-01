import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt();

        // Calculate result
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n - 1);
        }

        sc.close();
    }
}