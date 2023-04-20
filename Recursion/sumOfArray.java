/* Sum Of Array
Given an array of length N, you need to find and return the sum of all elements of the array. */

package Recursion;

import java.util.Scanner;

public class sumOfArray 
{
	public static int arraySum(int arr[]) 
	{	
		int n = arr.length;
		int sum = 0;
		if (n <= 0) 
		{
			return sum;
        }
		
		int smallArray[] = new int[n-1];
		for(int i=1;i<n;i++)
		{
			smallArray[i-1] = arr[i];
		}
		
		int smallOutput = arraySum(smallArray);
		sum = smallOutput + arr[0];
		return sum;
		
		//return arraySum(arr, n-1 ) + arr[n-1];
    }

	public static void main(String[] arg)
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
		
		for(int i= 0; i<size; i++)
		{
			System.out.print(input_arr[i]+ ", ");
		}
		System.out.println();
		
		System.out.println("Sum of array is "+arraySum(input_arr));
		
	}
}