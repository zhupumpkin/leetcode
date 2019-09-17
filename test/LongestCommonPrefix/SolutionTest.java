package LongestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution ();

    @Test
    public void check_resturn_fl(){
        String[] sample = new String[]{
                "flower",
                "flow",
                "flight"
        };
        assertEquals ( "fl",solution.longestCommonPrefix ( sample ) );
    }

    @Test
    public void check_resturn_null(){
        String[] sample = new String[]{
                "aba","c","b","a","ab"
        };
        assertEquals ( "",solution.longestCommonPrefix ( sample ) );
    }


}