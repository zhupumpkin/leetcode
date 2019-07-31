package InterReverse;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    public static Solution solution = new Solution ();

    @Test
    public void check_simple_reverse(){
        assertEquals ( 0, solution.reverse ( 0 ));
    }

    @Test
    public void check_123_reverse(){
        assertEquals ( 321, solution.reverse ( 123 ));
    }

    @Test
    public void check_negative_123_reverse(){
        assertEquals ( -321, solution.reverse ( -123 ));
    }

    @Test
    public void check_max_reverse(){
        assertEquals ( 0, solution.reverse ( Integer.MAX_VALUE ));
    }

}