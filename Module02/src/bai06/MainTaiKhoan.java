package bai06;

/**
 * Ham test cho lop TAI KHOAN
 * 
 * @author HongThuy
 *
 */
public class MainTaiKhoan {
	public static void main(String[] args) {
		// Tao 3 doi tuong acc1,acc2,acc3 voi cac gia tri STK, ten tai khoan, So du
		TaiKhoan acc1 = new TaiKhoan(72345, "Ted Murphy", 10256);
		TaiKhoan acc2 = new TaiKhoan(69713, "Jane Smith", 4000);
		TaiKhoan acc3 = new TaiKhoan(93757, "Edward Demsey", 75932);
		System.out.println("*****Tai_Khoan_Ban_Dau*****");
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

		// Goi them so tien cho acc1 la 25.85, cho acc2 la 50000
		acc1.goiTien(2585);
		acc2.goiTien(50000);
		// Rut khoi acc2 so tien la 43075, muc phi 150
		acc2.rutTien(43075, 150);
		// Tinh tien lai cho acc3
		acc3.tinhTienLai();
		// Xuat thong tin cua acc1,acc2,acc3
		System.out.println("*****Tai_Khoan_sau_khi_Goi_tien & Rut_tien & Tinh_lai*****");
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

		// Chuyen tien tu acc2 cho acc1 so tien la 10000
		acc2.chuyenKhoan(acc1, 10000);
		System.out.println("*****Tai_Khoan_sau_khi_Chuyen_khoan*****");
		System.out.println(acc1);
		System.out.println(acc2);
	}
}
