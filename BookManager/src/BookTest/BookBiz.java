package BookTest;

/**
 * 
 * @author LostRain
 * @date 2018Äê6ÔÂ24ÈÕ
 * @name BookManager
 *
 */
public class BookBiz {
	public int sellBook(Book book) {
		if (!(book.getCount() > 0)) {
			return (-1);
		}
		book.setCount(book.getCount() - 1);
		return(1);
	}
}
