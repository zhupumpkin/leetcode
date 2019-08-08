package IsPalindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void check_1221_is_true(){
        assertTrue ( Solution.isPalindrome(1221) );
        assertFalse ( Solution.isPalindrome ( 1234 ) );
        assertFalse ( Solution.isPalindrome ( -123 ) );
        assertTrue ( Solution.isPalindrome ( 1 ) );
        assertTrue ( Solution.isPalindrome ( 121 ) );
    }

}