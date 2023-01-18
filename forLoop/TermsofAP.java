/*Terms of AP
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.*/

package forLoop;

import java.util.Scanner;

public class TermsofAP 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of terms : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		
		for(int i=1;count<number;i++)
		{
			int t =(3*i)+2;
			if(t%4!=0)
			{
				System.out.print(t+ " ");
				count++;
			}
		}
	}
}