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
    int sum;
    int maxDepth;
    public int deepestLeavesSum(TreeNode root) {
        sum=0;
        maxDepth=0;
        dfs(root,0);
        return sum;
    }
    public void dfs(TreeNode n, int depth) {
        if (n==null) return;
        dfs(n.left,depth+1);
        dfs(n.right,depth+1);
        if (depth>maxDepth) {
            sum=0;
            maxDepth=depth;
        } 
        if (depth==maxDepth) {
            sum+=n.val;
        }
    }
}
