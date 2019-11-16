import java.util.Scanner;
/**
 * 
 * @author LostRain
 * @date 2018年2月8日
 * @name Circle
 *
 */

public class circle {

	private static Scanner input;//声明input是一个Scanner类型的变量

	public static void main(String[] args) {
		double p = 3.14159;//定义π的值
		double area;//定义圆的面积
		double radius;//定义圆的半径
		input = new Scanner(System.in);//创建了一个Scanner对象，并将它赋值给input
		String x = "Please enter the radius of the circle:";
		
		//让用户自行输入圆的半径，并计算出圆的面积
		System.out.println(x);
		radius = input.nextDouble();//从键盘上读取一个double类型数值，并将该数值赋值给radius
		area = p * radius * radius;//计算出面积
		System.out.printf("the area for the circle of radius %.4f is：%.4f\n",radius,area);//打印面积
			
		
	}
}
