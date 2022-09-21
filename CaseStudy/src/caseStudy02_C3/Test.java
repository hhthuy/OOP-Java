package caseStudy02_C3;

/**
 * Ham kiem tra cho lop Book
 * 
 * @author Hong Thuy
 *
 */
public class Test {
	public static void main(String[] args) {
		Author[] au = new Author[2];
		au[0] = new Author("Nguyen Van B", "nvb@gmai.com", 'M');
		au[1] = new Author("Tran Thi C", "tvc@gmai.com", 'F');

		Book b = new Book("OOP", au, 95000, 3);
		System.out.println(b);
		System.out.println(b.getAuthorName());
	}
}
