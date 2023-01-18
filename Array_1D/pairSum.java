/*Pair Sum
You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.*/

package Array_1D;

import java.util.Scanner;

public class pairSum 
{
	public static int searchPairSum(int arr[] , int x)
	{
		int count = 0;
		for (int i = 0;i < arr.length - 1; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] + arr[j] == x)
				{
                    count++;
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
		
		int s = searchPairSum(input, x );
		System.out.println("pair sum is "+ s);
	}
}