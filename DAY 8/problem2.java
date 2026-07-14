class BankAccount {

    int accountNo;
    String name;
    double balance;

    BankAccount() {
        this(1001);
    }

    BankAccount(int accountNo) {
        this(accountNo, "Buvanesh");
    }

    BankAccount(int accountNo, String name) {
        this(accountNo, name, 5000);
    }

    BankAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account No : " + accountNo);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.display();
    }
}