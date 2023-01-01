/*Print Like a Wave
For two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.*/

import java.util.Scanner;

public class PrintLikeWave 
{
	public static void LikeWave(int arr[][])
	{
		if (arr.length == 0) {
			return;
		}
		
		int i, j;
		if (arr.length == 0) 
		{
			return;
		}

		int rows=arr.length;
	    int cols=arr[0].length;

		for(j=0;j<cols;j++)
		{
			if(j%2==0) 
			{
				for(i=0;i<rows;i++) 
				{
					System.out.print(arr[i][j]+ " ");
				}
			}
			else 
			{
				for(i=rows-1;i>=0;i--) 
				{
					System.out.print(arr[i][j]+ " ");
				}
			}
		}
	}

	public static int[][] takeInput()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the row size");
	    int rows=sc.nextInt();
	    System.out.println("Enter the column size");
	    int cols=sc.nextInt();
	    
	    int[][] arr=new int[rows][cols];
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<cols;j++)
	    	{
	    		System.out.println("Enter the element at "+ i+ "th row and "+j+"th column");
		        arr[i][j]=sc.nextInt();
		    }
		}
		    return arr;
	}

	public static void main(String args[]) 
	{
		int [][]input=takeInput();
		LikeWave(input);
	}
}