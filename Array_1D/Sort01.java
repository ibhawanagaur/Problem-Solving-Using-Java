/*Sort 0 1
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. Write a function to sort this array/list. Think of a solution which scans the array/list only once and don't require use of an extra array/list.*/

package Array_1D;

import java.util.Scanner;

public class Sort01 
{
	public static void sort(int arr[])
	{
		int zero = 0;
		for(int i =0;i<arr.length;i++)
        {
			if(arr[i]==0)
            {
				zero++;
            }
        }
        for(int i =0;i<arr.length;i++)
        {
        	if(i<zero)
            {
        		arr[i] = 0;
            }
            else
            {
            	arr[i] = 1;
            }
        }
        System.out.print("Sorted array ");
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
		System.out.print("Original array ");
		printArray(input);
		sort(input);
	}
}