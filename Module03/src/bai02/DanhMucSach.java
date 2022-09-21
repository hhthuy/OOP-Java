package bai02;

import java.util.Scanner;

public class DanhMucSach {
	private Sach[] dsSach;
	private int count; // So luong hien tai cua Ds Sach
	private Scanner sc;

	public DanhMucSach(int n) {
		dsSach = new Sach[n];
		count = 0;
	}

	public int getSoLuong() {
		return count;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += dsSach[i] + "\n";
		}
		return s;
	}

	public boolean themSach(Sach s) {
		if (count < dsSach.length) {
			dsSach[count++] = s;
			return true;
		}
		return false;
	}

	public String getSachGiaoKhoa() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsSach[i] instanceof SachGiaoKhoa)
				s += dsSach[i] + "\n";
		}
		return s;
	}

	public String getSachThamKhoa() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsSach[i] instanceof SachThamKhao)
				s += dsSach[i] + "\n";
		}
		return s;
	}

	// Tinh tong tien cho SGK
	public void getTongSGK() {
		double sum = 0;
		for (Sach sach : dsSach) {
			if (sach instanceof SachGiaoKhoa)// kiem tra sach co thuoc trong SGK hay khong?
				sum += sach.getThanhTien();
		}
		System.out.println("Tong tien SGK:" + sum);
	}

	// Tinh tong tien cho SGK
	public void getTongSTK() {
		double sum = 0;
		for (Sach sach : dsSach) {
			if (sach instanceof SachThamKhao)// kiem tra sach co thuoc trong SGK hay khong?
				sum += sach.getThanhTien();
		}
		System.out.println("Tong tien STK:" + sum);
	}
	// Tinh TBC don Gia cua cac Sach Tham Khao
	public void getTBCDonGiaSTK() {
		double TBCDonGia = 0,tongDonGiaSTK=0;
		for (Sach sach : dsSach) {
			if (sach instanceof SachThamKhao)
			    tongDonGiaSTK += sach.getDonGia();
			    TBCDonGia = (tongDonGiaSTK / 2);//TBCDonGia = (tongDonGiaSTK / dsSach.length);
		}
		System.out.println("TBC Don Gia Sach Tham Khao:" + TBCDonGia);
	}

	// Ham xuat SGK cua NXB k
	public void xuatSGKcuaNXB() {
		sc = new Scanner(System.in);
		System.out.println("Nhap NXB cua SGK:");
		String nxb = sc.nextLine();
		System.out.println("DS cacs SGK cua NXB:");
		for (Sach sach : dsSach) {
			if (sach instanceof SachGiaoKhoa)
				if (sach.getNhaXuatBan().toLowerCase().contains(nxb.toLowerCase())) // NXB chua nxb dang tim
					System.out.println(sach);
		}
	}
	
}
