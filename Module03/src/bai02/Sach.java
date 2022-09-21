package bai02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach {
	//Cac thuoc tinh
	private String maSach;
	private LocalDate ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;
	//Cac phuong thuc
	/**
	 * @return the maSach
	 */
	public String getMaSach() {
		return maSach;
	}
	/**
	 * @param maSach the maSach to set
	 */
	public void setMaSach(String maSach) {
		if(!maSach.equals(""))
			this.maSach = maSach;
		else
			this.maSach="Chua biet ma";
	}
	/**
	 * @return the ngayNhap
	 */
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	/**
	 * @param ngayNhap the ngayNhap to set
	 */
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
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
		if(donGia > 0)
			this.donGia = donGia;
		else
			this.donGia=0;
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
		if(soLuong > 0)
			this.soLuong = soLuong;
		else
			this.soLuong=0;
	}
	/**
	 * @return the nhaXuatBan
	 */
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	/**
	 * @param nhaXuatBan the nhaXuatBan to set
	 */
	public void setNhaXuatBan(String nhaXuatBan) {
		if(!nhaXuatBan.equals(""))
			this.nhaXuatBan = nhaXuatBan;
		else
			this.nhaXuatBan ="Chua biet NXB";
			
	}
	public Sach() {
		this("",LocalDate.now(), 0,0,"");
	}
	public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		super();
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-12s %-10.2f %8s %-10s ", maSach,dtf.format(ngayNhap),donGia,soLuong,nhaXuatBan);
	}
	public double getThanhTien() {
		return soLuong*donGia;
	}
	
	
	
}
