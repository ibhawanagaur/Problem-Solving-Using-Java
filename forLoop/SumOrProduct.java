/*Sum or Product
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print warning (without the quotes)*/

package forLoop;

import java.util.Scanner;

public class SumOrProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		System.out.println("Enter your choice");
		System.out.println("Press 1 for sum or 2 for product");
		int choice = sc.nextInt();
		int sum =0;
		int product =1;
		
		if(choice == 1)
		{
			for(int i=1;i<=number;i++)
			{
				sum+=i;
			}
			System.out.println(sum);
		}
		else if(choice == 2)
		{
			for(int i=1;i<=number;i++)
			{
				product*=i;
			}
			System.out.println(product);
		}
		else
		{
			System.out.println("Invalid Choice, Try again");
		}
	}
}