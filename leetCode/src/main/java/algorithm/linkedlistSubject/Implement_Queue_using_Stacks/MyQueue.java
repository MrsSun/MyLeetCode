package algorithm.linkedlistSubject.Implement_Queue_using_Stacks;

import java.util.Stack;

/**
 * Created by chaoge on 2017/3/20.
 */
public class MyQueue {
    /** Initialize your data structure here. */
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
      s1 = new Stack<Integer>();
      s2 = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
       s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
      if(!s2.isEmpty()) return s2.pop();
      else {
          while ( !s1.isEmpty()) s2.push(s1.pop());
          return s2.pop();
      }
    }

    /** Get the front element. */
    public Integer peek() {
        if(!s2.isEmpty()) return s2.peek();
        else {
            while ( !s1.isEmpty()) s2.push(s1.pop());
            return s2.peek();
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
       if(s1.empty() && s2.empty()) return true;
       return false;
    }
}
