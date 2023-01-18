/*Intersection of Two Arrays 
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.*/

package Array_1D;

import java.util.Scanner;

public class IntersectionofTwoArrays 
{
	public static void Intersection(int arr1[], int[] arr2)
	{
		for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
            	if(arr1[i]==arr2[j])
            	{
            		System.out.print(arr1[i]+" ");
            		arr2[j] = Integer.MIN_VALUE;
            		break;
            	}
            }
        }
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
		System.out.print("Enter the size of array 1 : ");
		int size1 = sc.nextInt();
		
		int[] input_arr1 = new int[size1];
		for(int i= 0; i<size1; i++)
		{
			System.out.print("Enter the element of array 1 "+ i + "th term : ");
			input_arr1[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Enter the size of array 2 : ");
		int size2 = sc.nextInt();
		int[] input_arr2 = new int[size2];
		
		for(int i= 0; i<size2; i++)
		{
			System.out.print("Enter the element of array 2 "+ i + "th term : ");
			input_arr2[i] = sc.nextInt();
		}
		
		System.out.print("Array 1 : ");
		printArray(input_arr1);
		System.out.print("Array 2 : ");
		printArray(input_arr2);
		Intersection(input_arr1, input_arr2);
	}
}