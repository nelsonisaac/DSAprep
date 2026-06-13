import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

class CloneGraphSolution {
    public Node cloneGraph(Node node) {
        // TODO: Implement O(V + E) BFS/DFS copy using a visited mapping.
        // 1. Maintain a Map of original Node to cloned Node.
        // 2. Implement recursive helper to clone node and its neighbors.
        // 3. Return the cloned root.
        return null;
    }
}

