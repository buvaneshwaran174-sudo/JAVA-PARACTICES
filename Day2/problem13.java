import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, count = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0 && num % 3 == 0) {
                sum += num;
                count++;
            }
        }

        if (count == 0)
            System.out.println(0);
        else
            System.out.println(sum / count);

        sc.close();
    }
}