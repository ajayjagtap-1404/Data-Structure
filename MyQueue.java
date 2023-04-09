package linklist;

public class MyQueue {
    private final MyLinkList myLinkList;
    public MyQueue() {

        this.myLinkList = new  MyLinkList();
    }

    public void enQueue(INode newNode) {
         myLinkList.append(newNode);
    }

    public void printQueue() {
        myLinkList.printMyNodes();
    }

    public INode peak() {
        return myLinkList.head;
    }

    public void dequeue() {
        myLinkList.pop();
    }
}
