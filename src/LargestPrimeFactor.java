import java.util.stream.LongStream;

public class LargestPrimeFactor {

    static long highestPrimeFactor = 0L;

    public static void main(String[] args) {
        var number = 600851475143L;
        getFactors(number);
        System.out.println(highestPrimeFactor);
    }

    private static void getFactors(long number) {
        LongStream.range(2, number)
                .filter(i -> number % i == 0)
                .findFirst()
                .ifPresentOrElse(factor -> {
                    getFactors(factor);
                    getFactors(number / factor);
                }, () -> {
                    if (number > highestPrimeFactor) {
                        highestPrimeFactor =number;
                    }
                });
    }
}
