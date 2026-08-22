/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // if(head == null || head.next == null){
        //     return head;
        // }

        ListNode node =null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }

        return node;
    }

    // public ListNode healper(ListNode head){
    //     if(head.next == null){
    //         return head;
    //     }

    //     ListNode newHead = healper(head.next);

    //     head.next.next = head;
    //     head.next = null;

    //     return newHead;
    // }
}