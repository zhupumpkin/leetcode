package LongestPalindrome;

public class Solution {
    public String longestPalindrome(String s) {
           String longest = new String (  );
           if(s.length () == 0 ) return new String (  );
           if(s.length () == 1) return s;
           for(int index = 0 ; index < s.length ();index++){
               String s1 = expandCenter(index,s);
               if(s1.length () > longest.length ()) longest = s1;
           }
           return longest;
    }

    private String expandCenter(int pos, String s){
        String s1 = expandEven(pos,s);
        String s2 = expandOdd(pos,s);
        return  s1.length () > s2.length ()? s1:s2;
    }

    private String expandEven(int pos, String s){
        int index = 1;
        int length = s.length ();
        while (pos + index < length && pos+1-index >=0){
             if(s.charAt ( pos + index ) == s.charAt ( pos + 1 -index )) {
                 index += 1;
                 continue;
             }else break;
        }
        index -=1;
        String res = s.substring ( pos+1-index,pos+index+1 );
        return res;
    }


    private String expandOdd(int pos, String s){
        int index = 1;
        int length = s.length ();
        while ( pos - index >=0 && pos + index < length){
            if(s.charAt ( pos-index ) == s.charAt ( pos + index )){
                index += 1;
                continue;
            }else {
                break;
            }
        }
        index -= 1;
        return s.substring ( pos-index,pos + index + 1 );

    }
}


