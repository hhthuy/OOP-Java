package bai05;

import java.time.LocalDate;


public class Test {
	public static void main(String[] args) {
		DanhMucKhachHang dm = new DanhMucKhachHang(100);
		dm.themKH(new KHVietNam("1111", "Nguyen Van A", LocalDate.now(), 10, 15000, "sinh hoat", 50));
		dm.themKH(new KHVietNam("2222", "Le Van C", LocalDate.now(), 20, 25000, "san xuat", 60));
		dm.themKH(new KHNuocNgoai("3333", "Nguyen Thi C", LocalDate.now(), 50, 700000, "US"));
		dm.themKH(new KHNuocNgoai("4444", "Tran Huu D", LocalDate.now(), 60, 800000, "Rusia"));
		System.out.println("------DANH SACH KH VIET NAM------");
		System.out.println(KHVietNam.tieude());
		System.out.println(dm.getKHVietNam());
		System.out.println("------DANH SACH KH NUOC NGOAI------");
		System.out.println(KHNuocNgoai.tieude());
		System.out.println(dm.getKHNuocNgoai());
		
		dm.getTBTienKHNuocNgoai();
		dm.xuatGDThang9Nam2018();
		
		
	}
}
