package IntegertoRoman;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution ();

    @Test
    public void assert_3_is_III(){
        assertEquals ( "III",solution.intToRoman(3) );
    }

    @Test
    public void assert_4_is_IV(){
        assertEquals ( "IV",solution.intToRoman(4) );
    }

    @Test
    public void assert_9_is_IX(){
        assertEquals ( "IX",solution.intToRoman(9) );
    }
    @Test
    public void assert_58_is_LVIII(){
        assertEquals ( "LVIII",solution.intToRoman(58) );
    }

    @Test
    public void assert_1994_is_MCMXCIV(){
        assertEquals ( "MCMXCIV",solution.intToRoman(1994) );
    }



}