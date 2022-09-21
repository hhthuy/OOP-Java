package bai04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDichNhaDat {
	//Cac thuoc tinh
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private double dienTich;
	private int soLuong;
	
	//Cac phuong thuc
	
	/**
	 * @return the maGiaoDich
	 */
	public String getMaGiaoDich() {
		return maGiaoDich;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	/**
	 * @param maGiaoDich the maGiaoDich to set
	 */
	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	/**
	 * @return the ngayGiaoDich
	 */
	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	/**
	 * @param ngayGiaoDich the ngayGiaoDich to set
	 */
	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
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
	/**
	 * @return the dienTich
	 */
	public double getDienTich() {
		return dienTich;
	}
	/**
	 * @param dienTich the dienTich to set
	 */
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public GiaoDichNhaDat() {
		this("",LocalDate.now(),0,0,0);
	}
	public GiaoDichNhaDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, int soLuong) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setDienTich(dienTich);
		setSoLuong(soLuong);
	}
	public static String tieude() {
		return String.format("%-10s %-12s %-10s %-10s %-10s %-10s ", "Ma_GD", "Ngay_GD", "Don_Gia", "Dien_tich","So_Luong", "Loai_Dat/Nha");
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-12s %-10.2f %-10.2f %-10d", maGiaoDich,dtf.format(ngayGiaoDich),donGia,dienTich,soLuong);
	}
	public double getThanhTien() {
		return dienTich*donGia;
	}
}
