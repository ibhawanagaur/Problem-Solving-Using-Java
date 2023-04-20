/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
ABCD
ABCD
ABCD
ABCD
*/
package Patterns;
import java.util.Scanner;
public class CharacterPattern1 {
	public static void main(String[] args){
	
	System.out.print("Enter the row numbers n = ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int row=1;
    while(row<=n){
        int column =1;
        while(column<=n){
            char jthchar=(char)('A'+column-1);
            System.out.print(jthchar);
            column = column+1;
        }
        System.out.println();
        row =row+1;
     }
   }
}
