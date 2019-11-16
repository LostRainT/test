package BookTest;
/**
 * 
 * @author LostRain
 * @date 2018年6月24日
 * @name BookManager
 *
 */
public class Book {
	private double price;	//售价
	private String name;	//书名
	private String ISBN;	//出版编码
	private int count;	//库存

	public Book(String name, double price, String ISBN, int count) {
		setPrice(price);
		setName(name);
		setISBN(ISBN);
		setCount(count);

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else if (price < 0) {
			price = 0;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

}
