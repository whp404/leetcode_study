package ListNode;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 * leetocde 24
 */
public class reverseTwoElement {

    public ListNode swapPairs(ListNode head) {
        if(head ==null || head.next == null){
            return head;
        }
        //注意迭代！！！！！
        ListNode tmp = head.next;
        ListNode newNode = swapPairs(tmp.next);
        head.next = newNode;
        tmp.next = head;
        return tmp;

    }
}
