import java.io.*;
import java.util.*;

public class MaxChecker {
    public static void main( String[] args )    {        
        String s = "";
        String snippet = "";

        String[] t = { "4", "4", "200" };

        for( int i = 0; i < 3; i++ )
        {
            if( i == 0 ) {
                { s = "" + Max.max(3,4); }
                snippet = "{ s = \"\" + Max.max(3,4); }";
            }
            if( i == 1 ) {
                s = "" + Max.max(4,3);
                snippet = "s = \"\" + Max.max(4,3);";
            }
            if( i == 2 ) {
                {
                    s = "" + Max.max(100, 200); 
                }
                snippet = "{\n    s = \"\" + Max.max(100, 200); \n}";
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