class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class MaxDepthTree {
    public int maxDepth(TreeNode root) {
        // TODO: Implement recursive tree depth calculation.
        // 1. Base case: if root is null, return 0.
        // 2. Return 1 + Math.max of maxDepth of left and right child nodes.
        return 0;
    }
}

