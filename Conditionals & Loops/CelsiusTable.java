/*Fahrenheit to Celsius Table
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.*/

package PracticeMore;

import java.util.Scanner;

public class CelsiusTable 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the start value : ");
		int S=s.nextInt();
		System.out.print("Enter the end value : ");
		int E=s.nextInt();
		System.out.print("Enter the step value : ");
		int W=s.nextInt();
		int fah;
        
        while(S<=E)
        {
        	fah=((5*(S-32))/9);
            System.out.println(S+" "+fah);
            S+=W;
        }
	}
}