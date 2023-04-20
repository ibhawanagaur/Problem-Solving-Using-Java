/* Print the following pattern for the given N number of rows.
Pattern for N = 4
1357
3571
5713
7135

*/
package Patterns;
import java.util.Scanner;
public class OddSquarePattern {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int row=1;row<=n;row++) {
			int m  = 2*row-1;
			for(int jcol=1;jcol<=n;jcol++) {
				if((row+jcol)<=(n+1)){
					System.out.print(m);
					 m = m+2;
				}
			}
			for(int kcol=1;kcol<row;kcol++) {
				System.out.print(2*kcol-1);
			}
			System.out.println();
		}
	}
}	