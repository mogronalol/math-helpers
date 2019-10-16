public class SumOfEvenFibonacci {

    public static void main(String[] args) {

        int highest = 0;
        int index = 0;
        int sumOfEven = 0;

        while (true) {
            final int next = next(index++);

            if (next < 4000000) {
                highest = next;
                if (next % 2 == 0) {
                    sumOfEven += next;
                }
            } else {
                break;
            }
        }
        System.out.println(highest);
        System.out.println(sumOfEven);
    }

    private static int next(int number) {

        final int result = switch (number) {
            case 0 -> 1;
            case 1 -> 2;
            default -> next(number - 1) + next(number - 2);
        };

        return result;
    }
}
