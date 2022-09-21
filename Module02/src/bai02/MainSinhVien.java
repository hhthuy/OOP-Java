package bai02;

import java.util.Scanner;

/**
 * Ham kiem thu cho lop sinh vien
 * 
 * @author HongThuy
 *
 */
public class MainSinhVien {

	private static Scanner sc;

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(11111, "Nguyen Thanh An", 6.5, 8.5);
		// Tao doi tuong sv2 bang default constructor
		SinhVien sv2 = new SinhVien();
		sv2.setMaSV(22222);
		sv2.setHoTenSV("Le Thi Bong");
		sv2.setDiemLT(7.5);
		sv2.setDiemTH(8.0);

		// Tao doi tuong sv3

		SinhVien sv3 = new SinhVien();

		sc = new Scanner(System.in);
		System.out.println("Nhập MSSV sv3: ");
		int masv = sc.nextInt();
		System.out.println("Nhập Ho va Ten của sv3: ");
		sc = new Scanner(System.in);
		String hoten = sc.nextLine();
		System.out.println("Nhập Diem LT của sv3: ");
		sc = new Scanner(System.in);
		float diemlt = sc.nextFloat();
		System.out.println("Nhập Diem TH của sv3: ");
		sc = new Scanner(System.in);
		float diemth = sc.nextFloat();
		sv3 = new SinhVien(masv, hoten, diemlt, diemth);
		// In thong tin cua 3 doi tuong sv1, sv2,sv3 ra cua so console
		System.out.println("-------------------------------------------------------");
		System.out.println(SinhVien.tieude());
		System.out.println("-------------------------------------------------------");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		System.out.println("-------------------------------------------------------");
	}

}
