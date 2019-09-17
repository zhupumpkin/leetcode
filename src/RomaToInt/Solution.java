package RomaToInt;

public class Solution {

    private class ROMA{
        private static final int I = 1;
        private static final int V = 5;
        private static final int X = 10;
        private static final int L = 50;
        private static final int C = 100;
        private static final int D = 500;
        private static final int M = 1000;

        private int getIntFromRoma(String roma) {
            if ( roma.equals ( "I" ) ) return I;
            if ( roma.equals ( "V" ) ) return V;
            if ( roma.equals ( "X" ) ) return X;
            if ( roma.equals ( "L" ) ) return L;
            if ( roma.equals ( "C" ) ) return C;
            if ( roma.equals ( "D" ) ) return D;
            if ( roma.equals ( "M" ) ) return M;
            return 0;
        }
    }


    public int romanToInt(String romastr) {
        int num = 0;
        int last = 0;
        ROMA roma = new ROMA ();
        for(int index = romastr.length ()-1; index >= 0; index-- ){
            int indexPositionNum = roma.getIntFromRoma ( romastr.substring ( index,index+1 ) );
            if(indexPositionNum >= last) num += indexPositionNum;
            if(indexPositionNum < last) num -=  indexPositionNum;
            last =indexPositionNum;
             }
        return num;
    }

}
