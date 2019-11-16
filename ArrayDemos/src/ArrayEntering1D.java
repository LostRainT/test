import java.util.Scanner;
/**
 * 
 * @author LostRain
 * @date 2018年2月9日
 * @name ArrayDemos
 *
 */

public class ArrayEntering1D {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		//要求动态录5个学生的成绩并计算出平均分
		double[] scores = new double[5];
		double sum = 0;//总成绩
		double avg = 0;//平均成绩
		for(int i = 0;i < scores.length;i++) {
			System.out.println("请输入第" + (i + 1) + "位同学的成绩");
			scores[i] = input.nextDouble();
			sum = sum + scores[i];
		}
		avg = sum / scores.length;
		for(int j = 0;j < scores.length;j++) {
			System.out.println("第" + (j + 1) + "位同学的成绩是:" + scores[j]);
			
		}
		System.out.println("此次平均分是：" + avg);
	}
}
