/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
   *
  **
 ***
****
 */
package Patterns;
import java.util.Scanner;
public class MirrorImagePattern {
	public static void main(String[] args){
		System.out.print("Enter the number of rows n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =1;
		while(row<=n) {
			int spaces = 1;
			
			while(spaces<=n-row) {
				System.out.print(' ');
				spaces = spaces +1;
			}
			int stars = 1;
			while(stars<=row) {
				System.out.print("*");
				stars  = stars +1;
			}
			row = row+1;
			System.out.println();
		}
	}
}