package bai04;

import java.time.LocalDate;


public class Test {

	public static void main(String[] args) {
		DanhMucGiaoDichNhaDat dm = new DanhMucGiaoDichNhaDat(100);
		dm.themNhaDat(new GiaoDichDat("11111", LocalDate.now(), 5000, 90,3, true));
		dm.themNhaDat(new GiaoDichNha("123", LocalDate.of(2020, 11, 20), 6000, 100,5, true));
		dm.themNhaDat(new GiaoDichDat("22222", LocalDate.of(2013, 9, 30), 6000, 80,7, true));
		dm.themNhaDat(new GiaoDichNha("123", LocalDate.of(2013, 9, 10), 4000, 100,6, true));
		System.out.println("------DANH SACH NHA------");
		System.out.println(GiaoDichNha.tieude());
		System.out.println(dm.getGiaoDichNha());
		System.out.println("------DANH SACH DAT------");
		System.out.println(GiaoDichDat.tieude());
		System.out.println(dm.getGiaoDichDat());
		dm.getTongSLGDNha();
		dm.getTongSLGDDat();
		dm.getTBTienGDDat();
		dm.xuatGDThang9Nam2013();
		
	}
	

}
