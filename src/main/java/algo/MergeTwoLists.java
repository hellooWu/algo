package algo;

import basic.Node;

/** 合并两个有序数组
 * Created by 巫佳龙 on 2019/3/25.
 */
public class MergeTwoLists {


    public static Node mergeTwoLists(Node l1, Node l2) {
        Node head = null, point = null;

        while (l1 != null && l2 != null){
            if (l1.data <= l2.data) {
                if (head == null) {
                    point = head = l1;
                } else {
                    point.next = l1;
                    point = l1;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    point = head = l2;
                } else {
                    point.next = l2;
                    point = l2;
                }
                l2 = l2.next;
            }
        }


        while (l1 != null) {
            if (head == null) {
                point = head = l1;
            } else {
                point.next = l1;
                point = l1;
            }
            l1 = l1.next;
        }

        while (l2 != null) {
            if (head == null) {
                point = head = l2;
            } else {
                point.next = l2;
                point = l2;
            }
            l2 = l2.next;
        }

        return head;

    }




}
