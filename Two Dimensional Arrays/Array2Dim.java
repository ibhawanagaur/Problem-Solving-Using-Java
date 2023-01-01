/* Create 2-d array.*/

import java.util.Scanner;

public class Array2Dim 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int columns= sc.nextInt();
		int[][] arr2d = new int[rows][columns];
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				System.out.println("Enter the element at "+ i + "th row and "+ j +"th columns");
				arr2d[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<columns;j++) 
			{
				System.out.print(arr2d[i][j]+ " ");
			}
			System.out.println();
			
		}
	}
}