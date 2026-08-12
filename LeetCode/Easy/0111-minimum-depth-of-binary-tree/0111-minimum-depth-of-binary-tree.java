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
    public int minDepth(TreeNode root) {
        if(root==null)
        return 0;
        Queue<TreeNode> q=new LinkedList<>();
        int depth=1;
        q.offer(root);
        while(!(q.isEmpty()))
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode a=q.poll();
                if(a.left==null && a.right==null)
                return depth;
                if(a.left!=null)
                q.offer(a.left);
                if(a.right!=null)
                q.offer(a.right);

            }
            depth++;
        }
        return depth;
        
    }
}