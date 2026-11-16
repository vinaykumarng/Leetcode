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
    public void postOrder(TreeNode root,List<Integer> out ){
        if(root == null) return;
        postOrder(root.left, out);
        postOrder(root.right, out);
        out.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        //your code goes here
        List<Integer> out = new ArrayList<>();
        postOrder(root, out);
        return out;
    }
}