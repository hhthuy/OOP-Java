package bai06;

/**
 * Cai dat lop TAI KHOAN 
 * Voi cac thuoc tinh: So TK, Ten TK, So du
 * @author HongThuy
 *
 */
public class TaiKhoan {
	// Cca thuoc tinh
	private long soTK;
	private String tenTK;
	private double soDu;
	final double RATE = 0.035;

	// Cac phuong thuc
	public TaiKhoan() {
		this(999999, "Chua xac dinh", 50000);
	}
	/**
	 * Constuctor day du cac tham so
	 * Du lieu gan hop le khi So ti khoan > 0; Ten tai khoan khac rong; So du >= 50000
	 * @param soTK la so tai khoan
	 * @param tenTK la ten tai khoan
	 * @param soDu la so du
	 */
	public TaiKhoan(long soTK, String tenTK, double soDu) {
		if (soTK > 0) {
			this.soTK = soTK;
		} else {
			this.soTK = 999999;
		}
		if (!tenTK.trim().equals("")) {
			this.tenTK = tenTK;
		} else {
			this.tenTK = "chua xac dinh";
		}
		if (soDu >= 5000) {
			this.soDu = soDu;
		} else {
			this.soDu = 50000;
		}
	}

	public TaiKhoan(long soTK, String tenTK) {

		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soDu = 0;
	}

	public long getSoTK() {
		return soTK;
	}

	public double getSoDu() {
		return soDu;
	}

	/**
	 * Goi them so tien vao tai khoan
	 * 
	 * @param soTien
	 * @param tienLai
	 * @return true neu goi thanh cong
	 */
	public boolean goiTien(double soTien) {
		if (soTien > 0) {
			soDu += soTien;
			return true;
		}
		return false;
	}

	/**
	 * Rut so tien tu tai khoan
	 * 
	 * @param soTien
	 * @param phi
	 * @return true neu rut tien thanh cong
	 */
	public boolean rutTien(double soTien, double phi) {
		if ((soTien > 0) && ((soTien + phi) <= soDu)) {
			soDu -= soTien;
			return true;
		}
		return false;
	}

	/**
	 * Tinh tien lai
	 */
	public void tinhTienLai() {
		soDu = soDu + soDu * RATE;
	}

	/**
	 * Chuyen tien
	 * 
	 * @param den
	 * @param soTien
	 * @return true neu chuyen thanh cong
	 */
	public boolean chuyenKhoan(TaiKhoan to, double soTien) {
		if (soTien <= 0 || soTien > this.getSoDu())
			return false;
		boolean a = this.goiTien(soTien);
		boolean b = to.goiTien(soTien);
		return a && b;
	}

	/**
	 * Tra doi tuong ve dang chuoi
	 */
	public String toString() {
		return "STK:" + soTK + "\nTen TK:" + tenTK + "\nSo Du:" + soDu + "\n";
	}
}
