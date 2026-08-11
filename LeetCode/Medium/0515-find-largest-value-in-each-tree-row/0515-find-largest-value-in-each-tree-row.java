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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!(q.isEmpty()))
        {
            int size=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                TreeNode a= q.poll();
                max=Math.max(max,a.val);
                if(a.left!=null)
                q.offer(a.left);
                if(a.right!=null)
                q.offer(a.right);


            }
            ans.add(max);
        }
        return ans;
        
    }
}