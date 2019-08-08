package CodingDojo;

public class Conditions {
    private static String FIZZBUZZ = "FizzBuzz";
    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";



    private boolean satisfyFizz( int i){
        return i %3 == 0 || String.valueOf ( i ).contains ( "3" );

    }
    private boolean satisfyBuzz(int i){
        return i % 5 == 0 || String.valueOf ( i ).contains ( "5" );

    }

    public String convert(int i) {
        if (satisfyFizz ( i ) && satisfyBuzz ( i )) return FIZZBUZZ;
        if (satisfyBuzz ( i ))  return BUZZ;
        if (satisfyFizz ( i )) return FIZZ;
        return String.valueOf ( i );
    }
}
