/*
 * Check if there is a loop in a LinkedList
 *
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class LoopInLinkedList {
    public boolean hasCycle(ListNode head) {
        boolean result = false;
        if (head == null || head.next == null) {
            return result;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                result = true;
                return result;
            }
        }
        return result;
    }
}