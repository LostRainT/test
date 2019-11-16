package GuessFingerGame;

import java.util.Scanner;

/**
 * 游戏房间
 * 
 * @author LostRain
 * @date 2018年3月2日
 * @name GuessFingerGame
 *
 */
public class GameRoom {

	private Player player1 = null;
	private ComPlayer player2 = null;
	/** 房间id */
	private int roomId;
	private String roomName;
	private int choice;
	private String answer;

	public GameRoom() {
		initGame();
		startGame();
		endGame();
		
	}

	public void initGame() {
		// 实例化玩家
		player1 = new Player();
		player2 = new ComPlayer();
		// 实现加载动画
		for (int i = 0; i <= 30; i++) {
			System.out.printf("*");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.printf("\n\t         加载成功!\n");

	}

	public void startGame() {
		showMenu();
		gaming();

	}

	/**
	 * 游戏的大循环
	 */
	private void gaming() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请出拳：");
			choice = sc.nextInt();
			player1.setFist(choice);
			int fist1 = player1.getFist();
			player2.getFist();
			int fist2 = player2.getFist();
			
			
			int result = judge(fist1, fist2);// 调用方法判断输赢
			System.out.println("您：" + fist1);
			System.out.println("电脑：" + fist2);
			if (result == 0) {
				System.out.println("平局！");
			} else if (result == 1) {
				System.out.println("你赢了！");
			} else if (result == 2) {
				System.out.println("你输了！");
			}
			System.out.println("是否游戏？	y/n");
			answer = sc.next();
			if ("y".equalsIgnoreCase(answer)) {
				continue;
			} else if ("n".equalsIgnoreCase(answer)) {
				break;
			}
			break;
		}
		sc.close();
	}

	public void showMenu() {
		System.out.println("---欢迎进入猜拳---");
		System.out.println("出拳方式：1.石头  2.剪刀 3.布");
	}

	public int judge(int fist1, int fist2) {
		if (fist1 == fist2) {
			return 0;
		} else if (fist1 == 1 && fist2 == 2 || fist1 == 2 && fist2 == 3 || fist1 == 3 && fist2 == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	public int getRoomId() {
		return roomId;
	}

	public void endGame() {
		System.out.println("游戏已结束，下次再见！");
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

}
