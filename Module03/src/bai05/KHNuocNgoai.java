package bai05;

import java.time.LocalDate;

public class KHNuocNgoai extends KhachHang {
	// Cac thuoc tinh
	private String quocTich;
	// Cac phuong thuc

	/**
	 * @return the quocTich
	 */
	public String getQuocTich() {
		return quocTich;
	}

	/**
	 * @param quocTich the quocTich to set
	 */
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public KHNuocNgoai(String maKH, String hoTen, LocalDate ngayLapHoaDon, float soKW, double donGia, String quocTich) {
		super(maKH, hoTen, ngayLapHoaDon, soKW, donGia);
		setQuocTich(quocTich);
	}
	public static String tieude() {
		return String.format("%-10s %-12s %-12s %-10s %-10s", "Ma_GD", "Ho_ten", "NgayLHD", "So_KW", "Quoc_Tich");
	}
	@Override
	public String toString() {
		return String.format("%s %-10s", super.toString(), quocTich);

	}
	public double getThanhTien() {
		return super.getThanhTien();

	}

}
