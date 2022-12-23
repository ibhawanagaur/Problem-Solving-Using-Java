/* 
 * Calculate Simple Interest.
*/
import java.util.Scanner;
public class CalculateSimpleInterest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter rate");
		double rate = s.nextDouble();
		
		System.out.println("Enter time");
		double time = s.nextDouble();
		
		System.out.println("Enter Principal");
		double Principal = s.nextDouble();
		
		double SimpleInterest = (Principal*rate*time)/100;
		System.out.println("Simple Interest = "+ SimpleInterest);
	}
}