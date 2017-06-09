package tes;

/**
 * Created by chaoge on 2017/5/28.
 */
import tes.Solution;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        ListNode newhead = new ListNode(-1);
        ListNode p = newhead;
        while (l1 != null && l2 != null){
            if(l1.val <= l2.val){
                p.next = l1;
                p = l1;
                l1 = l1.next;
            }
            else {
                p.next = l2;
                p = l2;
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            p.next = l1;
            p = l1;
            l1 = l1.next;
        }
        while (l2 != null){
            p.next = l2;
            p = l2;
            l2 = l2.next;
        }

        return newhead.next;
    }
}



















