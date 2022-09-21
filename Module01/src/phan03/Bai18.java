package phan03;

import java.util.Scanner;

/**
 * VCT Nhap vao so nguyen n va thuc hien: Xuat ra man hinh n so dau tien cua
 * chuoi Fibonaci
 * 
 * @author HP
 *
 */
public class Bai18 {
	private static Scanner nhap;
	private static int n;

	
	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n:");
		n = nhap.nextInt();
		System.out.printf("%d so dau tien cua chuoi Fibonaci la: \n",n);
		for(int i = 1; i < n; i++) {
			System.out.println( dayFibo(i));
		}
	}
public static int dayFibo(int n){
		if(n == 1 || n == 2) {
			return 1;
		}else
			{return dayFibo(n - 1) + dayFibo(n - 2);}
}
	
}
