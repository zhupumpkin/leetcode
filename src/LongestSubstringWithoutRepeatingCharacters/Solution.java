package LongestSubstringWithoutRepeatingCharacters;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int length = s.length ();
        if(length == 1 || length == 0){
            return length;
        }

        int index_i=0,index_j=0;
        while(index_j < length){
            char c = s.charAt ( index_j );
            int pos = indexStartEnd(s,index_i,index_j,c);
            if(pos < 0){
                // does not contain c
                if(index_j - index_i > ans){
                    ans = index_j - index_i;
                }
            }else {
                //contain c;
                index_i = index_i + pos + 1;
            }
            index_j++;
        }
        return ans+1;
    }


    public static int  indexStartEnd(String s, int i, int j, char c){
        for(int index = i ; index < j; index ++){
            if(c == s.charAt ( index )){
                return index - i;
            }
        }
        return -1;
    }
}