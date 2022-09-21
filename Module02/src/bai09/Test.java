package bai09;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		KhachHang kh1 = new KhachHang("KH001", "Nguyen Van An", 2);
		kh1.themSoTietKiem("STK111", LocalDate.of(2020, 07, 19), 10000f, 3, (float) 0.005);
		kh1.themSoTietKiem("STK112", LocalDate.of(2020, 02, 26), 10000f, 6, (float) 0.006);
		System.out.println(kh1);
	}

}
