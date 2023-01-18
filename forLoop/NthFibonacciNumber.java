/*Nth Fibonacci Number
Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) =  1, 
           F(2) = 1*/

package forLoop;

import java.util.Scanner;

public class NthFibonacciNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");		
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
		int fn1 = 1;
		int fn2 = 1;
		int fn3;
	
		for(int i=3;i<=n;i++){
			fn3 = fn1+fn2;
			fn1 =fn2;
			fn2 = fn3;
		}
		System.out.println(fn2);
	}
}