/*Check AB
Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.*/

package Recursion;

public class checkAB 
{
	public static boolean checkAb(String s)
	{
	    if (s.length()==0) {
	    	return true;
	    }
	    
	    if (s.charAt(0) != 'a'){
	    	return false;
	    }
	    
	    if (s.length() >= 3 && "abb".equals(s.substring(0,3))){
	    	return checkAb(s.substring(3));
	    }
	    else 
	    {
	    	return checkAb(s.substring(1));
	    }
	}
	
	public static void main(String[] args) 
	{		
		System.out.println(checkAb("abababa"));	
	}
}