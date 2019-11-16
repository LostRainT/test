import java.util.Scanner;
/**
 * 
 * @author LostRain
 * @date 2018年2月10日
 * @name 成绩录入和统计
 *
 */

public class ArrayEnterig2D {
	private static Scanner input;

	public static void main(String[] args) {
		String[] stuNames = {"XXX","YYY","ZZZ"};
		String[] courseNames = {"第一项","第二项","第三项"};
		final int ROW = stuNames.length;
		final int COL = courseNames.length;
		double sum = 0,avg = 0;
		input = new Scanner(System.in);
		
		double[][]scores = new double[ROW][COL];
		
		for(int i = 0;i < ROW;i++) {
			for(int j = 0;j < COL;j++) {
				System.out.println(stuNames[i] + "的" + courseNames[j] + "成绩:");
				scores[i][j] = input.nextDouble();
			}
		
		}
		for(int i = 0;i < ROW;i++) {
			for(int j = 0;j < COL;j++) {
				System.out.println(stuNames[i] + "的" + courseNames[j] + "成绩:" + scores[i][j]);
			}
		
		}
		for(int i = 0;i < ROW;i++) {
			for(int j = 0;j < COL;j++) {
				sum = sum + scores[i][j];
				avg = sum / (stuNames.length * courseNames.length);
			}
		}
		System.out.println("总分：" + sum);
		System.out.printf("总平均分：%.2f",avg);
	}
}
