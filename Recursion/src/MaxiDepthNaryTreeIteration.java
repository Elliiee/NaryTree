import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class MaxiDepthNaryTreeIteration {
    /*
    visit each node with DFS strategy, while updating the max depth at each visit.
     */
    public int maxDepth(Node root){
        Queue<Pair<Node, Integer>> stack = new LinkedList<>();

        if (root != null)
            stack.add(new Pair(root, 1));

        int depth = 0;
        while (!stack.isEmpty()){
            Pair<Node, Integer> curr = stack.poll();
            root = curr.getKey();
            int curr_depth = curr.getValue();
            if (root != null){
                depth = Math.max(depth,curr_depth);
                for (Node n : root.children)
                    stack.add(new Pair(n, curr_depth + 1));
            }
        }
        return depth;
    }
}
