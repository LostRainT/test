import java.util.Scanner;

public class dice {
	private static Scanner input;

	public static void main(String[] args) {
		int choice = 0;
		input = new Scanner(System.in);
		for(;;) {
			System.out.println("play a guess number game enter     1");
			System.out.println("use your luck enter                2");
			System.out.println("exit enter                         3");
			choice = input.nextInt();
			if(choice == 1) {
				System.out.println("haven't finished");
				continue;
				}
			else if (choice == 2) {
				int i = 0;
				for(i = 0;i < 10;i++){
					int dice = (int)(Math.random() * 6 + 1);
					System.out.println("turn" + (i + 1) + ":   " + dice);
					if(dice == 6) {
					System.out.printf("you win, you tried %d times\n",(i + 1));
					System.out.println("----------------------------------");
					break;
					}
				
				}
				if(i == 10) {
					System.out.println("you have no chance!");
					System.out.println("----------------------------------");
				}
			}
			else if(choice == 3) {
				break;
			}
		}
	
		
		
		
		
	}
}
