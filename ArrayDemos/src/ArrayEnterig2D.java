import java.util.Scanner;
/**
 * 
 * @author LostRain
 * @date 2018��2��10��
 * @name �ɼ�¼���ͳ��
 *
 */

public class ArrayEnterig2D {
	private static Scanner input;

	public static void main(String[] args) {
		String[] stuNames = {"XXX","YYY","ZZZ"};
		String[] courseNames = {"��һ��","�ڶ���","������"};
		final int ROW = stuNames.length;
		final int COL = courseNames.length;
		double sum = 0,avg = 0;
		input = new Scanner(System.in);
		
		double[][]scores = new double[ROW][COL];
		
		for(int i = 0;i < ROW;i++) {
			for(int j = 0;j < COL;j++) {
				System.out.println(stuNames[i] + "��" + courseNames[j] + "�ɼ�:");
				scores[i][j] = input.nextDouble();
			}
		
		}
		for(int i = 0;i < ROW;i++) {
			for(int j = 0;j < COL;j++) {
				System.out.println(stuNames[i] + "��" + courseNames[j] + "�ɼ�:" + scores[i][j]);
			}
		
		}
		for(int i = 0;i < ROW;i++) {
			for(int j = 0;j < COL;j++) {
				sum = sum + scores[i][j];
				avg = sum / (stuNames.length * courseNames.length);
			}
		}
		System.out.println("�ܷ֣�" + sum);
		System.out.printf("��ƽ���֣�%.2f",avg);
	}
}
