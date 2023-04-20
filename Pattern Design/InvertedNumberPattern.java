/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
 */ 
package Patterns;
import java.util.Scanner;
public class InvertedNumberPattern {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int m = n;
		for(int row = 1; row<=n;row++) {
			for(int column=1 ; column<=n-row+1;column++) {
				System.out.print(m);
			}
			m = m-1;
			System.out.println();
		}
	}
}