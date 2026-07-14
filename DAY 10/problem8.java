public class Main {

    static int largest(int... numbers) {

        int max = numbers[0];

        for (int num : numbers) {

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Largest Number = " + largest(10, 50, 20, 90, 40));
    }
}