import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrivalTime = sc.nextInt();
        int delayedTime = sc.nextInt();

        int newArrivalTime = (arrivalTime + delayedTime) % 24;

        System.out.println(newArrivalTime);

        sc.close();
    }
}