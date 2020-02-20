import com.sun.org.apache.xpath.internal.objects.XNodeSet;

import java.util.LinkedList;
import java.util.List;

public class PostorderIteration {
    public List<Integer> postorder(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) return output;

        stack.add(root);
        while (!stack.isEmpty()){
            Node node = stack.pollLast();
            output.addFirst(node.val);
            for (Node n : node.children)
                stack.add(n);
        }
        return output;
    }
}
