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
    public List<Integer> rightSideView(TreeNode root){
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> que=new ArrayDeque<>();
        que.add(root);
        while(que.size()>0){
            int size=que.size();
            for(int i=0;i<size;i++){
                  TreeNode nroot=que.remove();
               if(i==size-1){
                   ans.add(nroot.val);
               }
                if(nroot.left!=null){
                    que.add(nroot.left);
                }
                if(nroot.right!=null){
                    que.add(nroot.right);
                }
            }
            
        }
        return ans;
        
       
    }
}