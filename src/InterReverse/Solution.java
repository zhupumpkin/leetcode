package InterReverse;

public class Solution {
    public int reverse(int x) {
        int res = 0;
       if(-10 < x && x < 10) return x;
       boolean positive = true;
       if(x < 0){
           positive = false;
           x = - x;
       }
       StringBuilder  convert = new StringBuilder (  String.valueOf ( x )).reverse ();
       try {
           res = Integer.parseInt ( convert.toString () );
           if(positive==false) res = -res;

       }catch (Exception e){
           return 0;
       }
       return res;


    }
}
