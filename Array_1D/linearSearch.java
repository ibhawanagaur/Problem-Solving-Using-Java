/*Linear Search
You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the given array/list using 'Linear Search'.
 You have been required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1.
'Linear search' is a method for finding an element within an array/list. It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.*/


package Array_1D;

import java.util.Scanner;

public class linearSearch 
{
	public static int linearSearch(int arr[], int x) 
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void printArray(int arr[]) 
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int[] input_arr = new int[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter the element at "+ i + "th term : ");
			input_arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		printArray(input_arr);
		int answer = linearSearch(input_arr, x);
		System.out.println(answer);
	}
}