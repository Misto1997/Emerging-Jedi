/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
       return isAMirror(root,root);
        
    }

    
    private boolean isAMirror(TreeNode tree1, TreeNode tree2)  
    { 
        if (tree1 == null && tree2 == null) 
            return true; 
        if (tree1 != null && tree2 != null && tree1.val == tree2.val) 
            return (isAMirror(tree1.left, tree2.right) 
                    && isAMirror(tree1.right, tree2.left)); 
        return false;
    } 
}