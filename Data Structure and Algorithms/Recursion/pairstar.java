/*Pair Star
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".*/

package Recursion;

public class pairstar 
{
	public static String pairStar(String s)
	{
		if(s.length() == 1)
		{
			return s;
		}
		
		if(s.charAt(0)==s.charAt(1))
		{
			String smallOutput = pairStar(s.substring(1));
			return s.charAt(0) + "*" + smallOutput;
		}
		else
		{
			String smallOutput = pairStar(s.substring(1));
			return s.charAt(0)+ smallOutput;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println(pairStar("hello"));	
	}
}