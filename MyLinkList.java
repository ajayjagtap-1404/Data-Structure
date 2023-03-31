package linklist;

public class MyLinkList {
    INode head;
    INode tail;

    @Override
    public String toString() {
        return "MyLinkList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public MyLinkList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode myNewNode) {
        if (head == null) {
            this.head = myNewNode;

        }
        if (tail == null) {
            this.tail = myNewNode;
        } else {
            INode tempNode = this.head;
            this.head = myNewNode;
            myNewNode.setNext(tempNode);
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My nodes are ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode myNewNode) {
        if (this.head == null) {
            this.head = myNewNode;
        }
        if (this.tail == null) {
            this.tail = myNewNode;
        } else {

           this.tail.setNext(myNewNode) ;
           this.tail = myNewNode;

        }

    }
    public  void insert(INode myFirstNode, INode myNewNode) {
        if (this.head == null) {
            this.head = myNewNode;
        }
        if (this.tail == null) {
            this.tail = myNewNode;
        } else {
                INode tempNode = myFirstNode.getNext();
                myFirstNode.setNext(myNewNode);
                myNewNode.setNext(tempNode);

        }
    }
}
