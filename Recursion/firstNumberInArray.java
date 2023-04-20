/*First Index Of a Number in an Array 
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.*/

package Recursion;

import java.util.Scanner;

public class firstNumberInArray 
{
	public static int firstIndexNumber(int arr[],int x, int si) 
	{	
		int n = arr.length;
		if(si==n)
		{
			return -1;
		}
		if(arr[si]==x)
		{
			return si;
		}
		return firstIndexNumber(arr,x,si+1);
    }

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
		
		System.out.println(firstIndexNumber(input_arr, x,0));
		
	}
}