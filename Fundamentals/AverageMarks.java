/*
Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 of a student considering all the three marks have been given in integer format.

Now, you need to calculate the average of the given marks and print it.

All the test marks are in integers and hence calculate the average in integer as well. That is, you need to print the integer part of the average only and neglect the decimal part.
*/
import java.util.Scanner;
public class AverageMarks {
		public static void main(String[] args) 
	    {
			System.out.println("Enter name as a single character");
	        Scanner s = new Scanner(System.in);
			String str = s.next();
	        char ch = str.charAt(0); //	character	input
	        
	        System.out.println("Enter marks m1, m2,m3");
	        int m1,m2,m3;
	        m1 = s.nextInt();
	        m2= s.nextInt();
	        m3= s.nextInt();
	       
	        int avg = (m1+m2+m3)/3;
	        System.out.println(ch);
	        System.out.println(avg);
		}
	}