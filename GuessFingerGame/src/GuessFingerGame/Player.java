package GuessFingerGame;

/**
 * ���
 * 
 * @author LostRain
 * @date 2018��3��2��
 * @name GuessFingerGame
 *
 */
public class Player {

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
		return fist;
	}

	/**
	 * 
	 * @param fist
	 */
	public void setFist(int fist) {
		this.fist = fist;
	}

}
