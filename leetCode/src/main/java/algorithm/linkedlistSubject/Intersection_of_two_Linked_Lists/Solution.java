package algorithm.linkedlistSubject.Intersection_of_two_Linked_Lists;

/**
 * Created by chaoge on 2017/3/6.
 */

//超时，时间复杂度为O(n^2)
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode node = null;
//         ListNode pB = headB;
//         ListNode pA = headA;
//         boolean is_find = false;
//         if(headA == null || headB == null) return node = null;
//         for(; pA != null; pA = pA.next){
//             pB = headB;
//           while(pB != null){
//               if(pA.val == pB.val){
//                   is_find = true;
//                   node = pA;
//                   break;
//               }
//               pB = pB.next;
//           }
//             if(is_find) break;
//         }
//         if(is_find){
//             if(pA == null && pB == null) return  node;
//             else{
//                 while(pA != null && pB != null){
//                     if(pA.val != pB.val)
//                         return node = null;
//                     pA = pA.next;
//                     pB = pB.next;
//                 }
//             }
//         }
//         if((pA == null&&pB !=null) || (pA != null && pB == null))
//             return node = null;
//         return node;
//    }
//}

/**
 * 第一遍循环找到长度差N
 * 第二遍循环，长链表先走N步，然后同时移动，判断是否有相同节点 *
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node = null;
        int lengthA = 0;
        int lengthB = 0;
        boolean is_find = false;
        ListNode startA = headA;
        ListNode startB = headB;

        while(startA != null && startB != null){
            startA = startA.next;
            startB = startB.next;
        }
        while(startA != null) {
            startA = startA.next;
            ++lengthA;
        }
        while(startB != null){
            startB = startB.next;
            ++lengthB;
        }
        //比较长的链表先行
        startA = headA;
        startB = headB;
        while( --lengthA >= 0) startA = startA.next;
        while( --lengthB >= 0) startB = startB.next;
        //开始比较两个节点
        while(startA != null && startB != null){
            if(startA == startB)
                return startA;
            startA = startA.next;
            startB = startB.next;
        }
        return node;
    }

    /**
     * 第三种方法，只判断两个链表的尾节点
     */
    public ListNode getInterNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null) return null;
        ListNode pheadA = headA;
        ListNode pheadB = headB;
        while(pheadA.next != null) pheadA = pheadA.next;
        while(pheadB.next != null) pheadB = pheadB.next;
        if(pheadA == pheadB) return pheadA;
        return null;
    }
}























