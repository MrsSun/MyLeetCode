package algorithm.linkedlistSubject.Remove_Duplicates_from_Sorted_ListII;

/**
 * Created by chaoge on 2017/3/12.
 */
import algorithm.linkedlistSubject.LinkListNode.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        //首先删除头结点
       boolean headdelete = false;
       while(head!=null&&head.next!=null&&head.val==head.next.val){
           head = head.next;
           headdelete = true;
       }
        if (headdelete) head = head.next;
       ListNode p = head;
       for(ListNode pre = head;p != null ; p = p.next){
           if(pre.val == p.val){
               pre.next = p.next;
           }
           else{
               pre = p;
           }
       }
        return head;
    }
}
