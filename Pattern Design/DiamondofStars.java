/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
   *
  ***
 *****
*******
 *****
  ***
   *
*/
package Patterns;
import java.util.Scanner;
public class DiamondofStars {
	public static void main(String[] args) {
	System.out.print("Enter the number of rows n = ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int row =1;row<=n-1;row++) {
		for(int spaces = 1;spaces<=n-row;spaces++) {
			System.out.print(' ');
		}
		for(int stars = 1;stars<=row;stars++) {
			System.out.print('*');
		}
		for(int decN = row -1;decN>0;decN--) {
			System.out.print("*");
		}
		System.out.println();
		}
	
	for (int row = n; row >=1; row--) {
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