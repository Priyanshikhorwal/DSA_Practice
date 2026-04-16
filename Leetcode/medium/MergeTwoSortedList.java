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
class MergeTwoSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode temp=null;
        ListNode curr1=list1;
        ListNode curr2=list2;

        while(curr1!=null && curr2!=null){
            if(curr1.val>=curr2.val){
                if(head==null){
                    head=curr2;
                    temp=head;
                }
                else{
                    temp.next=curr2;
                    temp=temp.next;
                }
                curr2=curr2.next;
            }
            else {
                if(head==null){
                    head=curr1;
                    temp=head;
                }
                else{
                    temp.next=curr1;
                    temp=temp.next;

                }
                curr1=curr1.next;
            }

        }

        if (temp != null) {
            temp.next = (curr1 != null) ? curr1 : curr2;
        } else {
            // when one list was empty from start
            return (curr1 != null) ? curr1 : curr2;
        }

        return head;
    }
}