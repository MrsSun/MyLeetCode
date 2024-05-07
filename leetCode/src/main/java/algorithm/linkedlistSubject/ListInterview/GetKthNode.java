package algorithm.linkedlistSubject.ListInterview;
import algorithm.linkedlistSubject.LinkListNode.ListNode;
/**
 * Created by chaoge on 2017/3/10.
 */
public class GetKthNode {
    public ListNode getKthNode(ListNode head,int k){
        if(head == null) return null;
        ListNode pre = head;
        ListNode p = head;
        while(--k >= 0 ){
            if( p == null) return null;
            p = p.next;
        }
        while(p != null){
            pre = pre.next;
            p = p.next;
        }
        return  pre;
    }
}
