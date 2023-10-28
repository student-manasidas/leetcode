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
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = true;
        
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int level = queue.size();
            
            for (int i = 0; i < level; i++) {
                TreeNode current = queue.poll();
                temp.add(current.val);
                
                if (current.left != null) {
                    queue.offer(current.left);
                }
                
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            
            if (!flag) {
                Collections.reverse(temp);
            }
            
            ans.add(temp);
            flag = !flag;
        }
        
        return ans;
    }
}