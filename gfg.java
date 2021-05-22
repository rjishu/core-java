import java.util.*; 
import java.io.*; 

class gfg
{
}
{ 
public static void findWord(String c, int n) 
{ 
	int co = 14, i;  
	char s[] = new char[n]; 
	
	for (i = 0; i < n ; i++) 
	{ 
		if (i < n / 2) 
			co++; 
		else
			co = n - i; 

		// after 'z', it should go to a. 
		if ((c.charAt(i) + co) <= 122) 
			s[i] = (char)((int)c.charAt(i) + co); 
		else
			s[i] = (char)((int)c.charAt(i) + co - 26); 
	} 
	
	String str = Arrays.toString(s); 
	System.out.println(str); 
} 

public static void main(String args[]) 
{ 
	String s = "INDIA"; 
	findWord(s, s.length()); 
} 
}