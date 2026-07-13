import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int t = sc.nextInt();

        int result = num + (2 * t);

        System.out.println(result);

        sc.close();
    }
}