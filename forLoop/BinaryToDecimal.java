/*Binary to decimal
Given a binary number as an integer N, convert it into decimal and print.*/

package forLoop;

import java.util.Scanner;

public class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		long Binary_Number = 0;
		
		for(int i=0;number>0;i++)
		{
			Binary_Number+= (number%10)*Math.pow(2,i);
			number/=10;
		}
		System.out.println("Binary Number is "+ Binary_Number);
	}
}