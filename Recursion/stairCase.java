/*Staircase
A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.*/

package Recursion;

import java.util.Scanner;

public class stairCase 
{
	public static int stairCaseCount(int n)
	{
		{
	        if ( n == 0)
	            return 1;
	        else if (n < 0)
	            return 0;
	 
	        else
	            return stairCaseCount(n - 3) + stairCaseCount(n - 2)+ stairCaseCount(n - 1);
	    }
	 }
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(stairCaseCount(n));
	}
}