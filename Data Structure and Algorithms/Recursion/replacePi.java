/*Replace pi by 3.14
Given a string, compute recursively a new string where all pi chars have been replaced by 3.14.*/

package Recursion;

public class replacePi 
{
	public static String  replace(String s)
	{
		if(s.length()<=1)
		{
			return s;
		}
		if(s.charAt(0)=='p' && s.charAt(1)=='i')
		{
			String smallOutput = replace(s.substring(2));
			return "3.14" +smallOutput;
		}
		else
		{
			String smallOutput = replace(s.substring(1));
			return s.charAt(0)+ smallOutput;
		
		}
	}
	
	public static void main(String arg[])
	{
		System.out.println(replace("piabd2"));
	}
}
