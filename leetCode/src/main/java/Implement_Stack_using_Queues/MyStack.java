package Implement_Stack_using_Queues;


import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by chaoge on 2017/3/22.
 */
public class MyStack {
    /** Initialize your data structure here. */
     LinkedList<Integer> q;
    public MyStack() {
       q = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
          q.addFirst(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
         return q.pollFirst();
    }

    /** Get the top element. */
    public int top() {
        return q.peekFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty() ? true : false;
    }
}
