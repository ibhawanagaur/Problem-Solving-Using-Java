/*Replace a by b
Given a string, compute recursively a new string where all 'a' chars have been replaced by 'b'.*/

package Recursion;

public class replaceChar 
{
	public static String replaceChar(String s, char a, char b)
	{
		if(s.length() == 0)
		{
			return s;
		}
		
		String smallOutput = replaceChar(s.substring(1), a ,b);
		if(s.charAt(0) == a)
		{
			return b + smallOutput;
		}
		else
		{
			return s.charAt(0)+ smallOutput;
		}
	}
	
	public static void main(String arg[])
	{
		System.out.println(replaceChar("abcxdxex", 'x', 'y'));
	}
}