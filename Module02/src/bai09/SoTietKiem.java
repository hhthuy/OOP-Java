package bai09;

import java.time.LocalDate;
import java.time.Period;

/**
 * Bieu dien lop SO TIET KIEM
 * 
 * @author Hong Thuy
 *
 */
public class SoTietKiem {
	// Cac thuoc tinh
	private String maSo;
	private LocalDate ngayMoSo;
	private double soTienGoi;
	private int kyHan;
	private float laiSuat;

	// Cac phuong thuc
	/**
	 * @return the maSo
	 */
	public String getMaSo() {
		return maSo;
	}

	/**
	 * @param maSo the maSo to set
	 */
	public void setMaSo(String maSo) {
		if (!maSo.trim().equals(""))
			this.maSo = maSo;
		else
			this.maSo = "Chua biet ma so";
	}

	/**
	 * @return the ngayMoSo
	 */
	public LocalDate getNgayMoSo() {
		return ngayMoSo;
	}

	/**
	 * @param ngayMoSo the ngayMoSo to set
	 */
	public void setNgayMoSo(LocalDate ngayMoSo) {
		this.ngayMoSo = ngayMoSo;
	}

	/**
	 * @return the soTienGoi
	 */
	public double getSoTienGoi() {
		return soTienGoi;
	}

	/**
	 * @param soTienGoi the soTienGoi to set
	 */
	public void setSoTienGoi(double soTienGoi) {
		this.soTienGoi = soTienGoi;
	}

	/**
	 * @return the kyHan
	 */
	public int getKyHan() {
		return kyHan;
	}

	/**
	 * @param kyHan the kyHan to set
	 */
	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	/**
	 * @return the laiSuat
	 */
	public float getLaiSuat() {
		return laiSuat;
	}

	/**
	 * @param laiSuat the laiSuat to set
	 */
	public void setLaiSuat(float laiSuat) {
		this.laiSuat = laiSuat;
	}

	/**
	 * Constructors day du tham so
	 * 
	 * @param maSo
	 * @param ngayMoSo
	 * @param soTienGoi
	 * @param kyHan
	 * @param laiSuat
	 */
	public SoTietKiem(String maSo, LocalDate ngayMoSo, double soTienGoi, int kyHan, float laiSuat) {
		setMaSo(maSo);
		setNgayMoSo(ngayMoSo);
		setSoTienGoi(soTienGoi);
		setKyHan(kyHan);
		setLaiSuat(laiSuat);
	}
	
	/**
	 * Ham tinhSoThangGoiThuc(): tinh so thang goi thuc phai dua vao So Ngay Mo So
	 * va Ky Han Goi.
	 * 
	 * @return so tang goi thuc
	 */
	public int tinhSoThangGoiThuc() {
		LocalDate today = LocalDate.now();
		Period giaiDoan = Period.between(ngayMoSo, today);
		int years = giaiDoan.getYears();
		int months = giaiDoan.getMonths();
		//System.out.println("So thang goi thuc:" + months);
		return ((years * 12 + months) / kyHan) * kyHan;
	}
	/**
	 * Tien lai tinh theo so thang goi thuc
	 * 
	 * @return tien lai
	 */
	public double tinhTienLai() {
		return soTienGoi * (laiSuat/12) * tinhSoThangGoiThuc();
		
	}
	@Override
	public String toString() {
		return "Ma so: " + maSo + ", Ngay mo: " + ngayMoSo + ", So tien goi:" + soTienGoi + ", Ky han:" + kyHan
				+ ", Lai suat:" + laiSuat+ " Tien lai: " + tinhTienLai() + "\n" ;
	}
	
}
