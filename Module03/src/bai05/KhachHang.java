package bai05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang {
	// Cac thuoc tinh
	private String maKH;
	private String hoTen;
	private LocalDate ngayLapHoaDon;
	protected float soKW;
	protected double donGia;

	// Cac phuong thuc
	/**
	 * @return the maKH
	 */
	public String getMaKH() {
		return maKH;
	}

	/**
	 * @param maKH the maKH to set
	 */
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the ngayLapHoaDon
	 */
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}

	/**
	 * @param ngayLapHoaDon the ngayLapHoaDon to set
	 */
	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}

	/**
	 * @return the soKW
	 */
	public float getSoKW() {
		return soKW;
	}

	/**
	 * @param soKW the soKW to set
	 */
	public void setSoKW(float soKW) {
		this.soKW = soKW;
	}

	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public KhachHang() {
		this("", "", LocalDate.now(), 0, 0);
	}
/**
	public HoaDonTienDien(String maKH, String hoTen, LocalDate ngayLapHoaDon, float soKW, double donGia,) {
		setMaKH(maKH);
		setHoTen(hoTen);
		setNgayLapHoaDon(ngayLapHoaDon);
		setSoKW(soKW);
		setDonGia(donGia);
	}
	**/
	public KhachHang(String maKH, String hoTen, LocalDate ngayLapHoaDon, float soKW, double donGia) {
		super();
		setMaKH(maKH);
		setHoTen(hoTen);
		setNgayLapHoaDon(ngayLapHoaDon);
		setSoKW(soKW);
		setDonGia(donGia);
	}
	public static String tieude() {
		return String.format("%-10s %-12s %-12s %-10s %-10s", "Ma_GD", "Ho_ten", "NgayLHD", "So_KW", "DoiTuongKH/QuocTich");
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-12s %-12f %-10.2f",maKH,dtf.format(ngayLapHoaDon),soKW,donGia);
	}
	public double getThanhTien() {
		return soKW*donGia;
	}


}
