package phan03;

import java.util.Scanner;

/**
 * VCT in ra tong 1+3+5+...+n (n chan), 2+4+6+...+n (n le).
 * 
 * @author HongThuy
 *
 */
public class Bai03 {

	private static Scanner nhap;

	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong n: ");
		int n = nhap.nextInt();
		System.out.printf("Tong %d la: %d", n, tinhTong(n));

	}

	public static int tinhTong(int n) {
		int sum = 0;
		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				sum += i;
			}
			return sum;
		} else {
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
			return sum;

		}

	}

}
