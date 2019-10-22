import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumOfPrimesBelowTwoMillionFactor {

    static Set<Long> primeNumbers = new HashSet<>();

    public static void main(String[] args) {
        var number = 2000000;

        final long sum = IntStream.rangeClosed(2, number)
            .filter(SumOfPrimesBelowTwoMillionFactor::isPrime)
            .mapToLong(Long::valueOf)
            .peek(System.out::println)
            .sum();

        System.out.println(sum);
    }

    private static boolean isPrime(int i) {
        return LongStream.range(2, (int)Math.sqrt(i) + 1)
            .noneMatch(j -> i % j == 0);
    }
}
