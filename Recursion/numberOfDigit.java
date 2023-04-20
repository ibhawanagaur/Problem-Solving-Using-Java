/*Number of Digits
Given the number 'n', find out and return the number of digits present in a number .*/

package Recursion;

import java.util.Scanner;

public class numberOfDigit 
{
	public static int countDigit(int number)
	{
		if(number>0)
		{
			return 1+countDigit(number/10);
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number  = sc.nextInt();
		int answer = countDigit(number);
		System.out.print("Number of digits present in "+ number +" is : " + answer);
	}
}