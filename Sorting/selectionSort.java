/*Selection Sort */

package Sorting;

import java.util.Scanner;

public class selectionSort 
{
	public static void sort(int []arr)
	{
		for(int i = 0;i<arr.length;i++)
		{
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			for(int j=i ; j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min = arr[j];
					min_index = j;
				}
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.print("sorted array by Selection Sort ");
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