/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
   1
  232
 34543
4567654
*/
package Patterns;
import java.util.Scanner;
public class TriangleofNumbers {
	public static void main(String[] args) {
	System.out.print("Enter the number of rows n = ");
	Scanner sc = new Scanner(System.in);
	     int n=sc.nextInt();
	     for(int row =1;row<=n;row++){
	         for(int spaces=1;spaces<=n-row; spaces++){
	             System.out.print(" ");
	         }
	         for(int stars=row;stars<=(2*row-1);stars++){
	             System.out.print(stars);
	         }
	         for(int dec=2*(row-1);dec>row-1 ;dec--){
	             System.out.print(dec);
	         }
	         System.out.println();
	     }
	}
}