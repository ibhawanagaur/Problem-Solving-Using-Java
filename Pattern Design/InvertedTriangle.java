/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
****
***
**
*
*/
package Patterns;
import java.util.Scanner;
public class InvertedTriangle {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row =1;
		while(row<=n) {
			int column = 1;
			while(column<=n-row+1) {
				System.out.print('*');
				column  = column+1;
			}
			row = row+1;
			System.out.println();
		}
	}
}