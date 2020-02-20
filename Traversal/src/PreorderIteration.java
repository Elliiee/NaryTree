import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;
import sun.awt.image.ImageWatched;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PreorderIteration {
    public List<Integer> preorder(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null) return output;

        stack.add(root);
        while (!stack.isEmpty()){
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children)
                stack.add(item);
        }
        return output;
    }
}
