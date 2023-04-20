/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444

Pattern for N = 7
7777777
7777777
7777777
7777777
7777777
7777777
7777777
*/
package Patterns;
import java.util.Scanner;
public class SquarePattern {

	public static void main(String[] args) {
		System.out.println("Enter the row numbers n = ");
		Scanner  sc = new Scanner(System.in);
		int n  =  sc.nextInt();
		
		int row = 1;
		while(row<=n) {
			int column =1;
			while(column<=n) {
				System.out.print(n);
				column = column+1;
			}
			row = row+1;
			System.out.println();
		}
	}
}