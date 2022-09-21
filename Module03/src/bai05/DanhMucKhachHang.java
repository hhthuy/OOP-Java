package bai05;

public class DanhMucKhachHang {
	private KhachHang[] dsHoaDon;
	private int count;

	public DanhMucKhachHang(int n) {
		dsHoaDon = new KhachHang[n];
		count = 0;
	}

	public int getSoLuong() {
		return count;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += dsHoaDon[i] + "\n";
		}
		return s;
	}

	public boolean themKH(KhachHang hd) {
		if (count < dsHoaDon.length) {
			dsHoaDon[count++] = hd;
			return true;
		}
		return false;
	}

	// Xuat thong tin KH Viet Nam/ KH Nuoc Ngoai
	public String getKHVietNam() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsHoaDon[i] instanceof KHVietNam)
				s += dsHoaDon[i] + "\n";
		}
		return s;
	}

	public String getKHNuocNgoai() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsHoaDon[i] instanceof KHNuocNgoai)
				s += dsHoaDon[i] + "\n";
		}
		return s;
	}

	// Tinh TB thanh tien KH Nuoc ngoai
	public void getTBTienKHNuocNgoai() {
		double tong = 0;
		int dem = 0;
		for (int i = 0; i < count; i++)
			if (dsHoaDon[i] instanceof KHNuocNgoai) {
				tong += dsHoaDon[i].getThanhTien();
				dem++;
			}
		System.out.println("TB Thanh tien cua Khach Hang Nuoc Ngoai:" + tong / dem);
	}

	// Ham xuat Hoa Don thang 9/2018
	public void xuatGDThang9Nam2018() {
		System.out.println("DS cac Giao dich thang 9/2018:");
		System.out.println(KhachHang.tieude());
		for (KhachHang kh : dsHoaDon) {
			if (kh instanceof KhachHang)
				if (kh.getNgayLapHoaDon().getMonthValue() == 9 && kh.getNgayLapHoaDon().getYear() == 2018)
					System.out.println(kh.toString());
		}
	}
}
