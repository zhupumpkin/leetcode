package RomaToInt;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private  Solution solution = new Solution ();

    @Test
    public void  check_III_should_be_3(){
        assertEquals ( 3, solution.romanToInt ( "III" ) );
    }

    @Test
    public void  check_IV_should_be_4(){
        assertEquals ( 4, solution.romanToInt ( "IV" ) );
    }

    @Test
    public void  check_IX_should_be_9(){assertEquals ( 9, solution.romanToInt ( "IX" ) ); }

    @Test
    public void  check_LVIII_should_be_58(){
        assertEquals ( 58, solution.romanToInt ( "LVIII" ) );
    }

    @Test
    public void  check_MCMXCIV_should_be_1994(){
        assertEquals ( 1994, solution.romanToInt ( "MCMXCIV" ) );
    }
}