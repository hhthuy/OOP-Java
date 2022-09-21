package bai06;

public class DanhSachHoaDon {
	private HoaDon[] danhSach;
	private int count;

	public DanhSachHoaDon(int n) {
		danhSach = new HoaDon[n];
		count = 0;
	}

	public int getSoLuong() {
		return count;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += danhSach[i] + "\n";
		}
		return s;
	}

	public boolean them(HoaDon hd) {
		if (count < danhSach.length) {
			danhSach[count++] = hd;
			return true;
		}
		return false;	
	}

	// Xuat thong tin KH Viet Nam
	public String getHDTheoNgay() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (danhSach[i] instanceof HoaDonTheoNgay)
				s += danhSach[i] + "\n";
		}
		return s;
	}

	// Xuat thong tin HD THEO GIO
	public String getHDTheoGio() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (danhSach[i] instanceof HoaDonTheoGio)
				s += danhSach[i] + "\n";
		}
		return s;
	}
}
