/*Multiplication (Recursive)
Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.*/

package Recursion;

import java.util.Scanner;

public class multiplication
{
	public static int Multiply(int n, int m)
	{
		if(m == 0)
		{
			return 0;
		}
		
		int smallOutput = Multiply(n, m-1);
		int output = n + smallOutput;
		return output;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st number : ");
		int N  = sc.nextInt();
		System.out.print("Enter the 2nd number : ");
		int M  = sc.nextInt();
		System.out.print("Multiplication of "+N+" and "+M +" is "+Multiply(N, M));
	}
}