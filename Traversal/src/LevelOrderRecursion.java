import java.util.ArrayList;
import java.util.List;

public class LevelOrderRecursion {
    private List<List<Integer>> result = new ArrayList<>();

    private void traverseNode(Node node, int level){
        if (result.size() <= level)
            result.add(new ArrayList<>());

        result.get(level).add(node.val);
        for (Node child : node.children)
            traverseNode(child, level + 1);
    }

    public List<List<Integer>>   levelOrder(Node root){
        if (root != null) traverseNode(root, 0);
        return result;
    }
}
