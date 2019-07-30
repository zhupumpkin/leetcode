package LongestPalindromeMethod2;

public class Solution {

    public String longestPalindrome(String s) {
        int length = s.length ();
        if(length == 0) return null;
        boolean[][] dp = new boolean[length][length];
        String maxString = s.substring ( 0,1 );
        int step = 0;
        while(step != length ){
            for(int i = 0; i+step!=length;i++){
               if(step == 0 ) {
                   setDP ( dp, i, step, true );
               }
               else if(step == 1){
                   if ( s.charAt (i ) == s.charAt ( i +step ) ) {
                       setDP ( dp, i, step, true );
                       if(step + 1 > maxString.length ()){
                           maxString = getMaxString ( s, i, step );
                       }
                   }
                   else setDP ( dp, i, step, false );
               }
               else if(i >=0 && i + step <length){
                   if(s.charAt ( i ) == s.charAt ( i+step ) && dp[i+1][i+step-1] == true){
                       setDP ( dp, i, step, true );
                       if(step + 1 > maxString.length ()){
                           maxString = getMaxString ( s, i, step );
                       }
                   }else {
                       setDP ( dp, i, step, false );
                   }
               }
            }
            step +=1;

        }
        return maxString;


    }

    private String getMaxString(String s, int i, int step) {
        String maxString;
        maxString = s.substring ( i, i + step + 1 );
        return maxString;
    }

    private void setDP(boolean[][] dp, int i, int j, boolean b) {
        dp[i][i + j] = b;
    }
}
