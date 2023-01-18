/*Check Number sequence
You are given S, a sequence of n integers i.e. S = s1, s2, ..., sn. Compute if it is possible to split S into two parts : s1, s2, ..., si and si+1, si+2, ….., sn (0 <= i <= n) in such a way that the first part is strictly decreasing while the second is strictly increasing one.
Note : We say that x is strictly larger than y when x > y.
So, a strictly increasing sequence can be 1 4 8. However, 1 4 4 is NOT a strictly increasing sequence.


That is, in the sequence if numbers are decreasing, they can start increasing at one point. Thereafter, they cannot decrease at any point further.
Sequence made up of only increasing numbers or only decreasing numbers is a valid sequence. So, in both the cases, print true.*/

package forLoop;

import java.util.Scanner;

public class CheckNumberSequence 
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number of element : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] a = new int[N];
		for (int i = 0; i < N; i++) 
		{
			System.out.print("Enter "+ i +"th term : ");
			a[i] = sc.nextInt();
		}
		
		int[] A = new int[N - 1];
		for (int i = 0; i < N - 1; i++) 
		{
			if (a[i] == a[i + 1]) 
			{
				System.out.println("false");
				return;
			}
			A[i] = a[i] - a[i + 1];
			//System.out.println(A[i]);
		}
		//System.out.println();
		for(int i = 0;i < N - 2;i++) 
		{
			if (A[i] < 0 && A[i + 1] > 0) 
			{
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}
}