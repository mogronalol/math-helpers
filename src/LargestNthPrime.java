import java.util.stream.LongStream;

public class LargestNthPrime {

    static long highestFactor = 0L;

    public static void main(String[] args) {
        int n = 10001;

        int primesFound = 0;
        int numberToTest = 2;

        while (true) {
            if (isPrime(numberToTest)) {
                primesFound++;
                System.out.println(String.format("%s: %s", primesFound, numberToTest));
                if (primesFound == n) {
                    System.out.println(numberToTest);
                    System.exit(0);
                }
            }
            numberToTest++;
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < ((int)Math.sqrt(number)) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void getFactors(long number) {
        LongStream.range(2, number)
            .filter(i -> number % i == 0)
            .findFirst()
            .ifPresentOrElse(factor -> {
                getFactors(factor);
                getFactors(number / factor);
            }, () -> {
                if (number > highestFactor) {
                    highestFactor=number;
                }
            });
    }

}
