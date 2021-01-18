// your_ID_here
// your_email_address_here

import java.io.*;
import java.util.*;

public class Middle { 

	public static int middle( int a, int b, int c ) {
		if ((a > b && a < c) || (a < b && a > c)) {
			return a;
		} else if ((b > a && b < c) || (b < a && b > c)) {
			return b;
		} else{
			return c;
		}

	}


    public static void main( String[] args ) 
    {

    }
}
