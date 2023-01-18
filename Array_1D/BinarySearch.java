/*Code Binary Search
You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.*/

package PracticeMore;

import java.util.Scanner;

public class BinarySearch 
{
	public static int binarySearch(int[]arr, int x)
	{
		int min = 0;
		int max = arr.length-1;
		
		for(int i=0;i<arr.length;i++)
		{
			int mid = (min+max)/2;
			if(arr[mid]<x)
			{
				min= mid+1;
			}
			else if(arr[mid]>x)
			{
				max= mid-1;
			}
			else
			{
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void printArray(int arr[])
	{
		for(int i= 0; i<arr.length; i++)
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
		System.out.print("Enter the number for search : ");
		int number = sc.nextInt();
		int[] input_arr = new int[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter the element at "+ i + "th term : ");
			input_arr[i] = sc.nextInt();
		}
		
		printArray(input_arr);
		
		int index = binarySearch(input_arr, number);
		System.out.print("Index of given number in array : "+index);
	}
}