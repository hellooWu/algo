package algo;

import basic.Node;

/** 反转链表
 * Created by 巫佳龙 on 2019/3/24.
 */
public class ReverseList {

    public static Node reverse(Node head) {
        if (head != null) {
            Node behind = head, after = behind.next, last;
            while (after != null){
                last = after.next;
                after.next = behind;
                behind = after;
                after = last;
            }
            head.next = null;
            return behind;
        }
        return head;
    }
}
