import javax.swing.tree.TreeNode;

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes 
 * along the longest path from the root node down to the farthest leaf node.
 * 
 */

public class Task3 {
    public static void main(String[] args) {
        public int maxDepth(TreeNode root){
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(maxDepth(root.left(), maxDepth(root.right()));
        }
    }
}
