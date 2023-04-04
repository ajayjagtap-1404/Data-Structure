package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {
      //  UC - 9
    @Test
    public void DeleteGivenNodeKeyTestCaseShouldPass () {
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
        System.out.println("Before deleting  size is " +myLinkList.getSize());
        myLinkList.deleteNode(40);
        System.out.println("After deleting size is  " + myLinkList.getSize());
        myLinkList.printMyNodes();
        boolean result  = myLinkList.head.equals(myFirstNode) &&
                        myLinkList.head.getNext().equals(mySecondNode) &&
                        myLinkList.tail.equals(myFourthNode);
              Assert.assertTrue(result);

    }
}
