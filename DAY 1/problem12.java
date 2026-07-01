import java.util.Scanner;

public class problem12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOnes = sc.nextInt();
        int numZeros = sc.nextInt();
        int numNegOnes = sc.nextInt();
        int k = sc.nextInt();

        int sum = 0;

        if (k <= numOnes) {
            sum = k;
        } else if (k <= numOnes + numZeros) {
            sum = numOnes;
        } else {
            sum = numOnes - (k - numOnes - numZeros);
        }

        System.out.println(sum);

        sc.close();
    }
}