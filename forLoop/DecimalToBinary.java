/*Decimal to Binary
 * Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.*/

package forLoop;

import java.util.Scanner;

public class DecimalToBinary
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		long Decimal_Number = 0;
		
		for(int i=0;number>0;i++)
		{
			Decimal_Number += (long)((number%2)*Math.pow(10,i));
			number/=2;
		}
		System.out.println("Decimal Number is "+ Decimal_Number);
	}
}