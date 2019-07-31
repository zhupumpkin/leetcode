package InterReverse;

public class Solution1 {

    public int reverse(int x) {
        if(-10 < x && x < 10) return x;
        boolean negative = false;
        if( x < 0) {
            negative=true;
            x = -x;
        }
        int rev = 0;
        int last ;
        while ( x !=0){
            last = x % 10;
            x = x/10;
            int left = rev * 10;
            int temp = left + last;
            if( left/10 != rev || temp-left != last) return 0;
            else {
                rev = temp;
                continue;
            }

        }
        if ( negative == true) rev = -rev;
        return rev;
    }
}
