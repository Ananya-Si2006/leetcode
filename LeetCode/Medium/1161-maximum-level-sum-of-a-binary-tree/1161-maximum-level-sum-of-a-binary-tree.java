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
    public int maxLevelSum(TreeNode root) {
        if(root==null)
        return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int level=0;
        int maxLevel=1;
        int maxSum=Integer.MIN_VALUE;
        while(!(q.isEmpty()))
        {
            int size=q.size();
            int sum=0;
            level++;
            for(int i=0;i<size;i++)
            {
                TreeNode a=q.poll();
                sum+=a.val;
                if(a.left!=null)
                q.offer(a.left);
                if(a.right!=null)
                q.offer(a.right);
            }
            if(sum>maxSum)
            {
                maxSum=sum;
                maxLevel=level;
            }
        }
        return maxLevel;
        
    }
}