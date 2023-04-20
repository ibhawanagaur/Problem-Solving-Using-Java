/*Factorial
Write a program to calculate factorial of N number. Take n from the user.*/

package Recursion;

import java.util.Scanner;

public class factorial 
{
	public static int fact(int number)
	{
		if(number == 0)
		{
			return 1;
		}
		int smallOutput = fact(number-1);
		return number*smallOutput;
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int factorialN = fact(number);
		System.out.print("factorial of "+ number +" is : "+ factorialN);
	}
}