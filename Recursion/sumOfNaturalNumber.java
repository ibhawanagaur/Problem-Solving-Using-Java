/*Sum of N natural number
Write a program to calculate Sum of N natural number. Take n from the user.*/

package Recursion;

import java.util.Scanner;

public class sumOfNaturalNumber 
{
	public static int sumN(int number)
	{
		if(number == 0)
		{
			return 0;
		}
		int smallOutput = sumN(number-1);
		return number + smallOutput;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int naturalNumberSum = sumN(number);
		System.out.print("Sum of "+ number+" natural number is : "+ naturalNumberSum);
	}
}