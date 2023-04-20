/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
   1
  121
 12321
1234321
*/
package Patterns;
import java.util.Scanner;
public class IsoscelesTriangle {

	public static void main(String[] args) {
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
			int j = 1;
			while(stars<=row) {
				System.out.print(j);
				stars  = stars +1;
				j = j+1;
			}
			
			int decN = row -1;
			while(decN>=1) {
				System.out.print(decN);
				decN = decN-1;
			}
			row = row+1;
			System.out.println();
		}
	}
}