/*Remove X
Given a string, compute recursively a new string where all 'x' chars have been removed.*/

package Recursion;

public class removeX
{
	public static String removeChar(String s, char a)
	{
		if(s.length() == 0)
		{
			return s;
		}
		
		String smallOutput = removeChar(s.substring(1), a);
		if(s.charAt(0)==a)
		{
			return smallOutput;
		}
		else
		{
			return s.charAt(0)+ smallOutput;
		}
	}
	
	public static void main(String arg[])
	{
		System.out.println(removeChar("abcxdxex", 'x'));
	}
}