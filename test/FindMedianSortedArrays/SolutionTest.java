package FindMedianSortedArrays;

import static org.junit.Assert.*;
import  org.junit.*;

public class SolutionTest {
    private static int[] nums1 = new int[]{1,3};
    private static int[] nums2 = new int[]{2};
    private static Solution solution = new Solution ();
    private static int[] nums3 = new int[]{1,2};
    private static int[] nums4 = new int[]{3,4};
    private static int[] nums5 = new int[]{};
    private static int[] nums6 = new int[]{1};
    private static int[] nums7 = new int[]{1,1};
    private static int[] nums8 = new int[]{1,1};
    private static int[] nums9 = new int[]{1};
    private static int[] nums10 = new int[]{2,3,4};


    @Test
    public void check_input_nums1_nums2_output_2(){
        double res = solution.findMedianSortedArrays(nums1,nums2);
        System.out.println ( "res is "+ res );
        assertTrue ( res == 2.0 );
        res = solution.findMedianSortedArrays(nums3,nums4);
        System.out.println ( "res is "+ res );
        assertTrue ( res == 2.5 );
        res = solution.findMedianSortedArrays(nums5,nums6);
        System.out.println ( "res is "+ res );
        assertTrue ( res == 1 );
        res = solution.findMedianSortedArrays(nums7,nums8);
        System.out.println ( "res is "+ res );
        assertTrue ( res == 1 );
        res = solution.findMedianSortedArrays(nums6,nums9);
        System.out.println ( "res is "+ res );
        assertTrue ( res == 1 );
        res = solution.findMedianSortedArrays(nums9,nums10);
        System.out.println ( "res is "+ res );
        assertTrue ( res == 2.5 );
    }



}