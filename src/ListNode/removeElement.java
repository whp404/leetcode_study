package ListNode;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/**
 *  [203] 移除链表元素
 */
public class removeElement {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1,head);
        if(head == null){
            return head;
        }
        ListNode tmp  = dummyHead;
        while(head!=null){

            if(head.val == val){
                tmp.next = head.next;
                head = head.next;
            }else{
                tmp = tmp.next;
                head = head.next;
            }
        }

        return dummyHead.next;
    }
}
