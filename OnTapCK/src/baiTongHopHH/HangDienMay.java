package baiTongHopHH;

public class HangDienMay extends HangHoa{
	//Cac thuoc tinh
	private int thoiGianBH;
	private float congSuat;
	//Cac phuong thuc
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH) {
		if(thoiGianBH >=0 )
			this.thoiGianBH = thoiGianBH;
		else
			this.thoiGianBH=0;
	}
	public float getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(float congSuat) {
		if(congSuat >= 0)
			this.congSuat = congSuat;
		else
			this.congSuat=0;
	}
	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBH, float congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		setThoiGianBH(thoiGianBH);
		setCongSuat(congSuat);
	}
	public HangDienMay() {
		this("","",0,0,0,0);
	}
	@Override
	public String toString() {
		return "HangDienMay [thoiGianBH=" + thoiGianBH + ", congSuat=" + congSuat + ", Thong Tin khac="+ super.toString()+"]";
	}
	@Override
	public String getDanhGiaMucDoBanBuon() {
		// TODO Auto-generated method stub
		if(getSoLuongTon() < 3)
			return "Ban duoc";
		return "Khong ban duoc";
	}
	@Override
	public double getVAT() {
		// TODO Auto-generated method stub
		return 0.1;
	}	
}
