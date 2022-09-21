package bai04;

/**
 * Bieu dien lop THONG TIN DANG KY XE Voi cac thuoc tinh gom: chu xe, loai xe,
 * gai tri xe,dung tich xy lanh.
 * 
 * @author HP
 *
 */
public class ThongTinDangKyXe {
	// CAC THUOC TINH
	private String chuXe;
	private String loaiXe;
	private int dungTichXyLanh;
	private float triGiaXe;

	// CAC PHUONG THUC
	public ThongTinDangKyXe() {

	}

	public ThongTinDangKyXe(String chuXe, String loaiXe, int dungTichXyLanh, float triGiaXe) {
		setChuXe(chuXe);
		setLoaiXe(loaiXe);
		setDungTichXyLanh(dungTichXyLanh);
		setTriGiaXe(triGiaXe);
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getDungTichXyLanh() {
		return dungTichXyLanh;
	}

	/**
	 * Dung tich xy lanh (>=0)
	 * 
	 * @param dungTichXyLanh
	 */
	public void setDungTichXyLanh(int dungTichXyLanh) {
		if (this.dungTichXyLanh >= 0)
			this.dungTichXyLanh = dungTichXyLanh;
		else
			this.dungTichXyLanh = 0;
	}

	public float getTriGiaXe() {
		return triGiaXe;
	}

	/**
	 * Tri gia xe (>=0)
	 * 
	 * @param triGiaXe
	 */
	public void setTriGiaXe(float triGiaXe) {
		if (this.triGiaXe >= 0)
			this.triGiaXe = triGiaXe;
		else
			this.triGiaXe = 0;
	}

	/**
	 * Tinh thue
	 * 
	 * @return thue
	 */
	public float tinhThue() {
		if (this.dungTichXyLanh < 100)
			return (float) (0.01 * this.triGiaXe);
		else if (this.dungTichXyLanh >= 100 && this.dungTichXyLanh <= 200)
			return (float) (0.03 * this.triGiaXe);
		else
			return (float) 0.05 * this.triGiaXe;
	}

	public static String tieude() {
		return String.format("|%-20s|%-15s|%10s|%15s|%15s|", "Chu Xe", "Loai Xe", "Dung tich", "Tri Gia", "Thue");
	}

	public String toString() {
		return String.format("|%-20s|%-15s|%10d|%15.2f|%15.2f|", this.chuXe, this.loaiXe, this.dungTichXyLanh,
				this.triGiaXe, tinhThue());
	}

}
