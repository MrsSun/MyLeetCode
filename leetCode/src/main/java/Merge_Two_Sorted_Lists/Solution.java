package Merge_Two_Sorted_Lists;

/**
 * Created by chaoge on 2017/3/12.
 */
import LinkListNode.ListNode;
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        ListNode phead1 = l1;
        ListNode phead2 = l2;
        ListNode head = new ListNode(-1);
        ListNode phead = head;
        while(phead1 != null && phead2 != null){
            if(phead1.val <= phead2.val){
                phead.next = phead1;
                phead = phead1;
                phead1 = phead1.next;
            }
            else {
                phead.next = phead2;
                phead = phead2;
                phead2 = phead2.next;
            }
        }
        while (phead1 != null) {
            phead.next = phead1;
            phead = phead1;
            phead1 = phead1.next;
        }
        while (phead2 != null){
            phead.next = phead2;
            phead = phead2;
            phead2 = phead2.next;
        }
        return head.next;
    }
}
