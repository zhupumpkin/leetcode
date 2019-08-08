package CodingDojo;

import org.junit.Test;


import static org.junit.Assert.*;

public class FizzBuzzTest {
    private static Student student = new Student();
    private static Conditions conditions = new Conditions ();

    @Test
    public void should_say_1_when_student_is_1(){
        String res = student.say(1,conditions);
        assertEquals ( "1",res );
    }

    @Test
    public void should_say_Fizz_when_student_is_3(){
        String res = student.say(3,conditions);
        assertEquals ( "Fizz",res );
    }

    @Test
    public void should_say_Buzz_when_student_is_5(){
        String res = student.say(5,conditions);
        assertEquals ( "Buzz",res );
    }

    @Test
    public void should_say_FizzBuzz_when_student_is_15(){
        String res = student.say(15,conditions);
        assertEquals ( "FizzBuzz",res );
    }

    @Test
    public void should_say_from_1_15_when_student_is_15(){
        Conditions con = new Conditions ();
        Game game = new Game ( 15,con );
        String[] res = game.run();
        String[] expect =new String[] {
                "1", "2", "Fizz",
                "4", "Buzz", "Fizz",
                "7", "8", "Fizz",
                "Buzz", "11", "Fizz",
                "Fizz", "14", "FizzBuzz",
        };
        assertArrayEquals (expect , res);
    }




}