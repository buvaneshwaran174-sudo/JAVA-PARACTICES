import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mainTank = sc.nextInt();
        int additionalTank = sc.nextInt();

        int distance = 0;

        while (mainTank > 0) {
            if (mainTank >= 5) {
                distance += 50;
                mainTank -= 5;

                if (additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
            } else {
                distance += mainTank * 10;
                break;
            }
        }

        System.out.println(distance);

        sc.close();
    }
}