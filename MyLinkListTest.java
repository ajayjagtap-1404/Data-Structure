package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {
      //  UC - 10
    @Test
    public void SortGivenNodeKeyInAscendingOrderTestCaseShouldPass () {
        INode<Integer> myFirstNode = new MyNode<>(56);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myFourthNode = new MyNode<>(70);
        INode<Integer> myThirdNode = new MyNode<>(40);
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(myFirstNode);
        myLinkList.append(mySecondNode);
        myLinkList.append(myFourthNode);
        myLinkList.insertAfter(30, myThirdNode);
        myLinkList.printMyNodes();
        myLinkList.sort();
        myLinkList.printMyNodes();
        boolean result  =  myFirstNode.getKey().equals(30) && mySecondNode.getKey().equals(40) && myThirdNode.getKey().equals(56)
                && myFourthNode.getKey().equals(70);
              Assert.assertTrue(result);

    }
}
