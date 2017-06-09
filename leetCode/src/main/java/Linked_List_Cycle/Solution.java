package Linked_List_Cycle;

/**
 * Created by chaoge on 2017/3/8.
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       boolean is_has = false;
       if(head == null) return is_has;
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
           fast = fast.next.next;
           if(fast == slow)
               return is_has = true;
           slow = slow.next;
       }
       return is_has;
    }
}
