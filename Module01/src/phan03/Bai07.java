package phan03;

import java.util.Scanner;

/**
 * VCT Tinh tong cac so nguyen to nho hon n
 * @author HP
 *
 */
public class Bai07 {
	private static Scanner nhap;
	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap vao mot so : ");
		int n = nhap.nextInt();
		System.out.printf("Tong cua chu so nguyen to nho hon %d la: %d \n ",n, tinhTong(n));
		
		
	}
	
	public static boolean kiemtraNguyenTo(int n) {
		if(n < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int tinhTong(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++){
			if(kiemtraNguyenTo(i)) {
				System.out.printf("Cac so nguyen to nho hon %d la: %d \n", n , i);
				sum += i;	
			}
		}return sum;
	}
	
}
