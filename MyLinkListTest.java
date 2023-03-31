package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {

    @Test
    public void given3NumbersWhenAddedAppendShouldAddedToLast () {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode)
                && myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }
}
