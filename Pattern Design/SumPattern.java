/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1=1
1+2=3
1+2+3=6
1+2+3+4=10
*/
package Patterns;
import java.util.Scanner;
public class SumPattern {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows n = ");

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int i =1;
        int sum = i;
		while(i<=n) {
			int t= 1;
			for(int j=1;j<=i;j++) {
				if(t<i){
					System.out.print(t+"+");            
			  		t++;  
				}
				else {
					System.out.print(t+"="+sum);   
					}
			}
			System.out.println();  
            i=i+1;
		    sum=sum+i;
		}
	}
}
