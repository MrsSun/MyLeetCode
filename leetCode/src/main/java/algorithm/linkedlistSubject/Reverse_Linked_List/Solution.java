package algorithm.linkedlistSubject.Reverse_Linked_List;
import algorithm.linkedlistSubject.LinkListNode.ListNode;
/**
 * Created by chaoge on 2017/3/10.
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode pre = head;
        for(ListNode p = head.next; p!= null; ){
            ListNode t = p.next;
            p.next = pre;
            pre = p;
            p = t;
        }
        head.next = null;
        return pre;
    }
}
