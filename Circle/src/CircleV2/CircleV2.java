package CircleV2;
import java.util.Scanner;

public class CircleV2 {
	/** �뾶 */
	public double radius;
	/** �ܳ� */
	public double perimeter;
	/** ��� */
	public double area;
	/** ���� */
	public Scanner input;
	
	public void getRadius() {
		System.out.println("������뾶��");
		input = new Scanner(System.in);
		radius = input.nextDouble();
		input.close();
		}
	
	public void printPerimeter() {
		if(radius <= 0) {
			getRadius();
		}
		perimeter = radius * 2 * Math.PI;
		System.out.println("Բ���ܳ��ǣ�" + perimeter);
	}
	
	public void printArea() {
		area = radius * radius * Math.PI;
		System.out.println("Բ������ǣ�" + area);
	}
}
