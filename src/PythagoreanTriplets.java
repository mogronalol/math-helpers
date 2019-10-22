public class PythagoreanTriplets {

    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                if (a != b) {
                    for (int c = 1; c < 1000; c++) {
                        if (a != c && b != c) {
                            if (a + b + c == 1000) {
                                if ((squared(a) + squared(b)) == squared(c)) {
                                    System.out.println("Next: " + String.format("a=%s,  b=%s, c=%s", a, b, c));
                                    System.out.println(a * b * c);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static int squared(int a) {
        return a * a;
    }
}
