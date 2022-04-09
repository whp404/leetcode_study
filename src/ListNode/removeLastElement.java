package ListNode;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结
 * 还有双指针版本
 */
public class removeLastElement {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode dummyNode = new ListNode(0,head);
        int size = 0;
        while(head!=null){
            size++;
            head = head.next;
        }
        int tmp = size - n;
        ListNode cur = dummyNode;
        while(tmp-->0){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummyNode.next;
    }
}
