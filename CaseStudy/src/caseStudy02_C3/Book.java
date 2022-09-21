package caseStudy02_C3;

/**
 * Bieu dien cho lop BOOK
 * 
 * @author HongThuy
 *
 */
public class Book {
	// Ccac thuoc tinh
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	// Cac phuong thuc
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
	 * @return the authors
	 */
	public Author[] getAuthors() {
		return authors;
	}

	/**
	 * Construtors voi 3 tham so la: name, authors, price
	 * 
	 * @param name    la ten sach
	 * @param authors la ten tac gia
	 * @param price   la gia tien cau sach
	 */
	public Book(String name, Author[] authors, double price) {
		this(name, authors, price, 0);
	}

	/**
	 * Constructors day du cac tham so
	 * 
	 * @param name    la ten sach
	 * @param authors la ten tac gia
	 * @param price   la gia tien cau sach
	 * @param qty     la so luong sach
	 */
	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		setPrice(price);
		setQty(qty);
	}

	public String toString() {
		String s = "";
		for (Author temp : authors) {
			s += temp + ",";
		}
		return String.format("Book[name=%s, %s, price=%.3f, qty=%d ", name, s, price, qty);
	}

	public String getAuthorName() {
		String s = "";
		for (Author temp : authors) {
			s += temp.getName() + ",";
		}
		return s;
	}

}
