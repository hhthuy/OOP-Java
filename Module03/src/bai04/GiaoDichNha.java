package bai04;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDichNhaDat {
	// Thuoc tinh
	private boolean loaiNha;
	// Cac phuong thuc

	/**
	 * @return the loaiNha
	 */
	public boolean isLoaiNha() {
		return loaiNha;
	}

	/**
	 * @param loaiNha the loaiNha to set
	 */
	public void setLoaiNha(boolean loaiNha) {
		this.loaiNha = loaiNha;
	}

	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich,int soLuong, boolean loaiNha) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich,soLuong);
		setLoaiNha(loaiNha);
	}
	public static String tieude() {
		return String.format("%-10s %-12s %-10s %-10s %-10s %-10s", "Ma_GD", "Ngay_GD", "Don_Gia", "Dien_tich","So_Luong", "Loai_Nha");
	}
	@Override
	public String toString() {
		String Nha = (loaiNha == true) ? "cao cap" : "thuong";
		return String.format("%s %-10s", super.toString(), Nha);
	}

	public double getThanhTien() {
		if (loaiNha)
			return super.getThanhTien();
		else
			return super.getThanhTien() * 0.9;
	}

}
