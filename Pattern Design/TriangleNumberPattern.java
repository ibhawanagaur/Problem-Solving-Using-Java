/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
*/
package Patterns;
import java.util.Scanner;
public class TriangleNumberPattern {

	public static void main(String[] args) {
		System.out.println("Enter the row numbers n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		while(row<=n) {
			int	column= 1;
			while(column<=row) {
					System.out.print(row);
					column = column+1;
			}
			System.out.println();
			row = row+1;
		}
	}
}