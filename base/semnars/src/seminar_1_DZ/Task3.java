/*
 * https://leetcode.com/problems/merge-strings-alternately/
 * 
 * 
 * 
 * You are given two strings word1 and word2. 
 * Merge the strings by adding letters in alternating order, 
 * starting with word1. If a string is longer than the other, 
 * append the additional letters onto the end of the merged string.
 */

public class Task3 {
    public static void main(String[] args) {

        String s = "the sky is blue";

        if (s == null || s.length() == 0)
            System.out.println(s);

        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;

            int end = i;

            if (end >= 0 && sb.length() > 0)
                sb.append(' ');

            while (i >= 0 && s.charAt(i) != ' ')
                i--;

            int start = i;

            sb.append(s.substring(start + 1, end + 1));
        }
        System.out.println(sb.toString());
    }
}
