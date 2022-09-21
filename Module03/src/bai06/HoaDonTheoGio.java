package bai06;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	// Cac thuoc tinh
	private float soGioThue;
	// Cac phuong thuc

	/**
	 * @return the soGioThue
	 */
	public float getSoGioThue() {
		return soGioThue;
	}

	/**
	 * @param soGioThue the soGioThue to set
	 */
	public void setSoGioThue(float soGioThue) {
		this.soGioThue = soGioThue;
	}

	public HoaDonTheoGio(String maKH, LocalDate ngayHoaDon, String tenKH, String maPhong, double donGia,
			float soGioThue) {
		super(maKH, ngayHoaDon, tenKH, maPhong, donGia);
		setSoGioThue(soGioThue);
	}
	
	@Override
	public String toString() {
		return String.format("%s %-10s", super.toString(), soGioThue);
    }
	public double getThanhTien() {
		if(soGioThue > 24 && soGioThue < 30)
			return 24*donGia;
		else
			return soGioThue*donGia;	
	}
}
