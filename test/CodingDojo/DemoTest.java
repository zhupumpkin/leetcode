package CodingDojo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void should_2_when_1_add_1(){
        assertEquals ( 2,Demo.addSum(1,1) );
    }

    @Test
    public void should_3_when_1_add_2(){
        assertEquals ( 3,Demo.addSum ( 1,2 ) );
    }

}