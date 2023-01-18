/*Fahrenheit to Celsius Table
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.*/

package Functions;

import java.util.Scanner;

public class FahrenheittoCelsiusTable 
{	
	public static void FahrenheittoCelsiusTable(int start , int step, int end) 
	{
		for(int i=start; i<=end; i+=step)
		{
			int Celsius = ((i-32)*5)/9;
			System.out.println(i +"\t" + Celsius);
		}
		return;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start value : ");
		int Start = sc.nextInt();
		System.out.print("Enter the step value : ");
		int Step = sc.nextInt();
		System.out.print("Enter the end value : ");
		int End = sc.nextInt();
		FahrenheittoCelsiusTable(Start, Step,End );
	}
}