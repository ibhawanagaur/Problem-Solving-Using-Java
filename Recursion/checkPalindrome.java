/*Check Palindrome (recursive)
Check whether a given String S is a palindrome using recursion. Return true or false.*/

package Recursion;

public class checkPalindrome 
{
	public static boolean Palindrome(String input) {
		if(input.length()<=1)
		{
			return true;
		}
		else if(input.charAt(0)!=input.charAt(input.length()-1))
		{
			return false;	
		}
		return Palindrome(input.substring(1, input.length()-1));

	}

	public static void main(String[] args) 
	{		
		System.out.println(Palindrome("racecar"));	
	}
}
