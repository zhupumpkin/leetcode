package AddTwoNumbers;


public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode head = null;
        ListNode last = head;
        ListNode current;
        int carry = 0;

        while(h1 !=null || h2!=null ){
            current = null;
            int v1 = 0,v2=0;
            if(h1 == null){
                v1 = 0;
            }else {
                current = h1;
                v1 = h1.val;
                h1=h1.next;
            }
            if(h2 == null){
                v2 = 0;
            }else {
                v2 = h2.val;
                if(current ==null){
                    current = h2;
                }
                h2 = h2.next;
            }
            current.val = v1 + v2 + carry;
            if(current.val >= 10){
                current.val = current.val - 10;
                carry = 1;
            }else {
                carry = 0;
            }
            if(last!=null){
                last.next = current;
                last = current;
            }else {
                last = current;
                head = last;
            }
        }

        if(carry!=0){
            current = new ListNode ( carry );
            if(last!=null){
                last.next = current;
            }else {
                head = last;
            }

        }
        return  head;

    }




    public static ListNode numberToNodeList(int num) {
        ListNode l = null;
        ListNode last = l;
        if(num == 0){
            //the number is zereo
            l = new ListNode ( num );
            return l;
        }

        while (num!=0) {
            int pos1 = num % 10;
            ListNode n = new ListNode ( pos1 );
            if ( l == null ) {
                l = n;
                last = n;
            } else {
                last.next = n;
                last = n;
            }
            num = num/10;
        }

        return l;
    }

}
