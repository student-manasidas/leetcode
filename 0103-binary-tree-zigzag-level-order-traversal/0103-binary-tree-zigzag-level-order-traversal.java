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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzag=new ArrayList<>();
        if(root==null){
            return zigzag;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(q.size()>0){
            int size=q.size();
            List<Integer>currentlevel=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.peek();
                q.remove();
                currentlevel.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            if(level%2==0){
              zigzag.add(currentlevel);  
            }
            
            else{
                Collections.reverse(currentlevel);
                zigzag.add(currentlevel);
            }
            level++;
        }
        return zigzag;
    }
}