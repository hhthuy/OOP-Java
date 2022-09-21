package baiTongHopHH;

import java.text.DecimalFormat;


public abstract class HangHoa {
	//Cac thuoc tinh
	private String maHang;
	private String tenHang;
	private double donGia;
	private int soLuongTon;
	//Cac phhuong thuc
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) {
		if(!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			this.maHang = "chua xac dinh";
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		if(!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang="xxx";
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		if(donGia >= 0)
			this.donGia = donGia;
		else 
			this.donGia = 0;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		if(soLuongTon >= 0)
			this.soLuongTon = soLuongTon;
		else
			this.soLuongTon=0;
	}
	public HangHoa(String maHang, String tenHang, double donGia, int soLuongTon) {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setSoLuongTon(soLuongTon);
	}
	public HangHoa() {
		this("","",0,0);
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00VND");
		return "HangHoa [maHang=" + maHang + ", tenHang=" + tenHang + ", donGia=" + df.format(donGia) + ", soLuongTon="
				+ soLuongTon +", Danh Gia="+getDanhGiaMucDoBanBuon()+ ", VAT="+getVAT()+  "]";
	}
	public abstract String getDanhGiaMucDoBanBuon();
	public abstract double getVAT();
	
	
	
	
}
