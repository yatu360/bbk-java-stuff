import java.io.*;
import java.util.*;

public class AddSecondChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "11:33:16", "11:33:07", "19:46:00", "13:00:00", "00:01:03" };

        for( int i = 0; i < 5; i++ )
        {
            if( i == 0 ) {
                { s = AddSecond.addSecond( 11, 33, 15 ); }
                snippet = "{ s = AddSecond.addSecond( 11, 33, 15 ); }";
            }
            if( i == 1 ) {
                { s = AddSecond.addSecond( 11, 33,  6 ); }
                snippet = "{ s = AddSecond.addSecond( 11, 33,  6 ); }";
            }
            if( i == 2 ) {
                { s = AddSecond.addSecond( 19, 45, 59 ); }
                snippet = "{ s = AddSecond.addSecond( 19, 45, 59 ); }";
            }
            if( i == 3 ) {
                { s = AddSecond.addSecond( 12, 59, 59 ); }
                snippet = "{ s = AddSecond.addSecond( 12, 59, 59 ); }";
            }
            if( i == 4 ) {
                { s = AddSecond.addSecond(  0,  1,  2 ); }
                snippet = "{ s = AddSecond.addSecond(  0,  1,  2 ); }";
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