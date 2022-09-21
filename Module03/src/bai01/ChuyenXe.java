package bai01;

/**
 * Quan ly thong tin chuyen xe
 * @author Hong Thuy
 *
 */
public class ChuyenXe {
	// Cac thuoc tinh
	private String maSoChuyen;
	private String hoTenTaiXe;
	private String soXe;
	private double doanhThu;

	// Cac phuong thuc
	/**
	 * @return the masoChuyen
	 */
	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	/**
	 * @param masoChuyen the masoChuyen to set
	 */
	public void setMaSoChuyen(String maSoChuyen) {
		if (!maSoChuyen.equals(""))
			this.maSoChuyen = maSoChuyen;
		else
			this.maSoChuyen = "Chua biet ma";

	}

	/**
	 * @return the hoTenTaiXe
	 */
	public String getHoTenTaiXe() {
		return hoTenTaiXe;
	}

	/**
	 * @param hoTenTaiXe the hoTenTaiXe to set
	 */
	public void setHoTenTaiXe(String hoTenTaiXe) {
		if (!hoTenTaiXe.equals(""))
			this.hoTenTaiXe = hoTenTaiXe;
		else
			this.hoTenTaiXe = "Chua biet ten";
	}

	/**
	 * @return the soXe
	 */
	public String getSoXe() {
		return soXe;
	}

	/**
	 * @param soXe the soXe to set
	 */
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	/**
	 * @return the doanhThu
	 */
	public double getDoanhThu() {
		return doanhThu;
	}

	/**
	 * @param doanhThu the doanhThu to set
	 */
	public void setDoanhThu(double doanhThu) {
		if (doanhThu > 0)
			this.doanhThu = doanhThu;
		else
			this.doanhThu = 0;
	}

	/**
	 * Fault Constructor
	 */
	public ChuyenXe() {
		this("", "", "", 0);
	}

	/**
	 * Constructor day du tham so
	 * 
	 * @param masoChuyen
	 * @param hoTenTaiXe
	 * @param soXe
	 * @param doanhThu
	 */
	public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
		super();// Goi ham khoi tao khong tham so cua lop Object
		setMaSoChuyen(maSoChuyen);
		setHoTenTaiXe(hoTenTaiXe);
		setSoXe(soXe);
		setDoanhThu(doanhThu);
	}

	/**
	 * Ham tieu de cua lop Chuyen Xe
	 */
	public static String tieude() {
		return String.format("%-10s %-20s %-10s %10s", "Ma_Chuyen", "HoTen_TaiXe", "So_Xe", "Doanh_Thu");
	}

	@Override
	public String toString() {
		return String.format("%-10s %-20s %-10s %10.2f", getMaSoChuyen(), getHoTenTaiXe(), getSoXe(), getDoanhThu());
		// return "ChuyenXe [maSoChuyen=" + maSoChuyen + ", hoTenTaiXe=" + hoTenTaiXe +
		// ", soXe=" + soXe + ", doanhThu="
		// + doanhThu + "]";
	}

}
