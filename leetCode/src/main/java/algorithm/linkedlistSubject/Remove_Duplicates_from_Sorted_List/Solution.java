package algorithm.linkedlistSubject.Remove_Duplicates_from_Sorted_List;

/**
 * Created by chaoge on 2017/3/10.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        for(ListNode pre = head,p = head.next; p != null; p = p.next){
            if(pre.val == p.val) pre.next = p.next;
            else pre = p;
        }
        return head;
    }
}
