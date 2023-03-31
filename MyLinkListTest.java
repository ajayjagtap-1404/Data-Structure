package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldAddedTop () {
        INode<Integer> myFirstNode = new MyNode<>(70);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.add(mySecondNode);
        myLinkList.add(myThirdNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myThirdNode) &&
                myLinkList.head.getNext().equals(mySecondNode)
                && myLinkList.tail.equals(myFirstNode);
        Assert.assertTrue(result);

    }
}
