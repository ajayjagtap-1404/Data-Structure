package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {
      //  UC - 7
    @Test
    public void GivenNodeInsertAfterGivenNodeTestCaseShouldPass () {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(40);
        INode<Integer> myFourthNode = new MyNode<>(70);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myFourthNode);
        myLinkList.insertAfter(30, myThirdNode);

        myLinkList.printMyNodes();
     //   myLinkList.searchNode(mySecondNode);
        boolean result =
                myThirdNode.getKey().equals(40);
        Assert.assertTrue(result);

    }
}
