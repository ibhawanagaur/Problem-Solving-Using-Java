/*Reverse of a number
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.*/

package forLoop;

import java.util.Scanner;

public class ReverseofNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int Reversed_Number = 0;
		
		for(int i=1;number>0;i++)
		{
			int rem = number%10;
			number = number/10;
			Reversed_Number = (10*Reversed_Number) + rem;
		}
		System.out.println("Reverse of Number is "+ Reversed_Number);
	}
}