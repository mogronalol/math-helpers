public class LargestPalindrome {

    public static void main(String[] args) {

        int highest = 0;

        for (int left = 999; left >=0 ; left--) {
            for (int right = 999; right >= 0; right--) {
                final Integer product = Integer.valueOf(left * right);
                final String productAsString = product.toString();

                if (isPalindrome(productAsString)) {
                    if(product > highest) {
                        highest = product;
                        System.out.println(String.format("Highest: %s, Left: %s, Right: %s", highest, left, right));
                    };
                }
            }
        }
    }

    private static boolean isPalindrome(String product) {
        for (int i = 0; i < product.length() / 2; i++) {
            if (product.charAt(i) != product.charAt(product.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
