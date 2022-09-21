package bai09;

import java.time.LocalDate;

public class KhachHang {
	// Cac thuoc tinh
	private String maKH;
	private String hoTenKH;
	private SoTietKiem[] dsSoTietKiem;
	private int soLuongSo;// count
	// Cac phuong thuc

	/**
	 * @return the hoTenKH
	 */
	public String getHoTenKH() {
		return hoTenKH;
	}

	/**
	 * @param hoTenKH the hoTenKH to set
	 */
	public void setHoTenKH(String hoTenKH) {
		if (!hoTenKH.trim().equals(""))
			this.hoTenKH = hoTenKH;
		else 
			this.hoTenKH = "chua biet ten";
	}

	/**
	 * @return the maKH
	 */
	public String getMaKH() {
		return maKH;
	}

	/**
	 * @return the dsSoTietKiem
	 */
	public SoTietKiem[] getDsSoTietKiem() {
		return dsSoTietKiem;
	}

	/**
	 * @return the soLuongSo
	 */
	public int getSoLuongSo() {
		return soLuongSo;
	}

	/**
	 * @param maKH
	 * @param hoTenKH
	 * @param dsSoTietKiem
	 * @param soLuongSo
	 */
	public KhachHang(String maKH, String hoTenKH, int n) {
		this.maKH = maKH;
		setHoTenKH(hoTenKH);
		this.dsSoTietKiem = new SoTietKiem[n];
		this.soLuongSo = 0;
	}

	public boolean themSoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGui, int kyHan, float laiSuat) {
		if (soLuongSo < dsSoTietKiem.length) {
			dsSoTietKiem[soLuongSo] = new SoTietKiem(maSo, ngayMoSo, soTienGui, kyHan, laiSuat);
			soLuongSo++;
			return true;
		}
		return false;
	}
	public String toString() {
		String s="";
		s += "Khach hang: " + this.maKH + "-" + this.hoTenKH +"\n";
		for(int i = 0; i < dsSoTietKiem.length; i++) {
			s += dsSoTietKiem[i].toString();
		}return s;
	}
}
