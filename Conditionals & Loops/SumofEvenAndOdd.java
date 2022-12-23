/*
 * Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5. 
 */
import java.util.Scanner;
public class SumofEvenAndOdd {
	public static void main(String[] args){
		System.out.print("Enter Number = ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int SumOfEven = 0;
		int SumOfOdd = 0;
		
		while(n!=0) {
			int temp = n%10;
			if(temp%2==0) {
				SumOfEven+=temp;
			}
			else {
				SumOfOdd+=temp;
			}
			n = (int)(n/10);
		}
		System.out.println("Sum of Even Number is: "+ SumOfEven +"\nSum of Odd Number is: "+ SumOfOdd);
	}
}