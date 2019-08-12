package RegressionExpressionMatching;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution = new Solution ();

    @Test
    public void check_a_match_a(){
        assertEquals ( true,Solution.matchPosition("a","a",0,0) );
        assertEquals(false,solution.isMatch ( "aa","a" ));
        assertEquals(true,solution.isMatch ( "aa","a*" ));
        assertEquals(true,solution.isMatch ( "ab",".*" ));
        assertEquals(true,solution.isMatch ( "aab","c*a*b" ));
        assertEquals ( false,solution.isMatch ( "mississippi","mis*is*p*." ) );
        assertEquals ( false,solution.isMatch ( "","." ) );
        assertEquals ( true,solution.isMatch ( "","c*c*" ) );

    }


}