package linklist;

import linklist.INode;
import linklist.MyLinkList;

public class MyStack {
    private final MyLinkList myLinkList;

    public MyStack() {
        this.myLinkList = new MyLinkList();

    }

    public void push(INode<Integer> myNode) {
        myLinkList.add(myNode);
    }

    public void printStack() {
        myLinkList.printMyNodes();
    }

    public INode peak() {
        return myLinkList.head;
    }
}
