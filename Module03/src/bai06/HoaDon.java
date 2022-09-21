package bai06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDon {
	//Cac thuoc tinh
	private String maKH;
	private LocalDate ngayHoaDon;
	private String tenKH;
	private String maPhong;
	protected double donGia;
	//Cac thuoc tinh
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
	 * @return the ngayHoaDon
	 */
	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}
	/**
	 * @param ngayHoaDon the ngayHoaDon to set
	 */
	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}
	/**
	 * @return the tenKH
	 */
	public String getTenKH() {
		return tenKH;
	}
	/**
	 * @param tenKH the tenKH to set
	 */
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	/**
	 * @return the maPhong
	 */
	public String getMaPhong() {
		return maPhong;
	}
	/**
	 * @param maPhong the maPhong to set
	 */
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
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
	public HoaDon() {
		this("",LocalDate.now(),"","",0);
	}
	public HoaDon(String maKH, LocalDate ngayHoaDon, String tenKH, String maPhong, double donGia) {
		super();
		setMaKH(maKH);
		setNgayHoaDon(ngayHoaDon);
		setTenKH(tenKH);
		setMaPhong(maPhong);
		setDonGia(donGia);
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-12s %-12s %-10s %-10.2f",maKH,dtf.format(ngayHoaDon),tenKH,maPhong,donGia);
	}

	
	
}
