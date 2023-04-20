/*Count Zeros
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.*/

package Recursion;

import java.util.Scanner;

public class countZeros 
{
	public static int count(int n)
	{
		if(n == 0)
		{
			return 1;
		} 
		
		if(n<10)
		{
			return 0;
		}
		else if(n%10 == 0)
		{
			return 1 + count(n/10);
		}
		return count(n/10);
	}
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		System.out.println("Total number of zeros in "+ number +" : "+count(number));
	}
}