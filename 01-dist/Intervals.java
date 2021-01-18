// your_ID_here
// your_email_address_here

import java.io.*;
import java.util.*;

public class Intervals { 

	public static String intersect( int a1, int b1, int a2, int b2 )

	{
		String x;
		String y;
		if ((a1<a2) && (a2<b1)){
			x = "["+a2+",";
		} 
		else if ((a2<a1) && (a1<b2)){
			x = "["+a1+",";
		}
		else{
			x = "[";

		}
		if ((b1<b2)&&(b1>a2)){
			y = b1+"]";
		}
		else if ((b2<b1)&&(b2>a1)){
			y = b1+"]";
		}
		else {
			y = "]";
		}

		return x+y;
		


	}

    public static void main( String[] args ) 
    { 
    	
    }
}
