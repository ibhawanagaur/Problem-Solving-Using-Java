package Functions;

import java.util.Scanner;

public class FibonacciNumber
{	
	public static void checkMember(int n) 
    {
        int f1 = 0;
        int f2 = 1;
        int f;
        
        if (n == 0) 
        {
        	System.out.println("true");
            return ;
        }
        
        if (n == 1) 
        {
        	System.out.println("true");
            return ;
        }
        
        for (int i = 3; i <= (n / 2) + 4; i++) 
        {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            if (f == n) 
            {
            	System.out.println("true");
                return;
            }
        }
        System.out.println("false");
        return;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        checkMember(N);
    }
}