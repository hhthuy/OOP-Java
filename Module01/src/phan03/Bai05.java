package phan03;

import java.util.Scanner;

/**
 * VCT tim USCLN cua 2 so nhap vao.
 * @author HongThuy
 *
 */
public class Bai05 {
	
	private static Scanner nhap;

	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen duong a: ");
		int a = nhap.nextInt();
		System.out.println("Nhap vao so nguyen duong b: ");
		int b = nhap.nextInt();
		System.out.println("UCLN la: " + timUCLN(a,b));
		
	}
	public static int timUCLN(int a, int b) {
		if (b ==0) {
			return a;
		}return timUCLN(b, a%b);
	}
}
