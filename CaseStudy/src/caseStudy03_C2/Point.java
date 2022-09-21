package caseStudy03_C2;

/**
 * Bieu dien lop Point
 * 
 * @author HongThuy
 *
 */
public class Point {
	// Cac thuoc tinh
	private int x;
	private int y;

	// Cac phuong thuc
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * default Contructors
	 */
	public Point() {

	}

	/**
	 * Constructors day du tham so
	 * 
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return String.format("(%d,%d)", x, y);
	}

}
