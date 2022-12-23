/*
 * Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1 
*/
import java.util.Scanner;
public class FindPowerOfNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number ");
		int x = s.nextInt();
		System.out.print("Enter power ");
		int n = s.nextInt();
		
		int p = 1;
		while(n!=0) {
			p*=x;
			n--;
		}
		System.out.println("Power Of Number is "+ x +" = "+ p);
		
	}
}