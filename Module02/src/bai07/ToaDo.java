package bai07;

/**
 * Bieu dien lop Toa do
 * 
 * @author HongThuy
 *
 */
public class ToaDo {
	// Cac thuoc tinh
	private float toaDoX;
	private float toaDoY;
	private String tenToaDo;

	// Cac phuong thuc
	public float getToaDoX() {
		return toaDoX;
	}

	public void setToaDoX(float toaDoX) {
		this.toaDoX = toaDoX;
	}

	public float getToaDoY() {
		return toaDoY;
	}

	public void setToaDoY(float toaDoY) {
		this.toaDoY = toaDoY;
	}

	public String getTenToaDo() {
		return tenToaDo;
	}

	public void setTenToaDo(String tenToaDo) {
		this.tenToaDo = tenToaDo;
	}

	/**
	 * Constructor mac dinh cua lop Toa do
	 */
	public ToaDo() {
	}

	/**
	 * Conntructor day du tham so cua lop Toa Do
	 * 
	 * @param toaDoX   la toa do cua x
	 * @param toaDoY   la toa do cua y
	 * @param tenToaDo la ten cua toa do
	 */
	public ToaDo(float toaDoX, float toaDoY, String tenToaDo) {
		setToaDoX(toaDoX);
		setToaDoY(toaDoY);
		setTenToaDo(tenToaDo);
	}

	/**
	 * Bieu dien doi tuong Toa do o dang chuoi
	 * 
	 * @return String
	 */
	public String toString() {
		return String.format("%s(%.1f, %.1f)", this.tenToaDo, this.toaDoX, this.toaDoY);

	}
}
