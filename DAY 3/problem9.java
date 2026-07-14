public class TypePromotion {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        int result = a + b;

        System.out.println("Result = " + result);
        System.out.println("Type Promotion: byte + byte becomes int");
    }
}