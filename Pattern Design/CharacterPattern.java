/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
*/
package Patterns;
import java.util.Scanner;
public class CharacterPattern {
	public static void main(String[] args) {
		System.out.println("Enter the row numbers n = ");
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	     
		 int row = 1;
	     while(row<=n) {
	    	 char newC = (char)('A'+row-1);
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