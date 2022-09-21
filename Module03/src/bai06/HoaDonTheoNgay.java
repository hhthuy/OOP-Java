package bai06;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon{
	//Cac thuoc tinh
	private int soNgayThue;
	//Cac phuong thuc

	/**
	 * @return the soNgayThue
	 */
	public int getSoNgayThue() {
		return soNgayThue;
	}

	/**
	 * @param soNgayThue the soNgayThue to set
	 */
	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public HoaDonTheoNgay(String maKH, LocalDate ngayHoaDon, String tenKH, String maPhong, double donGia,
			int soNgayThue) {
		super(maKH, ngayHoaDon, tenKH, maPhong, donGia);
		setSoNgayThue(soNgayThue);
	}
	@Override
	public String toString() {
		return String.format("%s %-10d", super.toString(), soNgayThue);
    }
	public double getThanhTien() {
		if(soNgayThue <  7)
			return soNgayThue*donGia;
		else
			return soNgayThue*donGia + (soNgayThue%donGia)*20;	
	}
}
