package caseStudy03_C2;

/**
 * Bieu dien lop PolyLine
 * 
 * @author HongThuy
 *
 */
public class PolyLine {
	// Cac thuoc tinh
	private Point[] points;
	private int count;
	// Cac phuong thuc

	public PolyLine(int n) {
		points = new Point[n];
		count = 0;
	}

	/**
	 * Ham them phan tu point vao mang
	 * 
	 * @param x
	 * @param y
	 */
	public void appendPoint(int x, int y) throws Exception {
		if (count < points.length)
			points[count++] = new Point(x, y);
		else
			throw new Exception("Vuot qua kich thuoc mang!");
	}

	public void appendPoint(Point p) throws Exception {
		if (count < points.length)
			points[count++] = p;
		else
			throw new Exception("Vuot qua kich thuoc mang!");
	}

	@Override
	public String toString() {
		String s = "{";
		for (int i = 0; i < points.length; i++) {
			s += points[i] + " ";
		}
		s += "}";
		return s;
	}

	/**
	 * 
	 * @return so luong phan tu cua mang
	 */
	public int getLengh() {
		return count;
	}
}
