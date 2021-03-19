package com.example.DailyPractice;

/**
 * create by Freedom on 2021/3/18
 * 给你单链表的头节点 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 * <p>
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 */
public class _0318_reverseBetween {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4, new ListNode(5));
        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(reverseBetween2(node, 2, 4));
//        System.out.println(reverse2(node));
    }

//    public static ListNode reverse(ListNode head) {
//        if (head == null || head.next == null)
//            return head;
//        ListNode node = reverse(head.next);
//        head.next.next = head;
//        head.next = null;
//        return node;
//    }

    public static ListNode reverse2(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newNode = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }
        return newNode;
    }

    public static ListNode reverseBetween2(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode guard = dummyHead;
        ListNode point = dummyHead.next;

        int step = 0;
        while (step < left - 1) {
            guard = guard.next;
            point = point.next;
            step++;
        }

        for (int i = 0; i < right - left; i++) {
            ListNode removed = point.next;
            point.next = point.next.next;

            removed.next = guard.next;
            guard.next = removed;
        }

        return dummyHead.next;
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy; //这里一定要有一个pre,为什么, 防止你的left是1, 如果是1,那么如果不存在这个pre,就头节点就丢了.
        for (int i = 1; i < left; i++) {
            pre = pre.next;
        }
        head = pre.next;
        for (int i = left; i < right; i++) {
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        System.out.println("pre = " + pre);
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
