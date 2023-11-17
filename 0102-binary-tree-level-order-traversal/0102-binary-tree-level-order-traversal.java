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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> que=new ArrayDeque<>();
        que.add(root);
        while(que.size()>0){
            int size=que.size();
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode nroot=que.remove();
                list.add(nroot.val);
                if(nroot.left!=null){
                    que.add(nroot.left);
                }
                if(nroot.right!=null){
                    que.add(nroot.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}