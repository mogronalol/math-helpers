public class NthTriangularNumber {

    public static void main(String[] args) {

        long incrementer = 2;
        long number = 1;

        while (getFactors(number) < 500) {
            number += incrementer++;
            System.out.println(number);
        }
        System.out.println(number);
    }

    private static int getFactors(final long number) {
        int divisors = 0;
        final double sqrt = Math.sqrt(number);

        for (long i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                divisors+=2;
            }
        }

        if (sqrt * sqrt == number) {
            divisors--;
        }

        return divisors;
    }
}
