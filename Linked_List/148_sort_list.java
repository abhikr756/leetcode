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
    public ListNode sortList(ListNode head) {
    ListNode temp = new ListNode(0);
   ArrayList<Integer> list = new ArrayList();
    ListNode temp1 = head;
    while(temp1!=null){
        list.add(temp1.val); 
        temp1=temp1.next;
    }
    Collections.sort(list);
    ListNode tempHead = temp;
    for(int i =0; i<list.size(); i++){
        tempHead.next = new ListNode(list.get(i));
        tempHead = tempHead.next;
    }
    return temp.next;    
    }
}