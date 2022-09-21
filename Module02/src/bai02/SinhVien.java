package bai02;

/**
 * Cai Dat cho lop SinhVien
 * 
 * @author HongThuy
 *
 */
public class SinhVien {
	// Cac thuoc tinh
	private int maSV;
	private String hoTenSV;
	private double diemLT;
	private double diemTH;

	// Cac phuong thuc
	/**
	 * Constructor mac dinh cua lop sinh vien
	 */
	public SinhVien() {

	}

	/**
	 * Constructor day du tham so cua lop sinh vien
	 * 
	 * @param maSV    la ma so sinh vien
	 * @param hoTenSV la o ten sinh vien
	 * @param diemLT  la diem ly thuyet
	 * @param diemTH  la diem thuc hanh
	 */
	public SinhVien(int maSV, String hoTenSV, double diemLT, double diemTH) {
		setMaSV(maSV);
		setHoTenSV(hoTenSV);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMaSV() {
		return maSV;
	}

	/**
	 * Kiem tra masv > 0
	 * 
	 * @param maSV
	 */
	public void setMaSV(int maSV) {
		if (maSV < 0)
			this.maSV = 0;
		else
			this.maSV = maSV;
	}

	public String getHoTenSV() {
		return hoTenSV;
	}

	/**
	 * Kiem tra Hoten rong
	 * 
	 * @param hoTenSV
	 */
	public void setHoTenSV(String hoTenSV) {
		if (hoTenSV.equals(""))
			this.hoTenSV = "Khong biet ten";
		else
			this.hoTenSV = hoTenSV;
	}

	public double getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(double diemLT) {
		if (diemLT >= 0 && diemLT <= 10)
			this.diemLT = diemLT;
		else
			this.diemLT = 0;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(double diemTH) {
		if (diemTH >= 0 && diemTH <= 10)
			this.diemTH = diemTH;
		else
			this.diemTH = 0;
	}

	public double tinhDTB() {
		return (diemLT + diemTH) / 2;
	}

	public static String tieude() {
		return String.format("%-7s\t %-20s\t %-3s\t %-3s\t %-3s\t", "masv", "hoten", "diemlt", "diemth", "diemtb");
	}

	@Override
	public String toString() {
		return String.format("%-7d\t %-20s\t %-3.2f\t %-3.2f\t %-3.2f\t", this.maSV, this.hoTenSV, this.diemLT,
				this.diemTH, tinhDTB());
	}

}
