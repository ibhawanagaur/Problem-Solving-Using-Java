/* print the following pattern for N rows:

For N=4:
****
****
****
****

*/

package Patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");
		Scanner sc = new Scanner(System.in);
		// Take user input, n = Number of Rows
		int n = sc.nextInt();
		// The loop starts with the 1st row
		int row = 1;
		// Loop will on for N rows
		while(row<=n) {
		// loop starts with the first column in the current row
			int column = 1;
		//Loop will on for N columns	
			while(column<=n) {
	    // printing (*) in each column
			System.out.print("*");
	   //Increment the current column (Inner Loop)
			column = column+1;
		}
   	   // Increment the current row (Outer Loop)
		row = row+1;
	  // Add a new Line after each row
		System.out.println();
		}
	}
}