/*Print First N Natural Numbers 
Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.*/

package Recursion;

import java.util.Scanner;

public class printFirstNaturalNumbers 
{
	public static void print(int number)
	{
		if(number == 0)
		{
			return;
		}
			print(number-1);
			System.out.print(number+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number  = sc.nextInt();
		print(number);
	}
}