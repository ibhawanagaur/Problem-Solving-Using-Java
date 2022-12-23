/*
 * Write a program to print multiplication table of n
 */
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.print("Enter the number = ");
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		System.out.println();
		System.out.println("Table of "+ n +" is:-");
		
		for(int i=1;i<=10;i++) {
			int table = n*i;
			System.out.println(n +" * "+i +" = "+ table);
		}
	}	
}