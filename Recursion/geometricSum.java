/*Geometric Sum
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.*/

package Recursion;

import java.util.Scanner;

public class geometricSum 
{
	public static double findGeometricSum(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		double smallOutput = findGeometricSum(n-1);
		double output = 1/(double)(Math.pow(2, n)) +smallOutput;
		return output;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the count : ");
		int count = s.nextInt();
		System.out.println("Geometric Sum is "+ findGeometricSum(count));
	}
}