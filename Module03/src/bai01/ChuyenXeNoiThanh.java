package bai01;

public class ChuyenXeNoiThanh extends ChuyenXe{
	//Cac thuoc tinh
	private String soTuyen;
	private int soKm;
	//Cac phuong thuc
	/**
	 * @return the soTuyen
	 */
	public String getSoTuyen() {
		return soTuyen;
	}
	/**
	 * @param soTuyen the soTuyen to set
	 */
	public void setSoTuyen(String soTuyen) {
		this.soTuyen = soTuyen;
	}
	/**
	 * @return the soKm
	 */
	public int getSoKm() {
		return soKm;
	}
	/**
	 * @param soKm the soKm to set
	 */
	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
	
	public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String soTuyen,
			int soKm) {
		super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
		setSoTuyen(soTuyen);
		setSoKm(soKm);
	}
	public ChuyenXeNoiThanh() {
		this("","","",0,"",0);
	}
	public static String tieude() {
		return String.format("%-10s %-20s %-10s %10s %10s %8s", "Ma_Chuyen", "HoTen_TaiXe", "So_Xe", "Doanh_Thu", "So_Tuyen","So_Km");
	}
	@Override
	public String toString() {
		return super.toString() + String.format("%10s %8d", getSoTuyen(), getSoKm());
		//return "ChuyenXeNoiThanh [So_Tuyen=" + soTuyen + ", So_Km=" + soKm + ", Thong_tin_khac" + super.toString() + "]";
	}

	
	
	
	
}
