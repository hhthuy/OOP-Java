package bai08Arr.copy;

public class HangDienMay extends HangHoa{
	//Cac thuoc tinh
	private int thoigianBH;
	private double congSuat;
	//Cac phuong thuc
	public int getThoigianBH() {
		return thoigianBH;
	}
	public void setThoigianBH(int thoigianBH) {
		if(thoigianBH >0)
			this.thoigianBH = thoigianBH;
		else
			this.thoigianBH = 0;
	}
	public double getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(double congSuat) {
		if(congSuat > 0)
			this.congSuat = congSuat;
		else
			this.congSuat = 0;
	}
	public HangDienMay() throws Exception {
		super();
		setThoigianBH(0);	
		setCongSuat(0);
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoigianBH, double congSuat)
			throws Exception {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoigianBH(thoigianBH);
		setCongSuat(congSuat);
	}
	@Override
	public String getDanhGiaMucDoBanBuon() {
		if(getSoLuongTon() < 3) {
			return "ban duoc";
		}return "khong danh gia";
	}
	
	public static String getTieuDeDienMay() {
		return String.format("%-10s %-15s %-15s %-15s %-15s %-5s","Ma_hang","Ten_Hang","Don_Gia","So_Luong_Ton","Thoi_gian","Cong Suat");
	}
	
	@Override
	public String toString() {
		String s= "";
		s+= thoigianBH + " thang";
		return String.format("%-10s %-15s %-15s %-20s %-5.2f", super.toString(), s,congSuat,getDanhGiaMucDoBanBuon(),getVAT());
	}
	@Override
	public double getVAT() {
		// TODO Auto-generated method stub
		return 0.1;
	}
	
	
	
	
	
	
	
}
