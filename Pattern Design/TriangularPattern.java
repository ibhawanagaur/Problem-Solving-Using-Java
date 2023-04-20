/*
Print the following pattern for the given N number of rows.
Pattern for N = 4 
1
23
345
4567
*/

package Patterns;
import java.util.Scanner;
public class TriangularPattern {
	public static void main(String[] args) {
		    System.out.println("Enter the row numbers n = ");
		     Scanner s=new Scanner(System.in);
		     int n=s.nextInt();
		     
		     int row=1;
		     while(row<=n) {
		    	 int column = 1;
		    	 int temp = row;
		    	 while(column<=row) {
		    		 System.out.print(temp);
		    		 column = column+1;
		    		 temp =temp+1;
		    	 }
		    	 System.out.println();
		    	 row = row+1;
		     }    
	}
}