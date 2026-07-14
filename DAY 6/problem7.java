import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance += deposit;
                System.out.println("Updated Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter withdraw amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Remaining Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 3:
                System.out.println("Current Balance = " + balance);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}