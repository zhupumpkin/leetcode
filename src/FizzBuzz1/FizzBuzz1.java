package FizzBuzz1;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz1 {
    private static String fizz = "Fizz";
    private static String buzz = "Buzz";
    private static String fizzbuzz = "FizzBuzz";


    public  String call(int number) {
        if( isFizzBuzz ( number ) ) return  fizzbuzz;
        if( isFizz ( number ) ) return fizz;
        if( isBuzz ( number) ) return buzz;
        return String.valueOf ( number );
    }

    private boolean isBuzz(int number) {
        return isDivid ( number, 5 ) || isIncluded ( number,5 );
    }

    private boolean isFizz(int number) {
        return isDivid ( number, 3 ) || isIncluded(number,3);
    }

    private boolean isDivid(int number, int i) {
        return number % i == 0;
    }

    private boolean isIncluded(int number, int i){
        return String.valueOf ( number ).indexOf ( String.valueOf ( i ) ) >=0;
    }

    private boolean isFizzBuzz(int number) {
        return isFizz ( number ) && isBuzz ( number);
    }

    public String[] count(int i) {
        if(i < 1) return null;
        String[] res = new String[i];
        for(int index=1;index<=i;index ++){
            res[index-1] = call ( index );
        }
        return res;
    }
}
