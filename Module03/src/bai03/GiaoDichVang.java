package bai03;

import java.time.LocalDate;

public class GiaoDichVang extends GiaoDich {
	private String loaiVang;

	/**
	 * @return the loaiVang
	 */
	public String isLoaiVang() {
		return loaiVang;
	}

	/**
	 * @param loaiVang the loaiVang to set
	 */
	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	public GiaoDichVang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setLoaiVang(loaiVang);
	}
	public static String tieude() {
		return String.format("%-10s %-12s %-15s %-10s %-10s", "Ma_GD","Ngay_GD","Don_Gia","So_Luong","Vang");
	}
	@Override
	public String toString() {
			return String.format("%s %-10s", super.toString(), loaiVang);
	}
	public double getThanhTien() {
			return super.getThanhTien();
	}
	
	
	
	
}
