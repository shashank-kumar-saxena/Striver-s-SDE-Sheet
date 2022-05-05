package orderOfnADDmComplexity;


import com.shsnk.intersection.Node;

import java.util.HashSet;

public class LinkedList extends orderOfnMULmComplexity.LinkedList {
    @Override
    public Node comp(Node n1, Node n2) {
        HashSet<Node> nodes=new HashSet<>();
        while (n1!=null)
        {
            nodes.add(n1);
            n1=n1.next;
        }

        while (n2!=null)
        {
            if(nodes.contains(n2))
                return n2;
            n2=n2.next;
        }
        return null;
    }
}
