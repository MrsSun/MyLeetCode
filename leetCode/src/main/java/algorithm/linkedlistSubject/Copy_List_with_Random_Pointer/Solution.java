package algorithm.linkedlistSubject.Copy_List_with_Random_Pointer;

/**
 * Created by chaoge on 2017/3/7.
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return null;

        //第一遍循环，复制每一个节点，并插入到旧节点的后面
        for(RandomListNode phead = head; phead != null; ){
            RandomListNode newnode = new RandomListNode(phead.label);
            newnode.next = phead.next;
            phead.next = newnode;
            phead = newnode.next;
        }
        //第二遍循环，复制节点的random引用
        for(RandomListNode phead = head; phead != null&&phead.next != null; ){
            if(phead.random != null )
              phead.next.random = phead.random.next;
            phead = phead.next.next;
        }
        //第三遍循环，将组合链表拆开
        RandomListNode newhead = head.next;

        RandomListNode copynode = head;
        for(RandomListNode phead = head; phead != null;phead = phead.next ){
            copynode = phead.next;
            if(copynode != null)
            phead.next = copynode.next;
            if(copynode.next != null && copynode != null)
            copynode.next = copynode.next.next;
        }
        return newhead;
    }
}










