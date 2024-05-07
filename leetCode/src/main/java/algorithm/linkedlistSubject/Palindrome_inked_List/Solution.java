package algorithm.linkedlistSubject.Palindrome_inked_List;

/**
 * Created by chaoge on 2017/3/5.
 */

//时间复杂度O(n)，空间复杂度也是O(n)
//public class Solution {
//    public boolean isPalindrome(ListNode head) {
//        boolean is_not = true;
//        ListNode pReversedHead = null;
//        //若链表为空或者只有一个节点
//        if(head == null || head.next == null) return is_not;
//        //反转链表
//        for ( ListNode pHead = head; pHead != null; pHead = pHead.next){
//            ListNode t = new ListNode(pHead.val);
//            t.next = pReversedHead;
//            pReversedHead = t;
//        }
//        for(ListNode pHead = head; pHead != null; ){
//            if(pHead.val == pReversedHead.val){
//                pHead = pHead.next;
//                pReversedHead = pReversedHead.next;
//            }
//            else
//                return is_not = false;
//        }
//        if(pReversedHead == null)
//            return  is_not;
//        else
//            return is_not = false;
//
//    }
//}

/**
 *原地反转
 * 时间复杂度O(n)，空间复杂度是O(1)
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean is_not = true;
        ListNode fast = head;
        ListNode slow = head;
        //链表为空或者链表只有一个元素
        if (head == null || head.next == null) return is_not;
        //寻找反转后半部分的第一个节点，同时还要保存此节点的前继，
        //所以循环的终止条件不是fast!=null&&fast.next!=null
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //后半段反转
        ListNode pReversed = slow.next;//要反转的第一个节点
        ListNode pre = slow;//反转节点前一个节点
        ListNode t;
        while (pReversed != null) {
            t = pReversed.next;
            pReversed.next = pre;
            pre = pReversed;
            pReversed = t;
        }
        //重定向头尾指针
        slow.next.next = null;
        slow.next = pre;
        //前半段和后半段比较
        for (ListNode p = slow.next; p != null; p = p.next) {
            if (head.val != p.val)
                return is_not = false;
            head = head.next;
        }
        return is_not;
    }


   public ListNode Rerseve(ListNode head){
        if(head == null) return null;
        ListNode pre = head;
        ListNode pse = head.next;
        while(pse != null){
            ListNode t = pse.next;
            pse.next = pre;
            pre = pse;
            pse = t;
        }
        head.next = null;
        return pre;
   }


}




















