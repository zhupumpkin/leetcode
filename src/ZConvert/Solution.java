package ZConvert;

public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 0 || numRows == 1) return s;
        StringBuffer  res = new StringBuffer ( s.length () );
        for(int row = 1; row <= numRows; row ++){
           getRowString(row,numRows,s,res);
        }
        return res.toString ();
    }

    private  void getRowString(int nowRow, int allRow,String s,StringBuffer res){
          int length = s.length ();
          int index = nowRow -1;
          int intervalB = 2 * (allRow -1);
          if(nowRow == 1 || nowRow == allRow) {
              while( index < length ){
                  res.append (  s.charAt ( index) );
                  index += intervalB;
              }
          }else {
              int intervalA = 2 * (allRow -nowRow);
              while( index < length ){
                  int preIndex = index;
                  res.append (  s.charAt ( index) );
                  index +=intervalA;
                  if(index < length){
                      res.append (  s.charAt ( index) );
                      index = preIndex + intervalB;
                  }
              }

          }
    }
}
