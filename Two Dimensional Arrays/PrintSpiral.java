/*Print Spiral
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right) b. Last column(top to bottom) 
c. Last row(right to left)  d. First column(bottom to top)*/

import java.util.Scanner;

public class PrintSpiral 
{
	public static void PrintSpiral(int arr[][])
	{
		if (arr.length == 0) 
		{
			return;
		}
		
		int row = arr.length;
	    int col = arr[0].length;
	    if (arr.length == 0){return ;}
	    
	    int k=1;
	    int r1=0,r2=row-1;
	    int c1=0,c2=col-1;		    
	    while(k<=row*col)
	    {
	    	for(int i=c1;i<=c2;i++)
	    	{
	    		System.out.print(arr[r1][i] + " ");
		        k++;
		    }		     
	    	r1++;
		    
	    	for(int i=r1;i<=r2;i++)
	    	{
	    		System.out.print(arr[i][c2] + " ");
		        k++;
		    }
		    c2--;
		    
		    for(int i=c2;i>=c1;i--)
		    {
		    	System.out.print(arr[r2][i] + " ");
		        k++;
		    }
		    r2--;
		        
		    for(int i=r2;i>=r1;i--)
		    {
		    	System.out.print(arr[i][c1] + " ");
		        k++;
		    }
		    c1++;     
	   }
	}

	public static int[][] takeInput()
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the row size");
	    int rows=s.nextInt();
	    System.out.println("Enter the column size");
	    int cols=s.nextInt();
	    
	    int[][] arr=new int[rows][cols];
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<cols;j++)
	    	{
	    		System.out.println("Enter the element at "+ i+ "th row and "+j+"th column");
		        arr[i][j]=s.nextInt();
		    }
		}
		    return arr;
	}
	
	public static void main(String args[]) 
	{
		int [][]input=takeInput();
		PrintSpiral(input);
	}
}