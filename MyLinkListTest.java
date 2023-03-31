package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {

    @Test
    public void WhenGiven2NumbersAddedBetweenInThatNumberTestCaseShouldBePass () {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.append(myFirstNode);
        myLinkList.append(myThirdNode);
        myLinkList.insert(myFirstNode,mySecondNode);
        myLinkList.printMyNodes();
        boolean result = myLinkList.head.equals(myFirstNode) &&
                myLinkList.head.getNext().equals(mySecondNode)
                && myLinkList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }
}
