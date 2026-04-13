
class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || (head!=null && head.next==null)){
            return head;
        }


        // ListNode curr=head;
        ListNode one=head;
        ListNode after=one.next;
        ListNode prev=null;

        int count=1;

        //new logic
        while((one!=null && one.next!=null) ){
            after=one.next;
            if(count%2==1){
                ListNode temp=after.next;
                one.next=temp;
                after.next=one;
                if(prev!=null) prev.next=after;
                count++;
                if(prev==null){
                    head=after;
                    prev=one;
                }
                prev=one;
            }
            one=one.next;
            count++;
        }

        //[2,5,3,4,6,2,2]
        //

        return head;
    }
}