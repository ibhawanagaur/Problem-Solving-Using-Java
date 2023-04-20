/* Check if the array is sorted
Given an array of length N, you need to find whether the array is sorted or not. */

package Recursion;

import java.util.Scanner;

public class checkArraySorted 
{
	public static boolean isArraySorted(int arr[],int si)
	{
        if(si==arr.length-1)
        {
            return true;
        }
        if(arr[si]>arr[si+1])
        {
            return false;
        }
        boolean isSmallArraySorted=isArraySorted(arr,si+1);
        return isSmallArraySorted;
    }
	
//	public static boolean isArraySorted(int arr[])
//	{
//		if(arr.length == 1)
//		{
//			return true;
//		}
//		if(arr[0]>arr[1])
//		{
//			return false;
//		}
//		
//		int smallArray[] = new int[arr.length-1];
//		for(int i=1;i<arr.length;i++)
//		{
//			smallArray[i-1] = arr[i];
//		}
//			boolean isSmallArraySorted = isArraySorted(smallArray);
//			return isSmallArraySorted;
//	}
	
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
		
		//System.out.println(isArraySorted(input_arr));
		System.out.println(isArraySorted(input_arr,0));
	}
}