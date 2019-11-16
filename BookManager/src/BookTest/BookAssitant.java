package BookTest;

import java.util.Scanner;

/**
 * @author LostRain Email:lost_rain@163.com
 * @date 2018��6��24�� ����9:01:20
 * @version
 * @parameter
 * @since
 * @return
 * 
 * 
 */
public class BookAssitant {

	private static Scanner sc;

	public void bookAssistant() {
		for (;;) {
			Book book1 = new Book("book1", 128.89, "123-456", 5);
			Book book2 = new Book("Book2", 98.88, "123-457", 0);
			Book book3 = new Book("Book3", 17.76, "123-458", 2);

			BookBiz bookBiz = new BookBiz();

			System.out.println("book name?");
			sc = new Scanner(System.in);
			String bookName = sc.nextLine();
			if (bookName.equals("book1")) {
				System.out.println("buy?");
				String isBuy = sc.nextLine();
				if (isBuy.equals("y") && book1.getCount() > 0) {
					bookBiz.sellBook(book1);
					System.out.println("Success!\nthe count left: " + book1.getCount());
				} else {
					System.out.println("the count left: " + book1.getCount());
					continue;
				}
			}
			if (bookName.equals("book2") && book2.getCount() > 0) {
				System.out.println("buy?");
				String isBuy = sc.nextLine();
				if (isBuy.equals("y")) {
					bookBiz.sellBook(book2);
					System.out.println("Success!\the count left: " + book2.getCount());
				} else {
					System.out.println("the count left: " + book2.getCount());
					continue;
				}
			}
			if (bookName.equals("book3") && book3.getCount() > 0) {
				System.out.println("buy?");
				String isBuy = sc.nextLine();
				if (isBuy.equals("y")) {
					bookBiz.sellBook(book3);
					System.out.println("Success!\nthe count left: " + book3.getCount());
				} else {
					System.out.println("the count left: " + book3.getCount());
					continue;
				}
			} else  {
				System.out.println("sorry! this book has been sold out!");
				continue;
			}

		}
	}
}
