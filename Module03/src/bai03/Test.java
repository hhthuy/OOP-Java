package bai03;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		DanhMucGiaoDich dm = new DanhMucGiaoDich(100);
		dm.themGiaoDich(new GiaoDichTienTe("1111", LocalDate.of(2020, 10, 11), 15000f, 5, 200, true));
		dm.themGiaoDich(new GiaoDichVang("2222", LocalDate.of(2020, 10, 12), 20000f, 3,"24K"));
		dm.themGiaoDich(new GiaoDichTienTe("3333", LocalDate.of(2020, 10, 30), 3000000000f, 4, 1000, true));
		dm.themGiaoDich(new GiaoDichVang("4444", LocalDate.of(2020, 10, 11), 2000000000f, 3,"9999"));
		
		System.out.println("GIAO DICH TIEN TE:");
		System.out.println(GiaoDichTienTe.tieude());
		System.out.println(dm.getGiaoDichTienTe());
		System.out.println("GIAO DICH VANG:\n");
		System.out.println(GiaoDichVang.tieude());
		System.out.println(dm.getGiaoDichVang());
		
		dm.getTongDGVang();
		dm.getTongGDTienTe();
		dm.getTBTienGDTienTe();
		dm.xuatDonGiaLonHon1Ty();
		
	}
}
