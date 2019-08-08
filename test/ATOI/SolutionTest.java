package ATOI;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private static Solution solution = new Solution ();
    private static String str1 = new String ( "   123XXX" );
    private static String str2 = new String ( " +123X23" );
    private static String str3 = new String ( "   -123X33" );

    public int convert(String i){
        return solution.myAtoi ( i );
    }
    @Test
    public void  check_1_should_return_1(){
        assertEquals ( 1,convert ( "1" ) );
        assertEquals ( 123,convert ( str2 ) );
    }

    @Test
    public void check_very_large_number(){
        System.out.println ( Solution.MAX_INT );
        System.out.println ( Solution.MIN_INT );
        assertEquals ( Solution.MAX_INT,convert ( "222222222222222222222222222222222222" ) );
        assertEquals ( Solution.MIN_INT,convert ( "-2222222222222222222222222222222222222" ) );
        assertEquals ( Solution.MAX_INT,convert ( "2147483648" ) );
        assertEquals ( 12345678,convert ( "0000000000012345678" ) );
    }

    @Test
    public void check_str_start(){
        assertEquals ( 3,solution.findStart ( str1 ) );
        assertEquals ( 1,solution.findStart ( str2 ) );
        assertEquals ( 3,solution.findStart ( str3 ) );
    }

    @Test
    public void check_str_end(){
        assertEquals ( 6,solution.findEnd ( str1 ) );
        assertEquals ( 5,solution.findEnd ( str2 ) );
        assertEquals ( 7,solution.findEnd ( str3 ) );
    }

    @Test
    public void check_convert_function(){
        assertEquals ( 123,solution.convert(str1,3,6) );
        assertEquals ( 123,solution.convert(str2,1,5) );
        assertEquals ( -123,solution.convert(str3,3,7) );
    }
}
