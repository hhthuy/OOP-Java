package ArraysListSach;

import java.util.Scanner;
import java.util.ArrayList;

public class DanhMucSach {
	ArrayList<Sach> dsSach;
	private Scanner sc;

	public DanhMucSach() {
		dsSach = new ArrayList<Sach>();
	}

	public boolean themSach(Sach s) {
		if (s != null) {
			for (Sach st : dsSach) {
				if (st.getMaSach().equalsIgnoreCase(s.getMaSach())) {
					System.out.println("Khong Them Duoc");
					return false;
				}
			}
			dsSach.add(s);
			return true;
		}
		return false;
	}

	public void xuatSachGK() {
		for (int i = 0; i < dsSach.size(); i++) {
			if (dsSach.get(i) instanceof SachGiaoKhoa) {
				System.out.println(dsSach.get(i));
			}
		}
	}

	public void xuatSachTK() {
		for (int i = 0; i < dsSach.size(); i++) {
			if (dsSach.get(i) instanceof SachThamKhao) {
				System.out.println(dsSach.get(i));
			}
		}
	}

	public void xuatSach() {
		for (int i = 0; i < dsSach.size(); i++) {
			System.out.println(dsSach.get(i));
		}
	}
	//tong tien  sach tham khao
	public void gettongTienSTK() {
		double tongDonGiaSTK = 0;
        for (int i = 0; i < dsSach.size(); i++) {
        	tongDonGiaSTK += dsSach.get(i).getSoLuong() * 
                dsSach.get(i).getDonGia() + dsSach.get(i).getThanhTien();
        }
        System.out.println("Tổng tiền sách tham khảo = " + tongDonGiaSTK);
         
	}
	

	// Tinh TBC don Gia cua cac Sach Tham Khao
	public void getTBCDonGiaSTK() {
		double TBCDonGia = 0, tongDonGiaSTK = 0;
		for (int i = 0; i < dsSach.size(); i++) {
			tongDonGiaSTK += dsSach.get(i).getDonGia();
			TBCDonGia = tongDonGiaSTK / dsSach.size();
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
