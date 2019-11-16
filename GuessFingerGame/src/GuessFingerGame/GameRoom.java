package GuessFingerGame;

import java.util.Scanner;

/**
 * ��Ϸ����
 * 
 * @author LostRain
 * @date 2018��3��2��
 * @name GuessFingerGame
 *
 */
public class GameRoom {

	private Player player1 = null;
	private ComPlayer player2 = null;
	/** ����id */
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
		// ʵ�������
		player1 = new Player();
		player2 = new ComPlayer();
		// ʵ�ּ��ض���
		for (int i = 0; i <= 30; i++) {
			System.out.printf("*");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.printf("\n\t         ���سɹ�!\n");

	}

	public void startGame() {
		showMenu();
		gaming();

	}

	/**
	 * ��Ϸ�Ĵ�ѭ��
	 */
	private void gaming() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���ȭ��");
			choice = sc.nextInt();
			player1.setFist(choice);
			int fist1 = player1.getFist();
			player2.getFist();
			int fist2 = player2.getFist();
			
			
			int result = judge(fist1, fist2);// ���÷����ж���Ӯ
			System.out.println("����" + fist1);
			System.out.println("���ԣ�" + fist2);
			if (result == 0) {
				System.out.println("ƽ�֣�");
			} else if (result == 1) {
				System.out.println("��Ӯ�ˣ�");
			} else if (result == 2) {
				System.out.println("�����ˣ�");
			}
			System.out.println("�Ƿ���Ϸ��	y/n");
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
		System.out.println("---��ӭ�����ȭ---");
		System.out.println("��ȭ��ʽ��1.ʯͷ  2.���� 3.��");
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
		System.out.println("��Ϸ�ѽ������´��ټ���");
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
