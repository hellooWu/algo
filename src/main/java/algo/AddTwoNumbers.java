package algo;

import basic.ListNode;

/**

 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 示例：
 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807

 * Created by 巫佳龙 on 2019/5/22.
 */
public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null, pot = null;
        int accu = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + accu;
            accu = sum / 10;
            ListNode node = new ListNode(sum % 10);
            if (res == null) {
                res = node;
            } else {
                pot.next = node;
            }
            pot = node;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = accu + l1.val;
            accu = sum / 10;
            ListNode node = new ListNode(sum % 10);
            pot.next = node;
            pot = node;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = accu + l2.val;
            accu = sum / 10;
            ListNode node = new ListNode(sum % 10);
            pot.next = node;
            pot = node;
            l2 = l2.next;
        }
        if (accu > 0) {
            ListNode node = new ListNode(accu);
            pot.next = node;
        }
        return res;

    }



}
