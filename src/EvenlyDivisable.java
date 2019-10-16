public class EvenlyDivisable {

    public static void main(String[] args) {

        int i = 0;

        while (true) {
            i += 20;
            boolean divisableByAll = true;
            for (int j = 1; j <= 19; j++) {
                if (i % j != 0) {
                    divisableByAll = false;
                    break;
                }
            }
            if (divisableByAll) {
                System.out.println(i);
                break;
            }
        }

    }
}
