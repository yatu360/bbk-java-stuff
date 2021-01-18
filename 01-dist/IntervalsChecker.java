import java.io.*;
import java.util.*;

public class IntervalsChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "[2,5]", "[]", "[1,1]" };

        for( int i = 0; i < 3; i++ )
        {
            if( i == 0 ) {
                { s = "" + Intervals.intersect(1,5,2,9); }
                snippet = "{ s = \"\" + Intervals.intersect(1,5,2,9); }";
            }
            if( i == 1 ) {
                { s = "" + Intervals.intersect(1,1,2,2); }
                snippet = "{ s = \"\" + Intervals.intersect(1,1,2,2); }";
            }
            if( i == 2 ) {
                { s = "" + Intervals.intersect(1,1,-1,3); }
                snippet = "{ s = \"\" + Intervals.intersect(1,1,-1,3); }";
            }


            if( !s.equals( t[i]))
            {
                System.out.println( "---- On code snippet:" );
                System.out.println( snippet );
                System.out.println( "---- Expected value of String s:" );
                System.out.println( t[i] );
                System.out.println( "---- Actual value of String s:" );
                System.out.println( s );
                return;
            }
        }
        System.out.println( "Passed all tests." );
      
    }
}