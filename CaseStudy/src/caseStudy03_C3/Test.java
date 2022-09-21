package caseStudy03_C3;

/**
 * Ham kiem thu cho lop PolyLine
 * 
 * @author HongThuy
 *
 */
public class Test {
	public static void main(String[] agrs) {
		PolyLine poly = new PolyLine(10);
		try {
			poly.appendPoint(3, 4);
			poly.appendPoint(new Point(5, 5));
			poly.appendPoint(new Point(9, 10));
			System.out.println(poly);
			System.out.println(poly.getLengh());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
