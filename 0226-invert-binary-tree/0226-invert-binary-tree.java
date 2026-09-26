/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { this.val = val; }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Base case: agar tree empty hai toh return null
        if (root == null) {
            return null;
        }
        
        // Left aur Right subtrees ko swap karein
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // Recursively children ko bhi invert karein
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}