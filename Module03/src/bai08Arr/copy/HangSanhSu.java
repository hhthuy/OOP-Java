package bai08Arr.copy;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa{
	//Cac thuoc tinh
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	//Cac phuong thuc
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if(ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		else
			this.ngayNhapKho = LocalDate.now();
	}
	public HangSanhSu(String nhaSanXuat, LocalDate ngayNhapKho) throws Exception {
		super();
		setNhaSanXuat("");
		setNgayNhapKho(LocalDate.now());
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSanXuat(nhaSanXuat);
		setNgayNhapKho(ngayNhapKho);
	}
	@Override
	public String getDanhGiaMucDoBanBuon() {
		Period cmp = Period.between(ngayNhapKho, LocalDate.now());
		int day = cmp.getDays();
		int month = cmp.getMonths();
		int year = cmp.getYears();
		if(year > 0)
			day += year*365;
		if(month > 0)
			day += month*30;
		if(getSoLuongTon() > 50 && day > 10)
			return "ban cham";
		return "khong danh gia";
	}
	@Override
	public double getVAT() {
		return 0.1;
	}
	
	public static String getTieuDeSanhSu() {
		return String.format("%-10s %-15s %-15s %-15s %-15s %-15s %-20s %-5s ","Ma_hang","Ten_Hang","Don_Gia","So_Luong_Ton","NhaSX","Ngay_NhapKho","Muc do ban buon","VAT");
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return String.format("%-10s %-15s %-15s %-20s %-5.2f", super.toString(),nhaSanXuat,dtf.format(ngayNhapKho),getDanhGiaMucDoBanBuon(),getVAT());
	}	
}
