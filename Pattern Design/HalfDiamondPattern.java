/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
*1*
*121*
*12321*
*1234321*
*12321*
*121*
*1*
*


*/
package Patterns;
import java.util.Scanner;
public class HalfDiamondPattern {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("*");
		
		for(int row=1;row<=n;row++) {
			System.out.print("*");
			int t =1;
			for(int jcol=1;jcol<=row;jcol++) {
				System.out.print(t);
				t++;
			}
			for(int jcol=row-1;jcol>=1;jcol--) {
				System.out.print(jcol);
			}
			System.out.println("*");
		}

		for (int rows = n-1; rows >=1; rows--) {
			System.out.print("*");
			int t =1;
			for(int jcol=1;jcol<=rows;jcol++) {
				System.out.print(t);
				t++;
			}
			for(int jcol=rows-1;jcol>=1;jcol--) {
				System.out.print(jcol);
			}
			System.out.println("*");
		}
		System.out.println("*");
	}
}
