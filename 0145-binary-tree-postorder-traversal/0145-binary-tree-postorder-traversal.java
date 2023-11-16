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
    ArrayList<Integer>ans=new ArrayList<>();
    private void postorder(TreeNode root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
         ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return ans;
    }
}