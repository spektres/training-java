
/**
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class Task1 {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        if (a.length() < b.length()) {
            String temp = a;
            b = temp;
        }

        int j = b.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carry += 1;
            }

            if (j >= 0 && b.charAt(j) == '1') {
                carry += 1;
            }

            res = (carry % 2) + res;
            carry = carry / 2;
            j = j - 1;
        }
        if (carry == 1) {
            res = 1 + res;
        }

        System.out.println(res);
    }
}