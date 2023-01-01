/*For two-dimensional integer array/list of size (N x M), find and print the sum of all elements */

import java.util.Scanner;

public class SumofAllElement 
{
	public static int fun(int[][] arr2d)
	{
		int sum=0;
	    for(int i=0;i<arr2d.length;i++)
	    {
	    	for(int j=0;j<arr2d[i].length;j++)
	        {
	            sum+=arr2d[i][j];
	        }
	    }
	    return sum;
	}
	
	public static int[][] takeInput()
	{
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number of rows");
	    int rows=s.nextInt();		    
	    System.out.println("Enter number of cols");
	    int cols=s.nextInt();
	    int[][] arr=new int[rows][cols];
	    for(int i=0;i<rows;i++)
	    {
	    	for(int j=0;j<cols;j++)
	    	{
	    		System.out.println("Enter the element at "+ i+ " row "+j+"column");
		        arr[i][j]=s.nextInt();
		    }
		}
		    return arr;
	}
	
	public static void main(String[] args) 
	{ 
	    int[][] arr = takeInput(); 
	    System.out.println("Sum of all element is = "+ fun(arr)); 
	} 
}