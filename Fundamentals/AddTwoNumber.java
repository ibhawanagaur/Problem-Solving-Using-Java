/*
 * Take 2 inputs from user and add them.
*/
import java.util.Scanner;
public class AddTwoNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the input");
		Scanner s= new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int ans =num1+num2;
		System.out.println("Sum of "+  num1 + " + " + num2 + " = " + ans);
	}
}
		    
