package LongestSubstringWithoutRepeatingCharacters;

import static org.junit.Assert.*;
import org.junit.*;

public class SolutionTest {
    static private String s1 = "abcabcbb";
    static private String s2 = "bbbbb";
    static private String s3 = "pwwkew";
    static private Solution solution = new Solution ();

    @Test
    public void check_result_when_given_s1(){
        int ans = solution.lengthOfLongestSubstring ( s1 );
        assertEquals ( 3,ans );
    }

    @Test
    public void check_result_when_given_s2(){
        int ans = solution.lengthOfLongestSubstring ( s2 );
        assertEquals ( 1,ans );
    }

    @Test
    public void check_result_when_given_s3(){
        int ans = solution.lengthOfLongestSubstring ( s3 );
        assertEquals ( 3,ans );
    }

    @Test
    public void check_result_when_given_test(){
        int ans = solution.lengthOfLongestSubstring ( "bbtablud" );
        assertEquals ( 6,ans );
    }


}