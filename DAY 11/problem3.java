public class Main {

    static int sum(int... numbers) {

        int total = 0;

        for (int num : numbers) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println("Sum = " + sum(10, 20, 30, 40, 50));
    }
}