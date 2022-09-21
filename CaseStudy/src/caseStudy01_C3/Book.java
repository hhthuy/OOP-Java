package caseStudy01_C3;

/**
 * Bieu dien cho lop Book
 * 
 * @author HongThuy
 *
 */
public class Book {
	// Cac thuoc tinh
	private String name;
	private Author author;
	private double price;
	private int qty;

	// Cac phuong thuc
	/**
	 * Contructors with 3 parameters is name, author, price.
	 * 
	 * @param name   la ten sach
	 * @param author la ten tac gia
	 * @param price  la gia thah cua sach
	 */
	public Book(String name, Author author, double price) {
		this(name, author, price, 0);
	}

	/**
	 * Constructors is full of parameters
	 * 
	 * @param name   la ten sach
	 * @param author la tac gia sach
	 * @param price  la gia thanh cua sach
	 * @param qty    la so luong sach
	 */
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		setPrice(price);
		setQty(qty);
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return String.format("Book [name=%s, %s , price=%.3f, qty=%d", name, author, price, qty);
	}

}
