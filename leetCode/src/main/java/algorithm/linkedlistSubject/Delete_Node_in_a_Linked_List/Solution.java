package algorithm.linkedlistSubject.Delete_Node_in_a_Linked_List;

/**
 * Created by chaoge on 2017/3/4.
 */

/**
 * 覆盖方法，时间复杂度为O(1)，但是不适应最后一个节点
 */
public class Solution {
    public void deleteNode(ListNode node) {
       if(node.next != null){
           node.val = node.next.val;
           node.next = node.next.next;
       }
    }
}

