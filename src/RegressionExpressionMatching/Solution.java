package RegressionExpressionMatching;

class Solution {
    private static char POINT = '.';
    private static char STAR = '*';

    private static boolean matchPositionRange(String string, String pattern, int left, int right, char beforeStar){
        for(int index = left;index >=0;index-- ){
            if( beforeStar == POINT ||  beforeStar == string.charAt ( index )){
                boolean temp = matchPosition ( string,pattern,index,right  );
                if (temp) return true;
            }else {
                break;
            }
        }
        return false;

    }

    public static boolean matchPosition(String string, String pattern, int left, int right) {
        if(left == -1 && right==-1) return true;
        if( right < 0 ) return false;
        char charRight = pattern.charAt ( right );
        if(left < 0){
            if( charRight == STAR){
                if(right == 1) return true;
                else return matchPosition(string,pattern,left,right-2);
            }
            else return false;
        }

        if( POINT == charRight ) return matchPosition ( string,pattern,left-1,right-1 ) ;
        else if( STAR == charRight ) {
            boolean match2 = matchPosition ( string, pattern, left,right-2 );
            if(match2) return match2;
            else {
                char beforeStar  = pattern.charAt ( right - 1 );
                boolean match1 = matchPositionRange ( string, pattern, left,right-1 ,beforeStar);
                return match1;
            }
        }else {
            return ((string.charAt ( left ) == charRight)
                    && (matchPosition ( string,pattern,left-1,right-1 )));
        }

    }

    public boolean isMatch(String s, String p) {
        return matchPosition ( s,p,s.length ()-1,p.length ()-1 );
    }
}