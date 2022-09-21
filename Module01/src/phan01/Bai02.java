package phan01;

import java.util.Scanner;

/**
 * VCT Nhap vao ten cua minh va xuat ra man hinh "Hello +Ten".
 * @author HongThuy
 *
 */
public class Bai02 {
	private static Scanner Nhap;
	public static void main(String[] agrs) {
		Nhap = new Scanner(System.in);		
		System.out.println("Moi ban nhap vao ten: ");
		String Ten = Nhap.nextLine();
		System.out.println("Hello " + Ten);
	}
}
