public class ReverseLinkedList2 {

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
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode curr=head;
            ListNode prev=null;
            ListNode one =null;
            ListNode then=null;
            int count=1;
            ListNode x= null;
            boolean istrue= false;
            while(count<left ){
                x=curr;
                curr=curr.next;
                count++;
            }
            while(count>=left && count<=right){
                if(istrue==false){
                    one=curr;
                    istrue=true;
                }
                then=curr.next;
                curr.next=prev;
                count++;
                prev=curr;
                curr=then;
            }
            one.next=curr;
            if(x!=null){
                x.next=prev;
            }
            else{
                head=prev;
            }

            return head;
        }


}
