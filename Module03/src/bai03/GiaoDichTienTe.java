package bai03;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	// Cac phuong thuc
	private double tiGia;
	private boolean loaiTien;

	// Cac thuoc tinh
	/**
	 * @return the tiGia
	 */
	public double getTiGia() {
		return tiGia;
	}

	/**
	 * @param tiGia the tiGia to set
	 */
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}

	/**
	 * @return the loaiTien
	 */
	public boolean isLoaiTien() {
		return loaiTien;
	}

	/**
	 * @param loaiTien the loaiTien to set
	 */
	public void setLoaiTien(boolean loaiTien) {
		this.loaiTien = loaiTien;
	}

	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia,
			boolean loaiTien) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		setTiGia(tiGia);
		setLoaiTien(loaiTien);
	}

	public static String tieude() {
		return String.format("%-10s %-12s %-15s %-10s %-10s", "Ma_GD", "Ngay_GD", "Don_Gia", "So_Luong", "Tien");
	}

	@Override
	public String toString() {
		String Tien = (loaiTien == true) ? "tien VN" : "tien USD or tien Euro";
		return String.format("%s %-10s", super.toString(), Tien);
	}

	public double getThanhien() {
		if (loaiTien)
			return super.getThanhTien() * tiGia;
		else
			return super.getThanhTien();
	}

}
