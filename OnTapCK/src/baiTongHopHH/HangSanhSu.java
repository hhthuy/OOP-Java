package baiTongHopHH;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HangSanhSu extends HangHoa{
	//Cac thuoc tinh
	private String nhaSX;
	private LocalDate ngayNK;
	//Cac phuong thuc
	public String getNhaSX() {
		return nhaSX;
	}
	public void setNhaSX(String nhaSX) {
		if(!nhaSX.trim().equals(""))
			this.nhaSX = nhaSX;
		else
			this.nhaSX="chua xac dinh";
	}
	public LocalDate getNgayNK() {
		return ngayNK;
	}
	public void setNgayNK(LocalDate ngayNK) {
		if(ngayNK.isAfter(LocalDate.now()))
			this.ngayNK = ngayNK;
		else
			this.ngayNK=LocalDate.now();
	}
	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSX, LocalDate ngayNK) {
		super(maHang, tenHang, donGia, soLuongTon);
		setNhaSX(nhaSX);
		setNgayNK(ngayNK);
	}
	public HangSanhSu() {
		this("","",0,0,"",LocalDate.now());
	}
	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "HangSanhSu [nhaSX=" + nhaSX + ", ngayNK=" + dtf.format(ngayNK) + ", Thong tin khac="+ super.toString()+"]";
	}
	@Override
	public String getDanhGiaMucDoBanBuon() {
		// TODO Auto-generated method stub
		Period cmp = Period.between(ngayNK, LocalDate.now());
		int day = cmp.getDays();
		int month = cmp.getMonths();
		int year = cmp.getYears();
		if(year > 0)
			day += year * 365;
		if(month > 0)
			day += month *30;
		if(getSoLuongTon() > 50 && day > 10)
			return "ban cham";
		return "khong danh gia";
	}
	@Override
	public double getVAT() {
		// TODO Auto-generated method stub
		return 0.1;
	}
	
	 
	
}
