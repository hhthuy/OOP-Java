package bai02;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
	//cac thuoc tinh
	private boolean tinhTrang;
	//cac phuong thuc

	/**
	 * @return the tinhTrang
	 */
	public boolean isTinhTrang() {
		return tinhTrang;
	}

	/**
	 * @param tinhTrang the tinhTrang to set
	 */
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);//goi ham khoi tao lop cha
		setTinhTrang(tinhTrang);
	}

	public SachGiaoKhoa() {
		this("",LocalDate.now(),0,0,"",true);
	}
	
	public static String tieude() {
		return String.format("%-10s %-12s %-10s %8s %-10s %-10s", "Ma_Sach","Ngay_Nhap","Don_Gia","So_Luong","NXB","Tinh_Trang");
	}                       
	@Override
	public String toString() {
		String tt = (tinhTrang == true) ? "cu": "moi";
		return String.format("%s %-10s",super.toString(), tt);
	}
	public double getThanhTien() {
		if(tinhTrang)
			return super.getThanhTien();
		else
			return 0.5 * super.getThanhTien();
	}
	
	

	
	

	
}
