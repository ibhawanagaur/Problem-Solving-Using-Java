/*Last Index Of a Number in an Array 
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0.*/

package Recursion;

import java.util.Scanner;

public class lastIndexOfNumber
{
	public static int lastIndexOfNumber(int arr[],int x, int si) 
	{	
		if(si==arr.length)
		{
            return -1;
        }
        int k= lastIndexOfNumber(arr,x,si+1);
        if(k!=-1)
        {
            return k;
        }
        else
        {
            if(arr[si]==x)
            {
                return si;
            }
            else
            {
                return -1;
            }
        }
    }

	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int[] input_arr = new int[size];
		
		System.out.print("Enter the number for search : ");
		int x = sc.nextInt();
		
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
		
		System.out.println(lastIndexOfNumber(input_arr, x,0));
		
	}
}