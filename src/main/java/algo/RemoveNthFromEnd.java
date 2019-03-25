package algo;

import basic.Node;

/** 删除链表倒数第N个节点
 * Created by 巫佳龙 on 2019/3/25.
 */
public class RemoveNthFromEnd {


    public static Node removeNthFromEnd(Node head, int n) {
        if (n <= 0) {
            return head;
        }
        Node fast = head;
        while (fast != null && n-- >0){
            fast = fast.next;
        }
        if (n > 0) {
            return head;
        }
        Node slow = head;
        while (fast != null){
            if (fast.next == null){
                if (slow.next == null) {
                    return null;
                }
                slow.next = slow.next.next;
                return head;
            }
            slow = slow.next;
            fast = fast.next;
        }
        // fast == null
        head = head.next;
        return head;
    }



}
