/*
https://leetcode.com/problems/merge-strings-alternately/description/
 * 
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        String resString = "";
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                resString += word1.charAt(i);
            }
            if (i < word2.length()) {
                resString += word2.charAt(i);
            }
            i++;
        }
        return resString;
    }
}



