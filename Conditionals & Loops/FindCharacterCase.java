/*Find Character Case
Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet*/

package PracticeMore;

import java.lang.*; 
import java.util.*;

public class FindCharacterCase 
{
    public static void main(String[] args) 
    {
    	System.out.print("Enter your input : ");
    	Scanner sc=new Scanner(System.in);
        char n = sc.next().charAt(0);        
        int a=n;
        
        if(a>=65 && a<=90)
        {
            System.out.print("1");
        }
        else if(a>=97 && a<=122)
        {
             System.out.print("0");
        }
        else
        {
             System.out.print("-1");
        }
    }
}
