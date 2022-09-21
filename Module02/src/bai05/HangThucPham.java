package bai05;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Bieu dien lop Hang Thuc Pham Gom cac thuoc tinh: Chu xe,Loai xe,Gia tri,Dung
 * tich xy lanh.
 * 
 * @author HP
 *
 */
public class HangThucPham {
	// Cac thuoc tinh
	private String maHang;
	private String tenHang;
	private float donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String sdonGia;

	// Cac phuong thuc
	public String getMaHang() {
		return maHang;
	}

	/**
	 * Ngoai tru ham set ma hang
	 * 
	 * @param maHang
	 */
	private void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("LOI: Ma Hang loi");
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) throws Exception {
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			throw new Exception("LOI: Ten Hang loi");
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) throws Exception {
		if (donGia >= 0)
			this.donGia = donGia;
		else
			throw new Exception("LOI: Don Gia loi");
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	/**
	 * Ngay San Xuat phai truoc Ngay Hien Tai
	 * 
	 * @param ngaySanXuat
	 * @throws Exception
	 */
	public void setNgaySanXuat(LocalDate ngaySanXuat) throws Exception {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			throw new Exception("LOI: Ngay San Xuat phai truoc Ngay Hien Tai!");
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	/**
	 * Ngay Het Han phai sau Ngay San Xuat
	 * 
	 * @param ngayHetHan
	 * @throws Exception
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) throws Exception {
		if (ngayHetHan.isAfter(this.ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			throw new Exception("LOI:Ngay Het Han phai sau Ngay San Xuat!");
	}

	public HangThucPham(String maHang, String tenHang, float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan)
			throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public HangThucPham(String maHang) throws Exception {
		setMaHang(maHang);
		setTenHang("xxx");// this.tenHang = "xxx";
		setDonGia(0);
		setNgaySanXuat(LocalDate.now());// this.ngaySanXuat=LocalDate.now();
		setNgayHetHan(this.ngaySanXuat);// this.ngayHetHan=this.ngaySanXuat;
	}

	/**
	 * 
	 * @return tra ve true neu het han
	 */
	public boolean kiemTraHetHan() {
		return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
	}

	private String ghiChu() {
		if (this.kiemTraHetHan())
			return "Hang HET HAN";
		else
			return " ";
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00VND");
		String sngaySanXuat = dtf.format(ngaySanXuat);
		String sngayHetHan = dtf.format(ngayHetHan);
		setSdonGia(df.format(donGia));
		return String.format("| %-8s| %-10s| %-12s| %-10s| %-10s| %-15s|", this.maHang, this.tenHang, this.donGia,
				sngaySanXuat, sngayHetHan, ghiChu());
	}

	public String getSdonGia() {
		return sdonGia;
	}

	public void setSdonGia(String sdonGia) {
		this.sdonGia = sdonGia;
	}
}
