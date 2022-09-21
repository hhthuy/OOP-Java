package bai08;

public class SinhVien {
	// Cac thuoc tinh
	private String maSV;
	private String hoTen;

	// Cac phuongthuc
	/**
	 * @return the maSV
	 */
	public String getMaSV() {
		return maSV;
	}

	/**
	 * @param maSV the maSV to set
	 */
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		if (!hoTen.trim().equals(""))
			this.hoTen = hoTen;
		else 
			this.hoTen = "chua biet ten";
	}

	// Constructors day du tham so
	public SinhVien(String maSV, String hoTen) {
		setMaSV(maSV);
		setHoTen(hoTen);
	}

	@Override
	public String toString() {
		return String.format("%7s | %s \n", maSV, hoTen);
	}

}
