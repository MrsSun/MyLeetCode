/**
 * Created by chaoge on 2017/3/5.
 */

import MySort.MySort;
import tes.ListNode;
import tes.MyRunable;
import tes.Solution;
import MyString.MyString;

public class test {
//    public static void main(String[] args) {
//        ListNode headA = new ListNode(1);
//        ListNode headB = new ListNode(2);
//
//        ListNode nodeb = new ListNode(3);
//        ListNode nodeb2 = new ListNode(8);
//        headB.next = nodeb;
//        nodeb.next = nodeb2;
//        nodeb2.next = null;

        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);



//        ListNode node4 = new ListNode(7);
//        ListNode node5 = new ListNode(10);
//        ListNode node6 = new ListNode(13);
//
//
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = null;
//
//        headA.next = node2;
//
//
//        Solution test = new Solution();
//        ListNode node = test.mergeTwoLists(headA,headB);
//        while (node != null){
//            System.out.print(node.val + "  ");
//            node = node.next;
//        }
//    }
    public static boolean TrueOrFalse(ListNode node2,ListNode node3){
        return node2.val == node3.val;
    }
    public static class Node{
        int val;
        public Node(int x){
            val = x;
        }
    }

    public static void main(String []args){

        Runnable myRunable = new MyRunable();

        Thread alpha = new Thread(myRunable);
        Thread beta = new Thread(myRunable);

        alpha.setName("XiaoChao");
        beta.setName("ChouXin");

        alpha.start();
        beta.start();

        System.out.println("back in main ");

    }



}


