package bai04;


public class DanhMucGiaoDichNhaDat {

	private GiaoDichNhaDat[] dsNhaDat;
	private int count;

	public DanhMucGiaoDichNhaDat(int n) {
		dsNhaDat = new GiaoDichNhaDat[n];
		count = 0;
	}

	public int getSoLuong() {
		return count;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += dsNhaDat[i] + "\n";
		}
		return s;
	}

	public boolean themNhaDat(GiaoDichNhaDat nd) {
		if (count < dsNhaDat.length) {
			dsNhaDat[count++] = nd;
			return true;
		}
		return false;
	}

	// Xuat thong tin Giao dich dat
	public String getGiaoDichDat() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsNhaDat[i] instanceof GiaoDichDat)
				s += dsNhaDat[i] + "\n";
		}
		return s;
	}

	// Xuat thong tin Giao dich nha
	public String getGiaoDichNha() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsNhaDat[i] instanceof GiaoDichNha)
				s += dsNhaDat[i] + "\n";
		}
		return s;
	}
	// Tinh so luong cho Giao dich dat
	public void getTongSLGDDat() {
		double sum = 0;
		for (GiaoDichNhaDat giaodichND : dsNhaDat) {
			if (giaodichND instanceof GiaoDichDat)
				sum += giaodichND.getSoLuong();
		}
		System.out.println("Tong So luong GD Tien te:" + sum);
	}

	// Tinh so luong cho Giao dich Nha
	public void getTongSLGDNha() {
		double sum = 0;
		for (GiaoDichNhaDat giaodichND : dsNhaDat) {
			if (giaodichND instanceof GiaoDichNha)
				sum += giaodichND.getSoLuong();
		}
		System.out.println("Tong So luong GD Tien te:" + sum);
	}

	// Tinh TB thanh tien giao dich dat
	public void getTBTienGDDat() {
		double tong = 0;
		int dem = 0;
		for (int i = 0; i < count; i++)
			if (dsNhaDat[i] instanceof GiaoDichDat) {
				tong += dsNhaDat[i].getThanhTien();
				dem++;
			}
		System.out.println("TB Thanh tien cua Giao dich dat:" + tong / dem);
	}

	// Ham xuat Giao Dich thang 9/2013
	public void xuatGDThang9Nam2013() {
		System.out.println("DS cac Giao dich thang 9/2013:");
		System.out.println(GiaoDichNhaDat.tieude());
		for (GiaoDichNhaDat gdND : dsNhaDat) {
			if (gdND instanceof GiaoDichNhaDat)
				if (gdND.getNgayGiaoDich().getMonthValue() == 9 && gdND.getNgayGiaoDich().getYear() == 2013)
					
					System.out.println(gdND);
		}
	}
}
