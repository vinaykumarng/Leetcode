/**
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
public class Solution {
    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }
        ListNode tptr1 = head;
        ListNode tptr2 = head;
        while(tptr2!= null && tptr2.next != null){
            tptr1 = tptr1.next;
            tptr2 = tptr2.next.next;

            if(tptr1 == tptr2){
                return true;
            }
        }

        return false;

        // if(tptr1.val == tptr2.val){
        //     return true;
        // }else{
        //     return false;
        // }
    }
}