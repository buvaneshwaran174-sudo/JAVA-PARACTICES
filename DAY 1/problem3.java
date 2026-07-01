import java.util.Scanner;

public class problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            num = sum;
        }

        System.out.println(num);

        sc.close();
    }
}