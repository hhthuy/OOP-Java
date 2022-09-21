package baiTongHopHH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class DanhMucHangHoa {
	private List<HangHoa> dsHH;
	private Scanner sc;

	public DanhMucHangHoa() {
		dsHH = new ArrayList<HangHoa>();
	}

	// Them hang hoa
	public boolean them(HangHoa h) {
		if (dsHH.contains(h))
			return false;
		dsHH.add(h);
		return true;
	}

	// 1.Lay tung loai thong tin hang hoa
	public String getHangDienMay() {
		String s = "";
		for (HangHoa h : dsHH) {
			if (h instanceof HangDienMay) {
				s += h + "\n";
			}
		}
		return s;
	}

	public String getHangSanhSu() {
		String s = "";
		for (HangHoa h : dsHH) {
			if (h instanceof HangSanhSu) {
				s += h + "\n";
			}
		}
		return s;
	}

	public String getHangThucPham() {
		String s = "";
		for (HangHoa h : dsHH) {
			if (h instanceof HangThucPham) {
				s += h + "\n";
			}
		}
		return s;
	}

	// 2.Lay toan bo thong tin hoang hoa
	@Override
	public String toString() {
		String s = "";
		for (HangHoa h : dsHH) {
			s += h + "\n";
		}
		return s;
	}

	// 3.Lay thong tin Hang Thuc Pham "kho ban"
	public String getThongTinThucPhamKhoBan() {
		String s = "";
		for (HangHoa h : dsHH) {
			if (h instanceof HangThucPham) {
				if (h.getDanhGiaMucDoBanBuon().equalsIgnoreCase("kho ban"))
					s += h +"\n";
			}
		}
		return s;
	}

	// 4.Lay ds cac Hang Dien May < 12 thang
	public void getHangDienMay12Thang() {
		for (HangHoa h : dsHH) {
			if (h instanceof HangDienMay && ((HangDienMay) h).getThoiGianBH() <= 12)
				System.out.println(h);
		}
	}

	// 5.Sap xep hang hoa theo Ten tang dan (Kieu chuoi)
	public void sapXepTheoTenTangDan() {
		Collections.sort(dsHH, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return o1.getTenHang().compareToIgnoreCase(o2.getTenHang());
			}
		});
	}

	// 6.Sap xep theo so luong ton giam dan
	public void sapXepTheoSLTonGiamdan() {
		Collections.sort(dsHH, new Comparator<HangHoa>() {

			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.getSoLuongTon(), o1.getSoLuongTon());
			}
		});
	}

	// 7.1. Tim kiem Hang Hoa khi biet maHang
	public HangHoa timKiemMa(String maCanTim) {
		for (HangHoa h : dsHH) {
			if (h.getMaHang().equalsIgnoreCase(maCanTim))
				return h;
		}
		return null;
	}
	// 7.2. Tim kiem Hang Hoa khi biet maHang. Tra ve vi tri tim thay
	public int timMaCoViTri(String maCanTimViTri) {
		for(int i = 0; i < dsHH.size();i++) {
			if(dsHH.get(i).getMaHang().equals(maCanTimViTri)) {
				System.out.println(dsHH.get(i));
				return i;
			}
		}return -1;
	}

	// 8.Xoa hang hoa khi biet ma hang
	public boolean xoaHangHoaTheoMa(String maCanXoa) {
		if (timKiemMa(maCanXoa) != null) {
			return dsHH.removeIf(h -> h.getMaHang().equalsIgnoreCase(maCanXoa));
		}
		return false;
	}

	// 9.Sua thong tin don gia cua hang hoa khi biet ma hang
	public boolean suaDonGiaTheoMaHang(String maCanSua, double donGiaMoi) {
		for (HangHoa h : dsHH) {
			if (h.getMaHang().equals(maCanSua)) {
				h.setDonGia(donGiaMoi);
				return true;
			}
		}
		return false;
	}

	// 10. Tong so Hang Hoa co trong ds
	public int getTongSLHangHoa() {
		return dsHH.size();
	}

	// 11. Tinh Tong so So Luong Ton trong Hang Dien May.
	public int getTongSLTonHangDienMay() {
		int sum = 0;
		for (HangHoa h : dsHH) {
			if (h instanceof HangDienMay) {
				sum += h.getSoLuongTon();
			}
		}
		return sum;
	}

	// 12. Tinh TBC DonGia cua Hang Dien May.
	public double getTBCDonGiaHangDienMay() {
		double tong = 0;
		int dem = 0;
		for (HangHoa h : dsHH) {
				tong += h.getDonGia();
				dem++;
			}
		return (tong / dem);
	}
	// 13. Xuat ra cac Hang Thuc Pham co Nha cung cap K.

	public void xuatHangTPCuaNhaCungCapK() {
		sc = new Scanner(System.in);
		System.out.println("Nhap Nha Cung Cap cua Hang Thuc Pham:");
		String ncc = sc.nextLine();
		System.out.println("DS cac Nha cung cap cua Hang Thuc pham:");
		for (HangHoa h : dsHH) {
			if (h instanceof HangThucPham)
				if (((HangThucPham) h).getNhaCungCap().toLowerCase().contains(ncc.toLowerCase())) // NXB chua nxb dang
																									// tim
					System.out.println(h);
		}
	}
	// 14. Xuat ra cac Hang Thuc Pham co ngay san xuat thang 9/2019.
	public void xuatHHThang9Nam2019() {
		System.out.println("DS cac Hang hoa thang 9/2019:");
		for (HangHoa h : dsHH) {
			if (h instanceof HangThucPham)
					if(((HangThucPham) h).getNgaySX().getMonthValue() == 9 &&((HangThucPham) h).getNgaySX().getYear() == 2019)
					System.out.println(h);
		}
	}
	// 15. Tim Don Gia co so luong Lon Nhat.
	public double timHHCoGiaCaoNhat() {
		double max = dsHH.get(0).getDonGia();
		for (int i = 0; i < dsHH.size(); i++) {
			if (dsHH.get(i).getDonGia() > max) {
				max = (int) dsHH.get(i).getDonGia();
			}
		}
		return max;
	}
}
