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
    private TreeNode buildTreeHelper(int[] inorder, int inStart, int inEnd,
                                     int[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        // Root value from postorder
        TreeNode root = new TreeNode(postorder[postEnd]);

        // Find root index in inorder
        int rootIndex = inStart;
        while (inorder[rootIndex] != root.val) {
            rootIndex++;
        }

        // Build left and right subtrees recursively
        root.left = buildTreeHelper(inorder, inStart, rootIndex - 1,
                                    postorder, postStart, postStart + rootIndex - inStart - 1);

        root.right = buildTreeHelper(inorder, rootIndex + 1, inEnd,
                                     postorder, postStart + rootIndex - inStart, postEnd - 1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTreeHelper(inorder, 0, inorder.length - 1,
                               postorder, 0, postorder.length - 1);
    }
}