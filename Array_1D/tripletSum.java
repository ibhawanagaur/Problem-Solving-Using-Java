/*Triplet Sum
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.*/

package Array_1D;

import java.util.Scanner;

public class tripletSum 
{
	public static int searchTripletSum(int arr[] , int x)
	{
		int count = 0;
		for (int i = 0;i < arr.length - 1; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				for (int k = j + 1; k < arr.length; k++)
				{
					if (arr[i] + arr[j] +arr[k] == x)
					{
						count++;
					}
				}
			}
		}
        return count;
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
		int x = sc.nextInt();
		
		int[] input = new int[size];
		for(int i= 0; i<size; i++)
		{
			System.out.print("Enter the element at "+ i + "th term : ");
			input[i] = sc.nextInt();
		}
		printArray(input);
		
		int s = searchTripletSum(input, x );
		System.out.println("triple sum is "+ s);
	}
}