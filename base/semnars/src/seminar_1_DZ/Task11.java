/*
 * https://leetcode.com/problems/remove-element/description/
 */

public class Task11 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int numInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[numInd] = nums[i];
                numInd++;
            }
        }
        return numInd;
    }
}

// class Solution {
//     public int removeElement(int[] nums, int val) {
        
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {
//                 nums[count++] = nums[i];
//             }
//         }
        
//         return count;
//     }
// }
