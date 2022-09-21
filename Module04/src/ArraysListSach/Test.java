package ArraysListSach;

import java.time.LocalDate;
public class Test {

	// Tao san moi loai 3 cuon sach vao danh sach
	public static void main(String[] sgrs) {
		DanhMucSach dm = new DanhMucSach();
		dm.themSach(new SachGiaoKhoa("444", LocalDate.now(), 300000f, 8, "Eeeee", true));
		dm.themSach(new SachGiaoKhoa("555", LocalDate.now(), 250000f, 9, "Ggggg", true));
		dm.themSach(new SachThamKhao("789", LocalDate.now(), 200000f, 3, "Ffff", 30000));
		dm.themSach(new SachThamKhao("910", LocalDate.now(), 150000f, 4, "Hhhh", 20000));
		System.out.println("CHUONG TRINH QUAN LY SACH");
		System.out.println("-------Sach giao khoa-------");
		System.out.println(SachGiaoKhoa.tieude());
	    dm.xuatSachGK();
		System.out.println("-------Sach tham khao-------");
		System.out.println(SachThamKhao.tieude());
		dm.xuatSachTK();
        System.out.println("****************************************");
		dm.gettongTienSTK();
		dm.getTBCDonGiaSTK();
		dm.xuatSGKcuaNXB();

		
	}
}
