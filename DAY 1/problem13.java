import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n - 1);
        }

        sc.close();
    }
}