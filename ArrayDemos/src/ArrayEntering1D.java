import java.util.Scanner;
/**
 * 
 * @author LostRain
 * @date 2018��2��9��
 * @name ArrayDemos
 *
 */

public class ArrayEntering1D {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		//Ҫ��̬¼5��ѧ���ĳɼ��������ƽ����
		double[] scores = new double[5];
		double sum = 0;//�ܳɼ�
		double avg = 0;//ƽ���ɼ�
		for(int i = 0;i < scores.length;i++) {
			System.out.println("�������" + (i + 1) + "λͬѧ�ĳɼ�");
			scores[i] = input.nextDouble();
			sum = sum + scores[i];
		}
		avg = sum / scores.length;
		for(int j = 0;j < scores.length;j++) {
			System.out.println("��" + (j + 1) + "λͬѧ�ĳɼ���:" + scores[j]);
			
		}
		System.out.println("�˴�ƽ�����ǣ�" + avg);
	}
}
