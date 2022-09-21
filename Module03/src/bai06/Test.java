package bai06;

import java.time.LocalDate;

public class Test {
	public static void main(String[] agrs) {
		DanhSachHoaDon ds = new DanhSachHoaDon(100);
		ds.them(new HoaDonTheoGio("1111", LocalDate.now(), "Nguyen VAn A", "101", 15000f, 12));
		ds.them(new HoaDonTheoNgay("2222", LocalDate.now(),"Ngyen Thi C", "202", 30000f, 5));
		
		System.out.println(ds.getHDTheoGio());
		System.out.println(ds.getHDTheoNgay());
	}
}
