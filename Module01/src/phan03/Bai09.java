package phan03;

import java.util.Scanner;

/**
 * VCT in ra so lan ki tu 'a' xuat hien trong mot chuoi.
 * 
 * @author HongThuy
 *
 */
public class Bai09 {
	private static Scanner nhap;
	private static String chuoi;

	public static void main(String[] args) {
		char kyTu = 'a';
		nhap = new Scanner(System.in);
		System.out.println("Nhap vao mot chuoi: ");
		chuoi = nhap.nextLine();
		System.out.printf("So la xuat hien ky tu 'a' trong chuoi la: %d", soLanXuatHien(kyTu));

	}

	public static int soLanXuatHien(char kyTu) {
		int count = 0;
		for (int i = 0; i < chuoi.length(); i++) {
			if (chuoi.charAt(i) == kyTu) {
				count ++;
			}
		}
		return count;

	}

}