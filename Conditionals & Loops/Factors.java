/*
 * Write a program to print all the factors of a number other than 1 and the number itself.
 * */
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		System.out.print("Enter the number ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print(i +" ");
			}
		}
	}
}