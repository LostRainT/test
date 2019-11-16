import java.util.Scanner;
/**
 * 
 * @author LostRain
 * @date 2018Äê2ÔÂ8ÈÕ
 * @name ComputeAverage
 *
 */

public class ComputeAverage {
	private static Scanner input;
	private static double num1;
	private static double num2;
	private static double num3;
	private static double sum;
	private static double avg;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		//Prompt the user to enter three numbers
		System.out.print("Enter three numbers:\n");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		//Compute average
		sum = num1 + num2 + num3;
		avg = sum / 3;
		
		//Display results
		System.out.println("The average of " + num1 + " " + num2 + " " + num3 + " is " + avg);
		System.out.println("and the sum is " + sum);
		
	}

}
