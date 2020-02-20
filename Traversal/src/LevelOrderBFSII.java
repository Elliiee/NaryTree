import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelOrderBFSII {
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        List<Node> prevLayer = Arrays.asList(root);
        while (!prevLayer.isEmpty()){
            List<Node> currLayer = new ArrayList<>();
            List<Integer> prevVals = new ArrayList<>();
            for (Node node : prevLayer){
                prevVals.add(node.val);
                currLayer.addAll(node.children);
            }
            result.add(prevVals);
            prevLayer = currLayer;
        }

        return result;
    }
}
