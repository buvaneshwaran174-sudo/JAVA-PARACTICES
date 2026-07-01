import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0 || num % 10 != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        sc.close();
    }
}