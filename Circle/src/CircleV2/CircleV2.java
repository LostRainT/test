package CircleV2;
import java.util.Scanner;

public class CircleV2 {
	/** 半径 */
	public double radius;
	/** 周长 */
	public double perimeter;
	/** 面积 */
	public double area;
	/** 输入 */
	public Scanner input;
	
	public void getRadius() {
		System.out.println("请输入半径：");
		input = new Scanner(System.in);
		radius = input.nextDouble();
		input.close();
		}
	
	public void printPerimeter() {
		if(radius <= 0) {
			getRadius();
		}
		perimeter = radius * 2 * Math.PI;
		System.out.println("圆的周长是：" + perimeter);
	}
	
	public void printArea() {
		area = radius * radius * Math.PI;
		System.out.println("圆的面积是：" + area);
	}
}
