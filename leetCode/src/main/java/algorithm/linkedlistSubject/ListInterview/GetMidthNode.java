package algorithm.linkedlistSubject.ListInterview;
import algorithm.linkedlistSubject.LinkListNode.ListNode;
/**
 * Created by chaoge on 2017/3/10.
 */
public class GetMidthNode {
    public ListNode getMidthNode(ListNode head){
        ListNode low = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            low = low.next;
            fast = fast.next.next;
        }
        return low;
    }

}
