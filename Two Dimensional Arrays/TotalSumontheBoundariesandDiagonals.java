/*Total Sum on the Boundaries and Diagonals
For two-dimensional square matrix of size (N x N). Find the total sum of elements on both the diagonals and at all the four boundaries.*/

import java.util.Scanner;

public class TotalSumontheBoundariesandDiagonals 
{
	public static void AllSum(int arr[][])
	{
		int i, j, sum=0;
		int size=arr.length;
		
	    for(i=0;i<size;i++)
	    {
	    	for(j=0;j<size;j++)
	    	{
	    		if(i==0) 
	    		{
	    			sum += arr[0][j];
	    		}
	    		if(i==(size-1)) 
	    		{
	    			sum += arr[size-1][j];
	    		}
	    	}
	    } 	
	    
	    for(i=1;i<size-1;i++)
	    {
	    	for(j=0;j<size;j++)
	    	{
	    		if(j==0) 
	    		{
	    			sum += arr[i][0];
	    		}
    		
	    		if(j==(size-1)) 
	    		{
	    			sum += arr[i][size-1];
	    		}
	    	}
	    } 
	    
	    for(i=1;i<size-1;i++) 
	    {
	    	for(j=1;j<size-1;j++) 
	    	{
	    		if(i==j) 
	    		{
	    			sum+=arr[i][j];
	    		}
	    	}
	    }
	    
	    for(i=1;i<size-1;i++) 
	    {
	    	for(j=1;j<size-1;j++) 
	    	{
	    		if(i==j) {continue;}
	    	else if (i+j==(size-1)) 
	    		{
	    			sum+=arr[i][j];	
	    		}
	    	}
	    }
	   
		System.out.println(sum);
	}

	public static int[][] takeInput()
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the matrix size");
	    int size=s.nextInt();		    
	    
	    int[][] arr=new int[size][size];
	    for(int i=0;i<size;i++)
	    {
	    	for(int j=0;j<size;j++)
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
		AllSum(input);
	}
}