package bai03;

public class DanhMucGiaoDich {
	private GiaoDich[] dsGiaoDich;
	private int count;

	public DanhMucGiaoDich(int n) {
		dsGiaoDich = new GiaoDich[n];
		count = 0;
	}

	public int getSoLuong() {
		return count;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += dsGiaoDich[i] + "\n";
		}
		return s;
	}

	public boolean themGiaoDich(GiaoDich gd) {
		if (count < dsGiaoDich.length) {
			dsGiaoDich[count++] = gd;
			return true;
		}
		return false;
	}

	public String getGiaoDichVang() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsGiaoDich[i] instanceof GiaoDichVang)
				s += dsGiaoDich[i] + "\n";
		}
		return s;
	}

	public String getGiaoDichTienTe() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsGiaoDich[i] instanceof GiaoDichTienTe)
				s += dsGiaoDich[i] + "\n";
		}
		return s;
	}

	// Tinh tong tien cho Giao dich Vang
	public void getTongGDTienTe() {
		double sum = 0;
		for (GiaoDich gd : dsGiaoDich) {
			if (gd instanceof GiaoDichTienTe)
				sum += gd.getSoLuong();
		}
		System.out.println("Tong So luong GD Tien te:" + sum);
	}

	// Tinh tong tien cho Giao dich Tien te
	public void getTongDGVang() {
		double sum = 0;
		for (GiaoDich gd : dsGiaoDich) {
			if (gd instanceof GiaoDichVang)
				sum += gd.getSoLuong();
		}
		System.out.println("Tong So luong GD Vang:" + sum);
	}

	// Tinh TB thanh tien cua giao dich tien te
	public void getTBTienGDTienTe() {
		double tong = 0;
		int dem = 0;
		for (int i = 0; i < count; i++)
			if (dsGiaoDich[i] instanceof GiaoDichTienTe) {
				tong += dsGiaoDich[i].getThanhTien();
				dem++;
			}
		System.out.println("Trung binh thanh tien cua GD tien :" + tong / dem);
	}

	// Ham xuat Giao Dich don gia > 1ty
	public void xuatDonGiaLonHon1Ty() {
		System.out.println("DS cac Don Gia > 1 ty:");
		for (GiaoDich gd : dsGiaoDich) {
			if (gd instanceof GiaoDich)
				if (gd.getDonGia() > 1000000)
					System.out.println(gd);
		}
	}
}
