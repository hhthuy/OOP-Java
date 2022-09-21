package bai06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.util.Comparator;

public class DanhMucPhongHoc {
	private List<PhongHoc> dsPH;

	public DanhMucPhongHoc() {
		dsPH = new ArrayList<PhongHoc>();
	}

	@Override
	public String toString() {
		String s = "";
		for (PhongHoc ph : dsPH) {
			s += ph + "\n";
		}
		return s;
	}

	// Lay thong tin tung loai hang hoa
	public String getPhongLyThuyet() {
		String s = "";
		for (int i = 0; i < dsPH.size(); i++) {
			if (dsPH.get(i) instanceof PhongLyThuyet) {
				s += dsPH.get(i) + "\n";
			}
		}
		return s;
	}
	public String getPhongMayTinh() {
		String s = "";
		for (int i = 0; i < dsPH.size(); i++) {
			if (dsPH.get(i) instanceof PhongMayTinh) {
				s += dsPH.get(i) + "\n";
			}
		}
		return s;
	}
	public String getPhongThiNghiem() {
		String s = "";
		for (int i = 0; i < dsPH.size(); i++) {
			if (dsPH.get(i) instanceof PhongThiNghiem) {
				s += dsPH.get(i) + "\n";
			}
		}
		return s;
	}

	/**
	 * 1.Them mot phong hoc vao danh sach
	 */
	public boolean themPhongHoc(PhongHoc ph) {
		if (dsPH.contains(ph))// contains:KT ph co trong dsPH hay chua -> lop PhongHoc ham
								// hashCode(),equals()->maPhong
			return false;
		dsPH.add(ph);
		return true;
	}

	/**
	 * 2.Tim kiem phong hoc khi biet ma phong
	 */
	public PhongHoc timKiemMa(String maPhong) {
		for (PhongHoc ph : dsPH)
			if (ph.getMaPhong().equalsIgnoreCase(maPhong))
				return ph;
		return null;
	}

	/**
	 * 3.Lay thong tin cac phong hoc dat chuan
	 */
	public void layPhongDatChuan() {
		for (PhongHoc ph : dsPH)
			if (ph.phongDatChuan())
				System.out.println(ph);
	}

	/**
	 * 4.Sap xep danh sach TANG DAN theo day nha
	 */
	public void sapXepDayNhaTangDan() {
		Collections.sort(dsPH, new Comparator<PhongHoc>() {
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub

				return o1.getDayNha().compareToIgnoreCase(o2.getDayNha());
			}
		});
	}

	/**
	 * 5.Sap xep danh sach Giam DAN theo dien tich
	 **/
	public void sapXepDienTichGiamDan() {
		Collections.sort(dsPH, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.getDienTich(), o1.getDienTich());
			}
		});
	}

	/**
	 * 6.Sap xep danh sach Tang dan theo so bong den
	 **/
	public void sapXepSoBongDenTangDan() {
		Collections.sort(dsPH, new Comparator<PhongHoc>() {

			@Override
			public int compare(PhongHoc o1, PhongHoc o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getSoBongDen(), o2.getSoBongDen());
			}
		});
	}

	/**
	 * 7.Lay danh sach cac phong may tinh tren 60 may
	 */
	public void getPhongMayTinhTren60() {
		for (PhongHoc ph : dsPH) {
			if (ph instanceof PhongMayTinh && ((PhongMayTinh)ph).getSoMayTinh() >= 60){
				System.out.println(ph);
				}
			}
		}

	/**
	 * 8.XOA 1 PHONG HOC KHI BIET MA PHONG
	 */
	public boolean xoaPhongHoc(String maCanXoa) {
		PhongHoc ph = timKiemMa(maCanXoa);
		if (ph != null) {
			dsPH.remove(ph);
			return true;
		}
		return false;
	}

	/**
	 * 9.Tong so phong hoc co trong danh sach
	 */
	public int tongSoPhongHoc() {
		return dsPH.size();
	}

	/**
	 * 10. toan bo danh sach phong hoc
	 **/
	public void xuatDanhSachPhongHoc() {
		for (PhongHoc ph : dsPH)
				System.out.println(ph);
	}
	/**
	 * 11. In Toan bo phong hoc ly thuyet co may chieu
	 */
	public void xuatDSPhongLyThuyetCoMayChieu() {
		for (PhongHoc ph : dsPH) {
			if(ph instanceof PhongLyThuyet) {
				PhongLyThuyet p = (PhongLyThuyet)ph;
				if(p.isCoMayChieu()) {
					System.out.println(ph);
				}
			}
		}
	}
	/**
	 * 12.Tong so bong den phong ly thuyet
	 */
	public int getTongBongDenPhongLyThuyet() {
		int sum =0;
		for (PhongHoc ph : dsPH) {
			if(ph instanceof PhongLyThuyet) {
				sum += ph.getSoBongDen();
			}
		}return sum;
	}
}
