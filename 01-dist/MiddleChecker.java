import java.io.*;
import java.util.*;

public class MiddleChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "4", "2" };

        for( int i = 0; i < 2; i++ )
        {
            if( i == 0 ) {
                { s = "" + Middle.middle( 5, 4, 3 ); }
                snippet = "{ s = \"\" + Middle.middle( 5, 4, 3 ); }";
            }
            if( i == 1 ) {
                s = "" + Middle.middle( 2, 1, 2 );
                snippet = "s = \"\" + Middle.middle( 2, 1, 2 );";
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