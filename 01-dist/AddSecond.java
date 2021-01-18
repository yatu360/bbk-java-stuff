// your_ID_here
// your_email_address_here


import java.io.*;
import java.util.*;

public class AddSecond { 

	public static String addSecond( int h, int m, int s )
	{
		String sec;
		String minute;
		String hour;
		if (s<59){
			s++;
		}else if (m<59){
			m++;
			s= 0;
		}
		else{
			h++;
			m=0;
			s=0;
			}
		if (s<10){
			sec = ":0"+s;
		}
		else{
			sec = ":"+s;
			}
		if (m<10){
			minute=":0"+m;
		}
		else{
			minute = ":"+m;
			}
		if (h>24){
			hour = "00";
		}
		else if (h<10){
			hour = "0"+h;
		}
		else{
			hour = ""+h;
		}
		return hour+minute+sec;
	}
		



    public static void main( String[] args ) 
    { 
    	
    }
}
