package algo;

import basic.Node;

/** 寻找环的入口
 * Created by 巫佳龙 on 2019/3/25.
 */
public class DetectCycle {

    public static Node detectCycle(Node head) {
        Node slow = head, fast = head, moon = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (slow != moon) {
                    slow = slow.next;
                    moon = moon.next;
                }
                return slow;
            }
        }
        return null;
    }

    //环的长度
    public static int lenthOfCycle(Node head) {
        int cn = 0, mn = 0;
        Node slow = head, fast = head, moon = head;
        while (fast != null && fast.next != null){
            cn++;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return cn;
            }
        }
        return -1;
    }

    //环入口的长度
    public static int lenthOfCycleEntrance(Node head) {
        int cn = 0, mn = 0;
        Node slow = head, fast = head, moon = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (slow != moon) {
                    slow = slow.next;
                    moon = moon.next;
                    mn++;
                }
                return mn;
            }
        }
        return -1;
    }

}
