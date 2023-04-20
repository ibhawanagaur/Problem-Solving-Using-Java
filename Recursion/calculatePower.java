/*Calculate Power
Write a program to find x to the power n (i.e. x^n). Take x and n from the user.*/

package Recursion;

import java.util.Scanner;

public class calculatePower 
{
	public static int calculatePower(int x, int n)
	{
		if(n == 0)
		{
			return 1;
		}
		int smallOutput = calculatePower(x, n-1);
		int output = x*smallOutput ;
		return output;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number  = sc.nextInt();
		System.out.print("Enter the power : ");
		int power = sc.nextInt();
		int answer = calculatePower(number, power);
		System.out.print(number + "^"+ power +" = "+ answer);
	}
}