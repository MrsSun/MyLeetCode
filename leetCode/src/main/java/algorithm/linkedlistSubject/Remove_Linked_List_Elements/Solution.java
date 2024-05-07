package algorithm.linkedlistSubject.Remove_Linked_List_Elements;

/**
 * Created by chaoge on 2017/3/4.
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val) head = head.next;
        ListNode p = head;
        for(ListNode pre = head; head!=null; head = head.next){
            if(head.val == val) pre.next = head.next;
            else  pre = head;
        }
        return  p;
    }
}
