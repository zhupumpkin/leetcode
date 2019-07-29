package AddTwoNumbers;

import AddTwoNumbers.ListNode;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SolutionsTest {
    public static ListNode first;
    public static ListNode second;

    @BeforeClass
    public static void init(){
        first = Solution.numberToNodeList ( 123);
        second = Solution.numberToNodeList ( 123 );
    }


    @Test
    public void check_node_list_to_stack(){
        ListNode res = Solution.addTwoNumbers ( first,second );
        int l1 = res.val;
        int l2 = res.next.val;
        int l3 = res.next.next.val;
        assertEquals ( l1, 6);
        assertEquals ( l2, 4);
        assertEquals ( l3, 2);
    }

    @Test
    public void check_5_plus_5(){
        first = Solution.numberToNodeList ( 5 );
        second = Solution.numberToNodeList ( 5 );
        ListNode res = Solution.addTwoNumbers ( first,second );
        int l1 = res.val;
        int l2 = res.next.val;
        assertEquals ( 0,l1 );
        assertEquals ( 1,l2 );
    }

    @Test
    public void check__81_plus_0(){
        first = Solution.numberToNodeList ( 81 );
        second = Solution.numberToNodeList ( 0 );
        ListNode res = Solution.addTwoNumbers ( first,second );
        int l1 = res.val;
        int l2 = res.next.val;
        assertEquals ( 1,l1 );
        assertEquals ( 8,l2 );
    }




}