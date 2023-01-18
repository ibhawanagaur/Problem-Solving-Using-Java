/*Find Unique
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.*/

package Array_1D;

import java.util.Scanner;

public class FindUnique 
{
	public static int uniqueNumber(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print("Unique Value : ");
				return arr[i];
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
		int[] input_arr = new int[size];
		for(int i= 0; i<size; i++)
		{
			System.out.print("Enter the element at "+ i + "th term : ");
			input_arr[i] = sc.nextInt();
		}
		printArray(input_arr);
		int unique_value = uniqueNumber(input_arr);
		System.out.println(unique_value);
	}
}