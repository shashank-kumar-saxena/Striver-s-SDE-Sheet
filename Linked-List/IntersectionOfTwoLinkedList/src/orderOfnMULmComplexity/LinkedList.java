package orderOfnMULmComplexity;
import com.shsnk.intersection.Node;

public class LinkedList {
     Node head;
    Node temp;

    public Node getHead() {
        return head;
    }

    public void insert(int data)
    {
        temp=new Node(data);
        temp.next=head;
        head=temp;
        System.out.println("Node Insert Successfully");
    }
    public void insertNode(Node n,int data)
    {
        temp=new Node(data);
        temp=n;
        temp.next=head;
        head=temp;
        System.out.println("Node Insert Successfully");
    }
   public void traverse(Node temp)
    {
        if(head==null) {
            System.out.println("No Element Found");
            return;
        }
        while (temp.next!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public Node comp(Node n1,Node n2)
    {
            while (n1!=null)
            {
                while ((n2!=null))
                {
                    if(n1==n2)
                        return(n1);
                    n2=n2.next;
                }
                n1=n1.next;
            }
            return null;
    }
}
