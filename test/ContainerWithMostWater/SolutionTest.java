package ContainerWithMostWater;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution ();

    @Test
    public void simple_test(){
        int[] area = new int[]{1,8,6,2,5,4,8,3,7};
        assertEquals ( 49,solution.maxArea ( area ));
    }

}