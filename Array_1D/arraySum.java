/*Return Array Sum
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.*/

package Array_1D;

import java.util.Scanner;

public class arraySum 
{
	public static int sumofArray(int arr[])
	{
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		System.out.print("Sum of array is  ");
		return sum;
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
		printArray(input_arr);
		int answer = sumofArray(input_arr);
		System.out.println(answer);
	}
}