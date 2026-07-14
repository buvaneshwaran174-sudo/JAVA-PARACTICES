class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    public boolean isSymmetric(TreeNode root) {
        return mirror(root.left, root.right);
    }

    boolean mirror(TreeNode left, TreeNode right) {

        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        return left.val == right.val &&
               mirror(left.left, right.right) &&
               mirror(left.right, right.left);
    }
}