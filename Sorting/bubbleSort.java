 package Sorting;

import java.util.Scanner;

public class bubbleSort
{
	public static void sort(int []arr)
	{
		for(int i = 0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("sorted array by Bubble Sort ");
		printArray(arr);
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
		int[] input_arr = new int[size];
		
		for(int i=0; i<size; i++)
		{
			System.out.print("Enter the element at "+ i + "th term : ");
			input_arr[i] = sc.nextInt();
		}
		
		System.out.print("Original array ");
		printArray(input_arr);
		sort(input_arr);
	}
}