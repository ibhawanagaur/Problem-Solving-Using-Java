/*Swap Alternate
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.*/

package Array_1D;

import java.util.Scanner;

public class swapAlternate 
{
	public static void swap(int[] arr)
	{
		int temp;
		for(int i= 0; i<arr.length-1; i=i+2)
		{
			temp = arr[i];
			arr[i]= arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println("Swap Alternate");
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
		int[] input = new int[size];
		for(int i= 0; i<size; i++)
		{
			System.out.print("Enter the element at "+ i + "th term : ");
			input[i] = sc.nextInt();
		}
		printArray(input);
		swap(input);
	}
}