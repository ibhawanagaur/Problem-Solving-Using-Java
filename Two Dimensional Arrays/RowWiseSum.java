/*Row Wise Sum
For  two-dimensional integer array/list of size (N x M), find and print the sum of each of the row elements in a single line, separated by a single space.*/

import java.util.Scanner;

public class RowWiseSum 
{
	public static void RowSum(int arr[][])
	{
		String str = "";
		int rows=arr.length;
	    int cols=arr[0].length;
	    
		for(int i=0;i<rows;i++)
		{
			int sum =0;
			for(int j=0;j<cols;j++)
			{
				sum += arr[i][j];     
		    }
			System.out.print(sum + " ");
		}
	}
	
	public static int[][] takeInput()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    int rows=sc.nextInt();		    
	    System.out.println("Enter number of cols");
	    int cols=sc.nextInt();
	    int[][] arr=new int[rows][cols];
	    
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<cols;j++)
	    	{
	    		System.out.println("Enter the element at "+ i+ " row "+j+"column");
		        arr[i][j]=sc.nextInt();
		    }
		}
		    return arr;
	}
	
	public static void main(String args[]) 
	{
		int [][]input=takeInput();
		RowSum(input);
	}
}