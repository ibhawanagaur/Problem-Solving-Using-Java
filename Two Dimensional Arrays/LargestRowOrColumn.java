/*For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.*/

import java.util.Scanner;

public class LargestRowOrColumn 
{	
	public static void Largest_Element(int arr[][])
	{
		if(arr.length==0)
		{
            System.out.print("row "+"0 "+Integer.MIN_VALUE);
            return;
        }
		
		int i, j, sum;
		int rows=arr.length;
	    int cols=arr[0].length;
		
	    int max_val_row = Integer.MIN_VALUE;
		int val_row=0;
	    for(i=0;i<rows;i++)
	    {
	    	sum =0;
			String s;
			for(j=0;j<cols;j++)
			{
				sum += arr[i][j];
				if(sum>max_val_row) 
				{
					max_val_row = sum;
					val_row = i;
				}
		    }
		}
	    
	    int max_val_col = Integer.MIN_VALUE;
	    int val_col=0;
		for(j=0;j<cols;j++)
		{
			sum =0;
			for(i=0;i<rows;i++)
			{
				sum += arr[i][j];
				if(sum>max_val_col) 
				{
					max_val_col = sum;
					val_col = j;
				}
		    }
		}
		
		if(max_val_row>max_val_col) 
		{
			System.out.println("row "+ val_row +" " + max_val_row);
		}
		else 
		{
			System.out.println("column "+ val_col +" " + max_val_col);
		}
	}

	public static int[][] takeInput()
	{
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    int rows=sc.nextInt();		    
	    System.out.println("Enter number of cols");
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
		Largest_Element(input);
	}
}