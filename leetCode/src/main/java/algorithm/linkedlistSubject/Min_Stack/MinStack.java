package algorithm.linkedlistSubject.Min_Stack;

import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by chaoge on 2017/3/22.
 */
public class MinStack {
//    /** initialize your data structure here. */
//    /** initialize your data structure here. */
//    LinkedList<Integer> ls;
//    boolean ischanged;
//    int min;
//    public MinStack() {
//        ls = new LinkedList<Integer>();
//        ischanged = false;
//        min = 2147438647;
//    }
//
//    public void push(int x) {
//       ls.addFirst(x);
//       min = x < min ? x : min;
//    }
//
//    public void pop() {
//       if( !ls.isEmpty() ){
//           if(ls.peekFirst() <= min)
//               ischanged = true;
//           ls.pollFirst();
//       }
//    }
//    public int top() {
//        if( !ls.isEmpty() )
//            return ls.peekFirst();
//        else
//            return -1;
//    }
//    public long getMin() {
//        if( ischanged ){
//            min = ls.peekFirst();
//            for(Integer num : ls){
//                min = num < min ? num : min;
//            }
//        }
//        ischanged = false;
//        return min;
//    }


    /** initialize your data structure here. */
    Stack<Integer> s;
    Stack<Integer> mins;
    public MinStack() {
       s = new Stack<Integer>();
       mins = new Stack<Integer>();
    }

    public void push(int x) {
       if( mins.isEmpty() || mins.peek() >= x)
           mins.push(x);
       s.push(x);
    }

    public void pop() {
        if(s.peek().equals(mins.peek()))
            mins.pop();
        s.pop();
    }

    public int top() {
       return s.peek();
    }

    public int getMin() {
        if( !mins.isEmpty())
        return mins.peek();
        else
            return -1;
    }
}
