package CircleV3;

import java.util.Scanner;

public class circleV3Test {
	public static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("pleas enter the radius:");
		double radius = input.nextDouble();
		circleV3 circle = new circleV3(radius);
		circle.show();
		input.close();
	}
}
