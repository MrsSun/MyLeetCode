package GetLinkedListCycleBegin;

/**
 * Created by chaoge on 2017/3/12.
 */

import LinkListNode.ListNode;
public class Solution {
    public ListNode detectCycle(ListNode head) {
      if(head == null) return null;
      ListNode fast = head;
      ListNode slow = head;
      while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
          if(fast == slow){
             slow = head;
             while(true){
               if(slow == fast)
                   return slow;
              slow = slow.next;
              fast = fast.next;
             }
          }
      }
        return null;
    }
}
