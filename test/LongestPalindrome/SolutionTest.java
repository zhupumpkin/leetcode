package LongestPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private static String s1 = "cbbd";
    private static String s2 = "babad";
    private static Solution solution = new Solution ();

    @Test
    public void check_s1_bb(){
        assertEquals ( "bb",solution.longestPalindrome ( s1 ) );

    }

    @Test
    public void check_s2_bb(){
        assertEquals ( "bab",solution.longestPalindrome ( s2 ) );

    }
}