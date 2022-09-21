package bai04;

/**
 * Kiem thu cho lop Thong tin dang ky xe
 * 
 * @author Hong Thuy
 *
 */
public class MainTTDKXe {

	public static void main(String[] args) {
		// Tao doi tuong xe1,xe2,xe3 voi constructor day du tham so
		ThongTinDangKyXe xe1 = new ThongTinDangKyXe("Nguyen Thu Loan", "Future Neo", 100, 35000000);
		ThongTinDangKyXe xe2 = new ThongTinDangKyXe("Le Minh Tinh", "Ford Ranger", 3000, 25000000);
		ThongTinDangKyXe xe3 = new ThongTinDangKyXe("Nguyen Minh Triet", "Landscape", 1500, 100000000);
		// In thong tin cua 3 doi tuong xe1,xe2,xe3
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(ThongTinDangKyXe.tieude());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(xe1);
		System.out.println(xe2);
		System.out.println(xe3);
		System.out.println("--------------------------------------------------------------------------------");

	}
}
