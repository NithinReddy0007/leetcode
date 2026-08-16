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

    public boolean hasNode(TreeNode root,TreeNode n){
        if(root==null) return false;
        if(root==n) return true;
        return hasNode(root.right,n) || hasNode(root.left,n); 
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {

        if(root==null) return null;
        
        if(root == n1 || root==n2) return root;
        
        if(hasNode(root.left,n1) && hasNode(root.right,n2)) return root;
        if(hasNode(root.left,n2) && hasNode(root.right,n1)) return root;
        
        TreeNode left = lowestCommonAncestor(root.left,n1,n2);
        TreeNode right = lowestCommonAncestor(root.right,n1,n2);
        
        if(left!=null) return left;
        return right;

        
        
    }
}