/*
Print the following pattern for the given N number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/
package Patterns;
import java.util.Scanner;
public class InterestingAlphabets {
	public static void main(String[] args) {
		System.out.println("Enter the row numbers n = ");
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	     
		 int row = 1;
	     while(row<=n) {
	    	 char newC = (char)(n-row+'A');
	    	 int column = 1;
	    	 while(column<=row) {
	    		 System.out.print(newC);
	    		 column = column+1;
	    		 newC = (char)(newC+1);
	    	 }
	    	 row= row+1;
	    	 System.out.println();
	     }
	    }
	}