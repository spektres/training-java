
/**
 * https://leetcode.com/problems/merge-strings-alternately/
 * 
 * You are given two strings word1 and word2. 
 * Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 */

public class Task1 {

    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";

        int firstLength = word1.length();
        int secondLength = word2.length();

        int i = 0;
        int j = 0;

        StringBuilder finalResult = new StringBuilder();

        while (i < firstLength || j < secondLength) {
            if (i < firstLength) {
                finalResult.append(word1.charAt(i++));
            }
            if (j < secondLength) {
                finalResult.append(word2.charAt(j++));
            }
        }

        System.out.println(finalResult.toString());
    }
}