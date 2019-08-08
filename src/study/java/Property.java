package study.java;
import  java.util.*;

public class Property {
    public static void main(String[] args){
       BigPrint ( 1 );
        BigPrint ( 5 );

    }

    public static void BigPrint(int i){
        for(int j = 31; j>=0 ;j--){
            if(((1 << j) & i )== 0){
                System.out.print ( "0" );
            }else System.out.print ( "1" );
        }
        System.out.print ( "\n" );
    }

}
