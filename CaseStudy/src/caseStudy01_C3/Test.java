package caseStudy01_C3;

/**
 * Kiem thu cho lop Book
 * 
 * @author HongThuy
 *
 */
public class Test {
	public static void main(String[] args) {
		Book b = new Book("OOP", new Author("Nguyen Van A", "nva@gmail.com", 'F'), 50000, 3);
		System.out.println(b);
	}
}
