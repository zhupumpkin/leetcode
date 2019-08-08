package IsPalindrome;

public class Solution {
    public static boolean isPalindrome(int i) {
        int left = i;
        if ( left <0 ) return false;
        if ( left >=0 && left <10) return true;
        int right = 0;
        int last = 0;
        while ( left != 0 ){
            last =  left % 10;
            left /= 10;
            right = right * 10 + last;
        }
        if(i == right) return  true;
        else return false;
    }
}
