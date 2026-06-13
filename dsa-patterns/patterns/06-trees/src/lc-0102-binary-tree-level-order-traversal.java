import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Implement Queue-based BFS level-order traversal.
        // 1. Initialize a List of List of Integer for result, and a Queue of TreeNode.
        // 2. Offer root to Queue if not null.
        // 3. Loop while queue is not empty. Get queue.size() for current level count.
        // 4. Loop levelSize times: poll node, add to level list, offer non-null children.
        // 5. Add level list to result.
        return new ArrayList<>();
    }
}

