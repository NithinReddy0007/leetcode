/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public void check(TreeNode root,List<String> ans,String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        check(root.left,ans,s+root.val+"->");
        check(root.right,ans,s+root.val+"->");


    }
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        check(root,ans,"");
        return ans;
        
    }
}