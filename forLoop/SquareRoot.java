/*Square Root (Integral)
Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.*/

package forLoop;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class SquareRoot
{
	public static void main(String[] args) 
	{
		System.out.print("Enter te number : ");
		Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	        
	    double root = sqrt(n);
	    int squareroot =(int)(root);
	    System.out.println(squareroot);
	}
}