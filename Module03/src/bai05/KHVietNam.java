package bai05;

import java.time.LocalDate;

public class KHVietNam extends KhachHang {
	//Cac thuoc tinh
	private String khachHang;
	private float dinhMuc;
	//Cac phuong thuc
	
	/**
	 * @return the dinhMuc
	 */
	public float getDinhMuc() {
		return dinhMuc;
	}
	/**
	 * @param dinhMuc the dinhMuc to set
	 */
	public void setDinhMuc(float dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	/**
	 * @return the khachHang
	 */
	public String getKhachHang() {
		return khachHang;
	}
	/**
	 * @param khachHang the khachHang to set
	 */
	public void setKhachHang(String khachHang) {
		this.khachHang = khachHang;
	}
	
	public KHVietNam(String maKH, String hoTen, LocalDate ngayLapHoaDon, float soKW, double donGia, String khachHang,
			float dinhMuc) {
		super(maKH, hoTen, ngayLapHoaDon, soKW, donGia);
		setKhachHang(khachHang);
		setDinhMuc(dinhMuc);
	}
	public static String tieude() {
		return String.format("%-10s %-12s %-12s %-10s %-10s", "Ma_GD", "Ho_ten", "NgayLHD", "So_KW", "DT_KH");
	}
	@Override
	public String toString() {
			return String.format("%s %-10s", super.toString(), khachHang);
		
	}
	public double getThanhTien() {
		if(soKW <= dinhMuc)
			return super.getThanhTien();
		else
			return super.getThanhTien() * dinhMuc + (soKW -dinhMuc) * donGia;
	}
	
}
