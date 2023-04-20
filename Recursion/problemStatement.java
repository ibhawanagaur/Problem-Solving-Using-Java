/*Tower Of Hanoi - Problem Statement
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.
Print the steps required to move n disks from source rod to destination rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.*/

package Recursion;

import java.util.Scanner;

public class problemStatement 
{
	 public static void towerHanoi(int n,char a,char b,char c)
	 {
		 if (n == 0)
		{
			 return;
		}
		 if(n==1)
		 {
			 System.out.println("move 1st disk from "+a+" to "+c);
	         return;
	     }
	     towerHanoi(n-1,a,c,b);
	     System.out.println("move "+n+" disk from "+a+" to "+c);
	     towerHanoi(n-1,b,a,c);   
	 }
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerHanoi(n, 'a', 'b', 'c');
	}
}