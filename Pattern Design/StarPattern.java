/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
   *
  ***
 *****
*******

*/
package Patterns;
import java.util.Scanner;
public class StarPattern {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for(int row =1;row<=n;row++) {
		for(int spaces = 1;spaces<=n-row;spaces++) {
			System.out.print(' ');
		}
		for(int stars = 1;stars<=row;stars++) {
			System.out.print('*');
		}
		for(int decN = row -1;decN>=1;decN--) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}