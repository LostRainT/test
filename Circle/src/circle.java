import java.util.Scanner;
/**
 * 
 * @author LostRain
 * @date 2018��2��8��
 * @name Circle
 *
 */

public class circle {

	private static Scanner input;//����input��һ��Scanner���͵ı���

	public static void main(String[] args) {
		double p = 3.14159;//����е�ֵ
		double area;//����Բ�����
		double radius;//����Բ�İ뾶
		input = new Scanner(System.in);//������һ��Scanner���󣬲�������ֵ��input
		String x = "Please enter the radius of the circle:";
		
		//���û���������Բ�İ뾶���������Բ�����
		System.out.println(x);
		radius = input.nextDouble();//�Ӽ����϶�ȡһ��double������ֵ����������ֵ��ֵ��radius
		area = p * radius * radius;//��������
		System.out.printf("the area for the circle of radius %.4f is��%.4f\n",radius,area);//��ӡ���
			
		
	}
}
