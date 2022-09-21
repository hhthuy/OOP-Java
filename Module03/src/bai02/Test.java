package bai02;

import java.time.LocalDate;

public class Test {

	// Tao san moi loai 3 cuon sach vao danh sach
	public static void main(String[] sgrs) {
		
		DanhMucSach dm = new DanhMucSach(100);
		dm.themSach(new SachGiaoKhoa("444", LocalDate.now(), 300000f, 8, "Eeeee", true));
		dm.themSach(new SachGiaoKhoa("555", LocalDate.now(), 250000f, 9, "Ggggg", true));
		dm.themSach(new SachThamKhao("789", LocalDate.now(), 200000f, 3, "Ffff", 30000));
		dm.themSach(new SachThamKhao("910", LocalDate.now(), 150000f, 4, "Hhhh", 20000));
		
		System.out.println("-------DS SACH GIAO KHOA-------");
		System.out.println(SachGiaoKhoa.tieude());
		System.out.println(dm.getSachGiaoKhoa());
		System.out.println("-------DS SACH THAM KHOA-------");
		System.out.println(SachThamKhao.tieude());
		System.out.println(dm.getSachThamKhoa());
		
		dm.getTongSGK();
		dm.getTongSTK();
		dm.getSachThamKhoa();
		dm.getTBCDonGiaSTK();
		dm.xuatSGKcuaNXB();
		

		/**
		Sach aSach[] = new Sach[6];
		aSach[0] = new SachGiaoKhoa("111", LocalDate.now(), 100000, 5, "Aaaa", true);
		aSach[1] = new SachGiaoKhoa("222", LocalDate.now(), 150000, 6, "Bbbb", true);
		aSach[2] = new SachGiaoKhoa("333", LocalDate.now(), 200000, 7, "Cccc", true);
		aSach[3] = new SachThamKhao("123", LocalDate.now(), 300000, 10, "Dddd", 10000);
		aSach[4] = new SachThamKhao("456", LocalDate.now(), 500000, 20, "Dddd", 20000);
		// Xuat SGK
		System.out.println("DS SACH GIA KHOA");
		for (Sach sach : aSach) {
			if (sach instanceof SachGiaoKhoa)// kiem tra sach co thuoc trong SGK hay khong?
				System.out.println(sach);
		}**/
	}
}
