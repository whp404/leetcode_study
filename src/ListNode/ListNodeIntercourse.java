package ListNode;

/**
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 * 你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 *
 * 图示两个链表在节点 c1 开始相交：
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ListNodeIntercourse {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode curA = headA;
        ListNode curB = headB;
        while(curA!=null){
            curA = curA.next;
            lenA++;
        }

        int lenB = 0;
        while(curB!=null){
            curB = curB.next;
            lenB++;
        }

        curA = headA;
        curB = headB;
        if(lenA < lenB){
            int tmp = lenA;
            lenA = lenB;
            lenB =tmp;

            ListNode cur = curA;
            curA = curB;
            curB =cur;
        }

        int gap = lenA-lenB;
        while(gap-->0){
            curA = curA.next;
        }

        while(curA!=null){
            if(curA==curB){
                return curA;
            }
            curB = curB.next;
            curA = curA.next;
        }
        return null;

    }
}
