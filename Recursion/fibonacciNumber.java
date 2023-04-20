/*FibonacciNumber 
 Write a program to print nth number in fibonacci series*/

package Recursion;

import java.util.Scanner;

public class fibonacciNumber 
{
	public static int Fibonacci(int number)
	{
		if(number == 1 || number == 2)
		{
			return 1;
		}
		
		int f1 = Fibonacci(number-1);
		int f2 = Fibonacci(number-2);
		int output = f1 + f2;
		return output;	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number  = sc.nextInt();
		System.out.print(Fibonacci(number));
	}
}