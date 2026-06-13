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

class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        // TODO: Implement recursive binary tree inversion.
        // 1. Base case: if root is null, return null.
        // 2. Recursively invert left and right child nodes.
        // 3. Swap the left and right pointers of root.
        // 4. Return root.
        return null;
    }
}

