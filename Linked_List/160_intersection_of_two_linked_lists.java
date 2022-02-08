/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode a=headA,b=headB;
       HashSet <ListNode> intersect =new HashSet<>();
        while(a!=null)
        {
            intersect.add(a);
            a=a.next;
        }
        while(b!=null)
        {
            if(!intersect.add(b))
            {
                return b;
            }
            b=b.next;
        }
        return null;
    }
}