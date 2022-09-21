package ArraysListSach;

import java.time.LocalDate;

public class SachThamKhao extends Sach {
	// cac thuoc tinh
	private float thue;
	// cac phuong thuc

	/**
	 * @return the thue
	 */
	public float getThue() {
		return thue;
	}

	/**
	 * @param thue the thue to set
	 */
	public void setThue(float thue) {
		this.thue = thue;
	}

	public SachThamKhao() {
		this("", LocalDate.now(), 0, 0, "", 0);
	}

	public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, float thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
	}

	public static String tieude() {
		return String.format("%-10s %-12s %-10s %8s %-10s %-5s", "Ma_Sach", "Ngay_Nhap", "Don_Gia", "So_Luong", "NXB",
				"Thue");
	}

	@Override
	public String toString() {
		return String.format("%s %-5.2f", super.toString(), thue);
	}

	public double getThanhTien() {
		return super.getThanhTien() + thue;
	}
}
