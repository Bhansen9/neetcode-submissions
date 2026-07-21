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
    public int goodNodes(TreeNode root) {
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, root.val));
        int count = 0;

        if(root == null){
            return count;
        }
        while(!stack.isEmpty()){
            Pair current = stack.pop();
            TreeNode node = current.node;
            int max = current.max;

            if(node.val >= max){
                count++;
            }
            int newMax = Math.max(max, node.val);

            if(node.right != null){
                stack.push(new Pair(node.right, newMax));
            }
            if(node.left != null){
                stack.push(new Pair(node.left, newMax));
            }
        }
        return count;
    }
class Pair {
        TreeNode node;
        int max;

        Pair(TreeNode node, int max) {
            this.node = node;
            this.max = max;
        }
    }
}
