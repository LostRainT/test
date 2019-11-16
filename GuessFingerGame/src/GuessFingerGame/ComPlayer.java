package GuessFingerGame;

import java.util.Random;

/**
 * 电脑
 * 
 * @author LostRain
 * @date 2018年3月2日
 * @name GuessFingerGame
 *
 */
public class ComPlayer {
	// 属性：名称、分数、所出的拳
	private String name;
	private int score;
	private int fist;

	// 方法：设置和得到名称、分数、出拳

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
		//电脑的出拳方式
		fist = new Random().nextInt(3) + 1;
		return fist;
	}

}
