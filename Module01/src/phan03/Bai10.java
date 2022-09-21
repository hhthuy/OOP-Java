package phan03;

import java.util.Scanner;

public class Bai10 {
	private static Scanner nhap;

	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap 1 chuoi: ");
		String str = nhap.nextLine();
		String[] kq = tachChuoi(str);
		for(String w: kq) {
			System.out.println(w);
		}
	}

	private static String[] tachChuoi(String str) {
		String[] words = str.split("\\s");
		return words;
	}
}
