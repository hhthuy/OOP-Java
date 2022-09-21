package bai08;


import java.util.Arrays;
import java.util.Comparator;

public class DanhMucHangHoa {
	// CAC THUOC TINH
	private HangHoa[] dsHangHoa;
	private int count;

	// CAC PHUONG THUC
	public DanhMucHangHoa(int n) {
		dsHangHoa = new HangHoa[n];
		count = 0;
	}

	public boolean them(HangHoa h) {
		if (count < dsHangHoa.length) {
			for (int i = 0; i < count; i++) {
				if (dsHangHoa[i].equals(h)) {
					return false;
				}
			}
			dsHangHoa[count++] = h;
			return true;
		}
		return false;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += dsHangHoa[i] + "\n";
		}
		return s;
	}

	// Lay thong tin tung loai hang hoa
	public DanhMucHangHoa getHangDienMay() {
		DanhMucHangHoa ds = new DanhMucHangHoa(count);
		System.out.println(HangDienMay.getTieuDeDienMay());
		for (int i = 0; i < count; i++) {
			if (dsHangHoa[i] instanceof HangDienMay) {
				ds.them(dsHangHoa[i]);
			}
		}
		return ds;
	}

	public DanhMucHangHoa getHangSanhSu() {
		DanhMucHangHoa ds = new DanhMucHangHoa(count);
		System.out.println(HangSanhSu.getTieuDeSanhSu());
		for (int i = 0; i < count; i++) {
			if (dsHangHoa[i] instanceof HangSanhSu) {
				ds.them(dsHangHoa[i]);
			}
		}
		return ds;
	}

	public DanhMucHangHoa getHangThucPham() {
		DanhMucHangHoa ds = new DanhMucHangHoa(count);
		System.out.println(HangThucPham.getTieuDeThucPham());
		for (int i = 0; i < count; i++) {
			if (dsHangHoa[i] instanceof HangThucPham) {
				ds.them(dsHangHoa[i]);
			}
		}
		return ds;
	}

	/**
	 * public String getHangDienMay() { String s = ""; s += "Hang dien may\n"; s +=
	 * HangDienMay.getTieuDe() + "\n"; for (int i = 0; i < count; i++) { if
	 * (dsHangHoa[i] instanceof HangDienMay) { s += dsHangHoa[i] + "\n"; } } return
	 * s; }
	 **/
	// Lay thong tin toan o danh sach cac hang hoa
	public DanhMucHangHoa getToanBoHangHoa() {
		System.out.println(HangHoa.getTieuDe());
		DanhMucHangHoa ds = new DanhMucHangHoa(count);
		for (int i = 0; i < count; i++) {
			if (dsHangHoa[i] instanceof HangHoa) {
				ds.them(dsHangHoa[i]);
			}
		}
		return ds;
	}

	// Tim kiem hang hoa khi biet ma hang
	public boolean timKiemMa(String maHang) {
		for (int i = 0; i < count; i++) {
			if (dsHangHoa[i].getMaHang().equalsIgnoreCase(maHang)) {
				System.out.println(dsHangHoa[i]);
				return true;
			}
		}
		return false;
	}

	/**
	 * public HangHoa timKiemMa(String maHang) { for (int i = 0; i < count; i++) {
	 * if (dsHangHoa[i].getMaHang().equalsIgnoreCase(maHang)) { return dsHangHoa[i];
	 * } } return null; }
	 **/
	// Sap xep hang hoa theo ten tang dan
	public void sapXepTenTangDan() {
		Arrays.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}
		});
	}

	/**
	 * public void sapXepTenTangDan() { for(int i =0; i < count - 1; i++) { for(int
	 * j = i+1; j < count; j++) {
	 * if(dsHangHoa[i].getTenHang().compareToIgnoreCase(dsHangHoa[j].getTenHang())>0)
	 * { HangHoa h =dsHangHoa[i]; dsHangHoa[i]=dsHangHoa[j]; dsHangHoa[j]=h; } } }
	 * 
	 * }
	 **/
	// Sap xep hang hao theo tenso luong ton giam dan
	public void sapXepSoLuongTonGiamDan() {
		Arrays.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
			}
		});
	}

	/**
	 * public void sapXepSoLuongTonGiamDan() { for(int i =0; i < count - 1; i++) {
	 * for(int j = i+1; j < count; j++) { if(dsHangHoa[i].getSoLuongTon() <
	 * dsHangHoa[j].getSoLuongon()) { HangHoa h =dsHangHoa[i];
	 * dsHangHoa[i]=dsHangHoa[j]; dsHangHoa[j]=h; } } } }
	 * 
	 * @return
	 **/
	// Sua thong tin don gia cua hag hoa khi biet ma hang
	public boolean suaDonGiaKhiBietMaHang(String maCanSua, double donGiaMoi) {
		for (int i = 0; i < count; i++) {
			if (dsHangHoa[i].getMaHang().equals(maCanSua)) {
				dsHangHoa[i].setDonGia(donGiaMoi);
				return true;
			}
		}
		return false;
	}

}
