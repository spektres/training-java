/**
 * https://leetcode.com/problems/add-strings/
 * 
 * 
 * Given two non-negative integers, num1 and num2 represented as string, return
 * the sum of num1 and num2 as a string.
 * 
 * You must solve the problem without using any built-in library for handling
 * large integers (such as BigInteger). You must also not convert the inputs to
 * integers directly.
 */
public class Task2 {

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int j = num2.length() - 1;
        int carry = 0;
        String res = "";
        for (int i = num1.length() - 1; i >= 0; i--) {
            carry += (num1.charAt(i) - '0');

            if (j >= 0) {
                carry += (num2.charAt(j) - '0');
            }

            res = (carry % 10) + res;

            carry = carry / 10;
            j = j - 1;
        }

        if (carry == 1) {
            res = 1 + res;
        }

        System.out.println(res);
    }
}