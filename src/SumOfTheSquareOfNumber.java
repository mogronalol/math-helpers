import java.math.BigDecimal;
import java.math.RoundingMode;

public class SumOfTheSquareOfNumber {

    public static void main(String[] args) {

        var number = BigDecimal.valueOf(100).setScale(50, RoundingMode.HALF_UP);

        final BigDecimal sumOfNaturalNumbers = sumOfNaturalNumbers(number);
        final BigDecimal sumOfTheSquaresOfNaturalNumbers = sumOfTheSquaresOfNaturalNumbers(number);

        final BigDecimal squared = sumOfNaturalNumbers.pow(2);

        System.out.println("Sum of natural numbers: " + sumOfNaturalNumbers);
        System.out.println("(Sum of natural numbers) ^ 2: " + squared);
        System.out.println("(Sum of squares of natural numbers: " + sumOfTheSquaresOfNaturalNumbers);

        System.out.println(squared.subtract(sumOfTheSquaresOfNaturalNumbers).setScale(0, RoundingMode.HALF_UP));
    }

    private static BigDecimal sumOfNaturalNumbers(BigDecimal number) {
        return (number.add(BigDecimal.ONE))
                .divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP)
                .multiply(number);
    }

    private static BigDecimal sumOfTheSquaresOfNaturalNumbers(BigDecimal number) {
        final BigDecimal a = number.pow(3).divide(BigDecimal.valueOf(3), RoundingMode.HALF_UP);
        final BigDecimal b = number.pow(2).divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
        final BigDecimal c = number.divide(BigDecimal.valueOf(6 ), RoundingMode.HALF_UP);
        return a.add(b).add(c);
    }
}
