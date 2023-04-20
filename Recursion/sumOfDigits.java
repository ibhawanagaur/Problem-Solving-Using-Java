/*Sum of digits (recursive)
Write a recursive function that returns the sum of the digits of a given integer.*/

package Recursion;

import java.util.Scanner;

public class sumOfDigits
{
	public static int digitSum(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		
		int smallOutput = digitSum(n/10);
		int output = n%10 + smallOutput;
		return output;
	} 
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = s.nextInt();
		System.out.println("Sum of digits is "+ digitSum(number));
	}
}