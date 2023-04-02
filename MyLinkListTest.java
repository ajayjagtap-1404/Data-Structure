package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {
      //  UC - 7
    @Test
    public void WhenGiven3NumbersFindSecondNumberTestCaseShouldBePass () {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myThirdNode);
      //  myLinkList.popLast();
        myLinkList.printMyNodes();
        myLinkList.searchNode(mySecondNode);
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode) &&
                myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }
}
