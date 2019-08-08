package FizzBuzz1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzz1Test {
    public  static FizzBuzz1 fizz = new FizzBuzz1 ();

    @Test
    public void check_number_3_is_fizz(){
        assertEquals ( "Fizz", fizz.call(3));
    }

    @Test
    public void check_number_1_is_1(){
        assertEquals ( "1", fizz.call(1));
    }

    @Test
    public void check_number_5_is_buzz(){
        assertEquals ( "Buzz", fizz.call(5));
    }

    @Test
    public void check_number_15_is_FizzBuzz(){
        assertEquals ( "FizzBuzz", fizz.call(15));
    }

    @Test
    public void check_number_31_is_Fizz(){
        assertEquals ( "Fizz", fizz.call(31));
    }
    @Test
    public void check_number_52_is_Buzz(){
        assertEquals ( "Buzz", fizz.call(52));
    }

    @Test
    public void check_number_51_is_Buzz(){
        assertEquals ( "FizzBuzz", fizz.call(51));
    }

    @Test
    public void check_number_35_is_Buzz(){
        assertEquals ( "FizzBuzz", fizz.call(35));
    }

    @Test
    public void check_number_53_is_Buzz(){
        assertEquals ( "FizzBuzz", fizz.call(53));
    }

    @Test
    public void check_output_from_1_to_15(){
        String[] exp = new String[] {
                "1","2","Fizz","4","Buzz",
                "Fizz","7","8","Fizz","Buzz",
                "11","Fizz","Fizz","14","FizzBuzz"};
        String[] res = fizz.count(15);
        assertArrayEquals ( exp,res );
    }

}