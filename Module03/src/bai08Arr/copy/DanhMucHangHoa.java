package bai08Arr.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class DanhMucHangHoa {
	// CAC THUOC TINH
	private List<HangHoa> dsHangHoa;

	// CAC PHUONG THUC
	public DanhMucHangHoa() {
		dsHangHoa = new ArrayList<HangHoa>();
	}

	public boolean them(HangHoa h) {
		if (dsHangHoa.contains(h))// contains them hashcode, equal voi thuoc tinh la ma
			return false;
		dsHangHoa.add(h);
		return true;
	}

	public int getSoLuong() {
		return dsHangHoa.size();
	}

	// Lay thong tin tung loai hang hoa
	public String getHangDienMay() {
		String s = "";
		s += HangDienMay.getTieuDeDienMay();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i) instanceof HangDienMay) {
				s += dsHangHoa.get(i) + "\n";
			}
		}
		return s;
	}

	public String getHangSanhSu() {
		String s = "";
		s += HangSanhSu.getTieuDeSanhSu();
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i) instanceof HangSanhSu) {
				s += dsHangHoa.get(i) + "\n";
			}
		}
		return s;
	}

	public String getHangThucPham() {
		String s = "";
		s += HangDienMay.getTieuDeDienMay();
		for (HangHoa hh : dsHangHoa) {
			if (hh instanceof HangThucPham)
				s += hh + "\n";
		}
		return s;
	}

	// Lay thong tin toan bo danh sach cac hang hoa
	@Override
	public String toString() {
		String s = "";
		s += HangHoa.getTieuDe() + "\n";
		for (HangHoa hh : dsHangHoa) {
			s += hh + "\n";
		}
		return s;
	}

	// Lay thong tin hang thuc pham kho ban
	public String getThongTinThucPhamKhoBan() {
		String s = "";
		for (int i = 0; i < dsHangHoa.size(); i++) {
			if (dsHangHoa.get(i) instanceof HangThucPham) {
				if (dsHangHoa.get(i).getDanhGiaMucDoBanBuon().equals("kho ban"))
					s += dsHangHoa.get(i);
			}
		}
		return s;
	}

	// Tim kiem hang hoa khi biet ma hang
	public HangHoa timKiemMa(String maTim) {
		for (HangHoa hh : dsHangHoa) {
			if (hh.getMaHang().equalsIgnoreCase(maTim)) {
				return hh;
			}
		}
		return null;
	}

	// Sap xep hang hoa theo ten tang dan (Kieu chuoi)
	public void sapXepTenTangDan() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}
		});
	}

	// Sap xep hang hoa theo ten so luong ton giam dan (Kieu so)
	public void sapXepSoLuongTonGiamDan() {
		Collections.sort(dsHangHoa, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				return Integer.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
			}
		});
	}

	// Sua thongtin don gia cua hang hoa khi biet ma hang

	public boolean suaDonGiaKhiBietMaHang(String maCanSua, double donGiaMoi) {
		for (HangHoa hh : dsHangHoa) {
			if (hh.getMaHang().equals(maCanSua)) {
				hh.setDonGia(donGiaMoi);
				return true;
			}
		}
		return false;
	}
	// Xoa hang hoa khi biet ma hang

	public boolean xoaHangHoaTheoMa(String maCanXoa) {
		if (timKiemMa(maCanXoa) != null)
			return dsHangHoa.removeIf(hh -> hh.getMaHang().equalsIgnoreCase(maCanXoa));
		return false;
	}

}
