package algo;

import basic.Node;

import java.lang.reflect.Array;
import java.util.Arrays;

import static algo.JudgeCycle.hasCycle;
import static algo.ReverseList.reverse;

/**
 * Created by 巫佳龙 on 2019/3/24.
 */
public class Test {

    public static void main(String[] args) {

        int[] a = new SearchRange().searchRange(new int[]{0}, 1);

        System.out.println(Arrays.toString(a));

    }

    static void testJudgeCycle() {
        Node head = chain();
        System.out.println(hasCycle(head));
    }

    static void testReverseList() {
        Node head = chain();
        print(head);
        print(reverse(head));
        print(head);
    }


    private  static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static Node chain() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        return a;
    }


    static class Fa {

        void a(final Node a) {

        }

    }

    static class So extends Fa{

        @Override
        void a(Node a) {
            a = new Node(1);
        }

    }


    final static class A implements Cloneable{

        int age = 10;

        public String a;

        @Override
        protected Object clone() throws CloneNotSupportedException {
            A b = (A)super.clone();
            b.a = new String(a);
            return b;
        }
    }


}
