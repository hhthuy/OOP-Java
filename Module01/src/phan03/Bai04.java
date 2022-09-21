package phan03;

import java.util.Scanner;

/**
 * VCT Giai phuong trinh bac 1.
 * @author HongThuy
 *
 */
public class Bai04 {
	private static Scanner nhap;

	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap vao he so a: ");
		int a = nhap.nextInt();
		System.out.println("Nhap vao he so b: ");
		int b = nhap.nextInt();
		Bai04.giaiPhuongTrinhBac1(a, b);
		
	}
	public static void giaiPhuongTrinhBac1(int a, int b) {
		if(a == 0) {
			if(b ==0) {
				System.out.println("PT VSN");
			}else {
				System.out.println("PT VN");
			}
		}else {
			System.out.println("PT co 1 nghiem duy nhat x =  " + (float)(-b / a));
		}
	}
}
