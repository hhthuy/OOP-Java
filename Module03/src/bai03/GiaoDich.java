package bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GiaoDich {
	// Cac thuoc tinh
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private int soLuong;

	// Cac phuong thuc
	/**
	 * @return the maGiaoDich
	 */
	public String getMaGiaoDich() {
		return maGiaoDich;
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

	public GiaoDich() {
	}

	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setSoLuong(soLuong);
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-12s %-15.3f %8d ", maGiaoDich, dtf.format(ngayGiaoDich), donGia, soLuong);
	}

	public double getThanhTien() {
		return soLuong * donGia;
	}

}
