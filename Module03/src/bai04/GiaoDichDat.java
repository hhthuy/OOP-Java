package bai04;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDichNhaDat{
	//Thuoc tinh
	private boolean loaiDat;
	//Phuong thuc

	/**
	 * @return the loaiDat
	 */
	public boolean isLoaiDat() {
		return loaiDat;
	}

	/**
	 * @param loaiDat the loaiDat to set
	 */
	public void setLoaiDat(boolean loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich,int soLuong, boolean loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich,soLuong);
		setLoaiDat(loaiDat);
	}
	public static String tieude() {
		return String.format("%-10s %-12s %-10s %-10s %-10s %-10s ", "Ma_GD", "Ngay_GD", "Don_Gia", "Dien_tich","So_Luong", "Loai_Dat");
	}
	@Override
	public String toString() {
		String Dat = (loaiDat == true) ? "A" : "B & C";
			return String.format("%s %-10s", super.toString(), Dat);
	}
	public double getThanhTien() {
		if(loaiDat)
			return super.getThanhTien() * 1.5;
		else
			return super.getThanhTien();
	}
}
