/*All Prime Numbers
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).*/

package forLoop;

import java.util.Scanner;

public class AllPrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the range of number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=2;i<=n;i++)
		{
			int count = 0;
			for(int j= 2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
	}
}