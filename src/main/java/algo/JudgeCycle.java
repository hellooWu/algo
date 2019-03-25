package algo;

import basic.Node;

/** 判断链表是否有环
 * Created by 巫佳龙 on 2019/3/24.
 */
public class JudgeCycle {


    public static boolean hasCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


}
