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
    public static int size(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode middleNode(ListNode head) {
        int n=(size(head))/2 +1 ;
        
        int i=0;
        while(head!=null){
            i++;
            if(i==n){
                return head;
            }
            head=head.next;
        }
        return head;
    }
    
}