public class SumOfDigits {

    public static long sumOfDigits(long number) {
        long sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        long number = 1234567890L;
        long sum = sumOfDigits(number);
        System.out.println("Sum of digits in " + number + " is: " + sum);
    }
}