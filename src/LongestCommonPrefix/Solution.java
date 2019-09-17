package LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        int index = 0;
        while (true){
            if (compStringListWithPosition ( strs,index ) == true) index++;
            else break;
        }
        return strs[0].substring ( 0,index );

    }

    private boolean compStringListWithPosition(String[] strs, int pos){
        char c ;
        if(pos < strs[0].length ())  c = strs[0].charAt ( pos );
        else return false;
        for(int index = 1 ; index < strs.length; index ++){
            if(pos < strs[index].length () && c == strs[index].charAt ( pos )) continue;
            else return false;
        }
        return true;


    }



}