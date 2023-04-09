package linklist;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumberWhenAddedToStackShouldHaveLastAddedNode () {
        INode<Integer> myFirstNode = new MyNode<>(70);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        myStack.peak();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode,peak);
    }
    @Test
    public void given3NumberInASStackWhenPoppedShouldMatchedWithLastAddedNode() {
        INode<Integer> myFirstNode = new MyNode<>(70);
        INode<Integer> mySecondNode = new MyNode<>(30);
        INode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
         INode<Integer> pop =   myStack.pop();
         myStack.printStack();
     Assert.assertEquals(myThirdNode,pop);
    }



}
