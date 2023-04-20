/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
ABCD
BCDE
CDEF
DEFG
*/
package Patterns;
import java.util.Scanner;
public class CharacterPattern2 {

	public static void main(String[] args) {
		System.out.println("Enter the row numbers n = ");
		Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     
	     int row = 1;
	     while(row<=n) {
	    	 int column = 1;
	    	 char newC = (char)('A'+row-1);
	    	 while(column<=n) {
	    		 System.out.print(newC);
	    		 newC = (char)(newC+1);
	    		 column = column+1;
	    	 }
	    	 row= row+1;
	    	 System.out.println();
	     }
	    }
	}