package com.zhuliang.twosum;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void simply_check(){
        int[] numbers = new int[] {2,7};
        int target = 9;
        int[] indics = Solution.twoSum(numbers,target);
        assertArrayEquals ( new int[]{0,1} ,indics );
    }

    @Test
    public void check_for_numbers_result_first_last(){
        int[] numbers = new int[] {2,3,5,7};
        int target = 9;
        int[] indics = Solution.twoSum(numbers,target);
        assertArrayEquals ( new int[]{0,3} ,indics );
    }
    @Test
    public void check_for_numbers_result_first_second(){
        int[] numbers = new int[] {2,3,7,5};
        int target = 9;
        int[] indics = Solution.twoSum(numbers,target);
        assertArrayEquals ( new int[]{0,2} ,indics );
    }

    @Test
    public void check_for_numbers_result_second_last(){
        int[] numbers = new int[] {0,2,5,7};
        int target = 9;
        int[] indics = Solution.twoSum(numbers,target);
        assertArrayEquals ( new int[]{1,3} ,indics );
    }

    @Test
    public void check_four_number_result_second_third(){
        int[] numbers = new int[] {0,2,7,5};
        int target = 9;
        int[] indics = Solution.twoSum(numbers,target);
        assertArrayEquals ( new int[]{1,2} ,indics );
    }

    @Test
    public void check_target_minus(){
        int[] numbers = new int[] {0,-2,-7,-5};
        int target = -9;
        int[] indics = Solution.twoSum(numbers,target);
        assertArrayEquals ( new int[]{1,2} ,indics );
    }





}