package baiTongHopHH;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa{
	//Cac thuoc tinh
	private String nhaCungCap;
	private LocalDate ngaySX;
	private LocalDate ngayHH;
	//Cac phuong thuc
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		if(!nhaCungCap.trim().equals(""))
			this.nhaCungCap = nhaCungCap;
		else
			this.nhaCungCap="chua xac dinh";
	}
	public LocalDate getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(LocalDate ngaySX) {
		if(ngaySX.isBefore(LocalDate.now()))
			this.ngaySX = ngaySX;
		else
			this.ngaySX=LocalDate.now();
	}
	public LocalDate getNgayHH() {
		return ngayHH;
	}
	public void setNgayHH(LocalDate ngayHH) {
		if(ngayHH.isAfter(ngaySX))
			this.ngayHH = ngayHH;
		else
			this.ngayHH= ngaySX;
	}
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySX, LocalDate ngayHH) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySX(ngaySX);
		setNgayHH(ngayHH);
	}
	public HangThucPham() {
		super();
	}
	@Override
	public String getDanhGiaMucDoBanBuon() {
		// TODO Auto-generated method stub
		if(getSoLuongTon() > 0 && getNgayHH().isAfter(LocalDate.now()))
			return "Kho ban";
		return "Khong ban duoc";
	}
	@Override
	public double getVAT() {
		// TODO Auto-generated method stub
		return 0.05;
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "HangThucPham [nhaCungCap=" + nhaCungCap + ", ngaySX=" + dtf.format(ngaySX) + ", ngayHH=" + dtf.format(ngayHH) + ", Thong tin khac ="+ super.toString()+"]";
	}
	
	
	
	

	
	
	
}
