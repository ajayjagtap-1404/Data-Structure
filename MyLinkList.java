package linklist;

public class MyLinkList<K> {
    public INode head;
    INode tail;
    int size;
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
        size++;
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
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode myNewNode) {
        size++;
        if (this.head == null) {
            this.head = myNewNode;
        }
        if (this.tail == null) {
            this.tail = myNewNode;
        } else {

            this.tail.setNext(myNewNode);
            this.tail = myNewNode;

        }

    }

    public void insert(INode myFirstNode, INode myNewNode) {
        size++;
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

    public void pop() {
        size--;
        if (this.head == null) {
            System.out.println("List is Empty");
        } else {
            INode tempNode = this.head.getNext();
            this.head = tempNode;

        }
    }

    public void popLast() {
        size--;
        if (this.head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (this.head.getNext() == null) {
            this.head = null;
            return;
        }

        INode secondLastNode = this.head;
        INode lastNode = this.head.getNext();
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
            secondLastNode = secondLastNode.getNext();

        }

        secondLastNode.setNext(null);
        this.tail = secondLastNode;


    }

    public void searchNode(INode myNode) {
        INode tempNode = this.head;
        boolean flag = false;
        if (this.head == null) {
            System.out.println("List is Empty ");
            return;
        }
        int i = 0;
        while (tempNode.getNext() != null) {
            if (tempNode.getKey() == myNode.getKey()) {
                flag = true;
                break;
            }
            i++;
            tempNode = tempNode.getNext();
        }
        if (flag) {
            System.out.println(myNode.getKey() + " present at index " + i);
        } else {
            System.out.println("Element not present");

        }

    }
        public void insertAfter(Integer node, INode<Integer> myNewNode) {
        size++;
            INode tempNode = this.head;
            while (tempNode.getKey()!= node) {
                tempNode = tempNode.getNext();
            }
              myNewNode.setNext(tempNode.getNext());
                tempNode.setNext(myNewNode);

        }
    public void deleteNode(Integer node) {
        size--;
        INode tempNode = head;
        INode tempNodeTwo = tempNode.getNext();
        while (tempNodeTwo.getKey() != node) {
            tempNode = tempNode.getNext();
            tempNodeTwo = tempNode.getNext();
        }
        tempNode.setNext(tempNodeTwo.getNext());
    }
    public int getSize() {
        return size;
    }

    public void sort() {
        INode currentNode = head;
        while (currentNode != null) {
            INode nextNode = currentNode.getNext();
            while (nextNode != null) {
                if ((Integer)currentNode.getKey() > (Integer)nextNode.getKey()) {
                    Integer temp = (Integer)currentNode.getKey();
                    currentNode.setKey(nextNode.getKey());
                    nextNode.setKey(temp);
                }
                nextNode = nextNode.getNext();
            }
            currentNode = currentNode.getNext();
        }
    }

}
