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
    public boolean isValidBST(TreeNode root) {
       return isValidBSTCheck(root,Long.MIN_VALUE, 
                               Long.MAX_VALUE);
    }
    public boolean isValidBSTCheck(TreeNode root,long min, long max){
        if(root == null)
            return true;
        if(root.val<min || root.val>max)
            return false;
        return isValidBSTCheck(root.left,min,(long)root.val-1)&&isValidBSTCheck(root.right,(long)root.val+1,max);
    }
}