package com.example.DailyPractice;

/**
 * create by Freedom on 2020/11/13
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class November13 {

    public static ListNode oddEvenList(ListNode head) {
        //1 2 3 4 5
        if (head == null || head.next == null) {
            return head;
        }
        //head 为头节点
        //oddTail奇数节点的尾巴
        ListNode oddTail = head; //1
        ListNode evenTail = head.next; //2
        ListNode evenHead = evenTail;//1
        while (oddTail.next != null && evenTail.next != null) {
            oddTail.next = evenTail.next;
            oddTail = oddTail.next;
            evenTail.next = oddTail.next;
            evenTail = evenTail.next;
        }
        oddTail.next = evenHead;
        return head;
    }

    public static ListNode oddEvenList2(ListNode head) {
        ListNode oddHead = new ListNode();
        ListNode evenHead = new ListNode();
        ListNode oddTail = oddHead; //1
        ListNode evenTail = evenHead; //2
        boolean flag = true;
        while (head != null) {
            if (flag) {
                oddTail.next = head;
                oddTail = oddTail.next;
            } else {
                evenTail.next = head;
                evenTail = evenTail.next;
            }
            flag = !flag;
            head = head.next;
        }
        oddTail.next = evenHead.next;
        evenTail.next = null;
        return oddHead.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode nodeHead = node;
        for (int i = 2; i < 6; i++) {
            nodeHead.next = new ListNode(i);
            nodeHead = nodeHead.next;
        }
//        while (node!=null){
//            System.out.println(node.val);
//            node = node.next;
//        }
        ListNode list = oddEvenList2(node);
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
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
    }

}
