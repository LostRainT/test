package GuessFingerGame;

import java.util.Random;

/**
 * ����
 * 
 * @author LostRain
 * @date 2018��3��2��
 * @name GuessFingerGame
 *
 */
public class ComPlayer {
	// ���ԣ����ơ�������������ȭ
	private String name;
	private int score;
	private int fist;

	// ���������ú͵õ����ơ���������ȭ

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return
	 */
	public int getScore() {
		return score;
	}

	/**
	 * 
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * 
	 * @return
	 */
	public int getFist() {
		//���Եĳ�ȭ��ʽ
		fist = new Random().nextInt(3) + 1;
		return fist;
	}

}
