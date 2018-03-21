/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next;
        ListNode prev;
        if(head == null || head.next == null)
            return head;
        prev = head;
        head = head.next;
        prev.next = null;
        if(head.next != null){
            next = head.next;
            while(next.next != null){
                head.next = prev;
                prev = head;
                head = next;
                next = next.next;
                }
            head.next = prev;
            prev = head;
            head = next;
            head.next = prev;
        }
        else{
            next = new ListNode(0);
            next.next = null;
            head.next = prev;
            prev = head;
        }
        
        return head;
    }
}