import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int purchaseAmount = sc.nextInt();

        int rounded = ((purchaseAmount + 5) / 10) * 10;

        System.out.println(100 - rounded);

        sc.close();
    }
}