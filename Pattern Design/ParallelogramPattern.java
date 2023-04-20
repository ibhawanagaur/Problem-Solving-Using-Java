/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
****
 ****
  ****
   ****
*/
package Patterns;
import java.util.Scanner;
public class ParallelogramPattern {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row =0;row<=n-1;row++) {
			for(int space=1;space<=row ;space++) {
				System.out.print(" ");
			}
			for(int stars= 1;stars<=n;stars++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

