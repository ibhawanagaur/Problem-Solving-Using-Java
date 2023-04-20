/* print the following pattern for N rows:

For N=4:
1111
2222
3333
4444

*/

package Patterns;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		System.out.println("Enter the row numbers n = ");
		Scanner  sc = new Scanner(System.in);
		int n  =  sc.nextInt();
		
		int row =1;
		while (row <=n) {
			int column =1;
			while(column<=n) {
				System.out.print(row);
				column = column+1;
			}
			row  = row+1;
			System.out.println();
		}
	}
}