/*String to Integer
Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.*/

package Recursion;

public class stringToInteger 
{
	public static int strToInt(String s)
	{
        if (s.length() == 1) 
        {
        	return (s.charAt(0) - '0');
        }
 
        double i = strToInt(s.substring(1));
        System.out.println("i"+i);
        double j = s.charAt(0) - '0';
        System.out.println("j"+j);
        j = j*Math.pow(10, s.length() - 1) + i;
        return (int)(j);
    }
	public static void main(String[] args) 
	{
		System.out.println(strToInt("1234"));
	}
}