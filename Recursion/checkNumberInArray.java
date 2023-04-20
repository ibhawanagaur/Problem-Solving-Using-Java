/*Check Number in Array
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.*/

package Recursion;

import java.util.Scanner;

public class checkNumberInArray 
{
	public static boolean checkNumber(int arr[],int x) 
	{	
		int n = arr.length;
		if (n <= 0) 
		{
			return false;
        }
		if(arr[0] == x)
		{
			return true;
		}
		
		int smallArray[] = new int[n-1];
		for(int i=1;i<n;i++)
		{
			smallArray[i-1] = arr[i];
		}
		
		boolean smallOutput = checkNumber(smallArray,x);
		
		return smallOutput;
    }
	/*We can optimized the code
	public static boolean checkNumber(int arr[], int x, int si)
	{
		if(arr[si]==x)
		{
			return true;
		}
		if(arr[si]!=x)
		{
			return false;
		}
		return checkNumber(arr, x , si+1);
	}*/

	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int[] input_arr = new int[size];
		
		System.out.print("Enter the number for search : ");
		int x = sc.nextInt();
		
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter the element at "+ i + "th term : ");
			input_arr[i] = sc.nextInt();
		}
		
		for(int i= 0; i<size; i++)
		{
			System.out.print(input_arr[i]+ ", ");
		}
		System.out.println();
		
		System.out.println(checkNumber(input_arr, x));
		
	}
}