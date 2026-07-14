import java.util.Scanner;

public class ReverseNegativeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a negative integer: ");
        int num = sc.nextInt();

        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        reverse = reverse * sign;

        System.out.println("Reversed Integer = " + reverse);

        sc.close();
    }
}