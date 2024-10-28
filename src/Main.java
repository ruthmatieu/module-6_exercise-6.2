public class Main {
    public static void main(String[] args) {
        // Some test cases
        System.out.println("Sum of 234: " + sumDigits(234));
        System.out.println("Sum of 12345: " + sumDigits(12345));
        System.out.println("Sum of 0: " + sumDigits(0));
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}