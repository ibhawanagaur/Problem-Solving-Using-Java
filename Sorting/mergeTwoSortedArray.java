/*Merge Two Sorted Array*/

package Sorting;

import java.util.Scanner;

public class mergeTwoSortedArray 
{
	public static void sort(int []arr1, int[]arr2)
	{
		int[] arr=new int[arr1.length+arr1.length-1];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;
				k++;
			}	
			else
			{
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<arr1.length)
		{
    	arr[k]=arr1[i];
        i++;
        k++;
		}
    
		while(j<arr2.length)
		{
			arr[k]=arr2[j];
			j++;
			k++;
		}
		
		System.out.print("Two Merge Sorted array ");
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
		System.out.print("Enter the size of array 1 : ");
		int size1 = sc.nextInt();
		int[] input_arr1 = new int[size1];
		
		for(int i=0; i<size1; i++)
		{
			System.out.print("Enter the element at "+ i + "th term  of array 1 : ");
			input_arr1[i] = sc.nextInt();
		}
		
		System.out.print("Enter the size of array 2 : ");
		int size2 = sc.nextInt();
		int[] input_arr2 = new int[size2];
		
		for(int i=0; i<size2; i++)
		{
			System.out.print("Enter the element at "+ i + "th term  of array 2 : ");
			input_arr2[i] = sc.nextInt();
		}
		
		System.out.print("Original array 1- ");
		printArray(input_arr1);
		System.out.print("Original array 2- ");
		printArray(input_arr2);
		
		sort(input_arr1, input_arr2);
	}
}