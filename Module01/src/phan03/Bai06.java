package phan03;

import java.util.Scanner;

/**
 * VCT Kiem tra so nhap vao co phai la so nguyen to hay khong ?
 * @author HongThuy
 *
 */
public class Bai06 {

	private static Scanner nhap;

	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra nguyen to : ");
		int n = nhap.nextInt();
		if(kiemTraSoNguyenTo(n)) {
			System.out.printf("%d la so nguyen to", n);
		}else {
			System.out.printf("%d khong la so nguyen to", n);
		}
		
	}
	/**
	 * Ham tra ve true neu a la so nguyen to
	 * @param a
	 * @return
	 */
	
	public static boolean kiemTraSoNguyenTo(int a) {
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a%i == 0) {
				return false;
			}
		}
		return true;
	}

}
