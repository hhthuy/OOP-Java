package bai01;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
	//Cac thuoc tinh
	private String noiDen;
	private int soNgay;
	//Cac phuong thuc
	/**
	 * @return the noiDen
	 */
	public String getNoiDen() {
		return noiDen;
	}
	/**
	 * @param noiDen the noiDen to set
	 */
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	/**
	 * @return the soNgay
	 */
	public int getSoNgay() {
		return soNgay;
	}
	/**
	 * @param soNgay the soNgay to set
	 */
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	public ChuyenXeNgoaiThanh() {
		this("","","",0,"",0);
	}
	public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgay) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		setNoiDen(noiDen);
		setSoNgay(soNgay);
	}
	public static String tieude() {
		return String.format("%-10s %-20s %-10s %10s %10s %8s", "Ma_Chuyen", "HoTen_TaiXe", "So_Xe", "Doanh_Thu", "Noi_Den","So_Ngay");
	}
	@Override
	public String toString() {
		return super.toString() + String.format("%10s %8d", getNoiDen(), getSoNgay());
		//return "ChuyenXeNgoaiThanh [Noi_Den=" + noiDen + ", So_Ngay=" + soNgay +", Thong_Tin_Khac="+ super.toString()+"]";
	}
	
	
	
}
