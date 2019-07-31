package ZConvert;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private static Solution solution = new Solution ();

    @Test
    public void check_simple_convert(){
        String s = solution.convert ( "abc",1 );
        assertEquals ( "abc",s );
    }

    @Test
    public void check_row_3_convert(){
        String s = solution.convert ( "LEETCODEISHIRING",3 );
        assertEquals ( "LCIRETOESIIGEDHN",s );
    }

    @Test
    public void check_row_4_convert(){
        String s = solution.convert ( "LEETCODEISHIRING",4 );
        assertEquals ( "LDREOEIIECIHNTSG",s );
    }

}