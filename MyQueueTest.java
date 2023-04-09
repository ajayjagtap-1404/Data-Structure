package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3NumberWhenAddedToQueueShouldHaveLastAddedNode() {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);
        myQueue.printQueue();
        INode peak = myQueue.peak();
        Assert.assertEquals(myFirstNode,peak);
    }
}