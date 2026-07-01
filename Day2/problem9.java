import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int time = sc.nextInt();

        int cycle = 2 * (n - 1);
        int pos = time % cycle;

        if (pos < n)
            System.out.println(pos + 1);
        else
            System.out.println(2 * n - pos - 1);

        sc.close();
    }
}