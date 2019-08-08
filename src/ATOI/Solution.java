package ATOI;


import java.util.HashSet;

public class Solution {
    private static boolean POSITIVE = true;
    private static String POSI = "+";
    private static String NEGA = "-";
    public static final int MAX_INT = Integer.MAX_VALUE;
    public static final int MIN_INT = Integer.MIN_VALUE;
    private static int START_POSITION = -2;
    private static HashSet<String> NUMBER = new HashSet<String > (  ){{
        add("1");
        add("2");
        add("3");
        add("4");
        add("5");
        add("6");
        add("7");
        add("8");
        add("9");
        add("0");
    }};


    public int myAtoi(String str) {
        START_POSITION = -1;
        POSITIVE = true;
        int res = 0;
        START_POSITION = findStart ( str );
        if(START_POSITION == -1) return 0;
        int end = findEnd ( str );
        if(end > START_POSITION) return convert ( str ,START_POSITION,end);
        else return res;
    }

    public int findStart(String str){
           String blank = " ";
           String temp;
           for(int index =0 ; index < str.length ();index++){
                   temp = str.substring ( index,index+1 );
                   if(temp.equals ( blank)) continue;
                   else if(temp.equals ( POSI ) || temp.equals ( NEGA ) || NUMBER.contains ( temp )) return index;
                   else break;
           }
           return -1;
    }


    public int findEnd(String str) {
        if (START_POSITION == -2) START_POSITION = findStart ( str );
        int start = START_POSITION;
        String temp;
        temp = str.substring ( start,start+1 );
        if (temp.equals ( POSI )) {
            POSITIVE = true;
            start++;
        }else if ( temp.equals ( NEGA )  ){
            POSITIVE = false;
            start++;
        }
        for(int index = start; index!= str.length ();index++){
            temp = str.substring ( index,index+1 );
            if(NUMBER.contains ( temp )) continue;
            else return index;
        }
        return str.length ();
    }


    public int convert(String str, int start, int end) {
        int  res = 0;
        int before = 0;
        boolean full = false;
        String temp;
        temp = str.substring ( start,start+1 );
        POSITIVE = true;
        if (temp.equals ( POSI )) {
            POSITIVE = true;
            start++;
        }else if ( temp.equals ( NEGA )  ){
            POSITIVE = false;
            start++;
        }
        for(int index = start;index!=end;index++){
            temp = str.substring ( index,index+1 );
            before = res;
            res = (res * 10 + Integer.parseInt ( temp ));
            if (res >=0 &&  (res - Integer.parseInt ( temp ))/10 == before ) {
                before = res;
                continue;
            }else {
                full = true;
                break;
            }
        }
        if(full){
            return  POSITIVE ? MAX_INT:MIN_INT;
        }else {
            return POSITIVE ? res:-res;
        }


    }
}
