/*Arrange Numbers In Array
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.*/

package Array_1D;

import java.util.Scanner;

public class ArrangeNumbersInArray 
{
	public static void numberinArray(int size)
	{
		int[] arr = new int[size];
		
		if(size%2==0)
		{
			for(int i=0;i<size/2;i++)
			{
				arr[i] = 2*i + 1;
			}
			
			int p = size;
			for(int i=size/2;i<size;i++)
			{
				arr[i] = p;
				p -= 2;
			}
			printArray(arr);
		}
		
		else
		{
			for(int i=0;i<=size/2;i++)
			{
				arr[i] = 2*i + 1;
			}
			
			int p = size-1;
			for(int i=(size+2)/2;i<size;i++)
			{
				arr[i] = p;
				p -= 2;
			}
			printArray(arr);
		}
	}
	
	public static void printArray(int arr[])
	{
		for(int i= 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		numberinArray(size);
	}
}