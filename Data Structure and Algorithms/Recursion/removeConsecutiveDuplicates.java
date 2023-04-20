/*Remove Duplicates Recursively
Given a string S, remove consecutive duplicates from it recursively.*/

package Recursion;

public class removeConsecutiveDuplicates 
{
	public static String consecutiveDuplicates(String s )
	{
		if(s.length() == 1)
		{
			return s;
		}
		
		if(s.charAt(0)==s.charAt(1))
		{
			String smallOutput = consecutiveDuplicates(s.substring(1));
			return smallOutput;
		}
		else
		{
			String smallOutput = consecutiveDuplicates(s.substring(1));
			return s.charAt(0)+ smallOutput;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println(consecutiveDuplicates("aabccba"));	
	}
}