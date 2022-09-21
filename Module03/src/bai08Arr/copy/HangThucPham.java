package bai08Arr.copy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham extends HangHoa{
	//Cac thuco tinh
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	//Cac phuong thuc
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		if (!nhaCungCap.trim().equals(""))
			this.nhaCungCap = nhaCungCap;
		else 
			this.nhaCungCap = "chuaxacdinh";
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat){
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(this.ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = ngaySanXuat;
	}
	
	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	public HangThucPham() throws Exception {
		super();
		setNhaCungCap(nhaCungCap);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	
	public static String getTieuDeThucPham() {
		return String.format("%-10s %-15s %-15s %-15s %-15s %-15s %-20s","Ma_hang","Ten_Hang","Don_Gia","So_Luong_Ton","Nha_cungcap","NgaySX");
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-15s %-15s %-20s %-5.2f %-20s", super.toString(),nhaCungCap,dtf.format(ngaySanXuat),getDanhGiaMucDoBanBuon(),getVAT(),dtf.format(ngayHetHan));
	}
	@Override
	public double getVAT() {
		// TODO Auto-generated method stub
		return 0.05;
	}
	@Override
	public String getDanhGiaMucDoBanBuon() {
		if(getSoLuongTon()> 0 && getNgayHetHan().isAfter(LocalDate.now()))
			return "kho ban";
		return "khong danh gia";
		//return super.getDanhGiaMucDoBanBuon();
	}
	
	
	
	
	
	

	
}
