package ListNode;

/*
给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
反转链表
 */
public class reverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tmp;
    }
}
