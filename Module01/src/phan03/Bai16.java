package phan03;
/**
 * VCT doc mot gia tri nguyen tu ban phim va in ra so do la chan, le hoac zero
 */
import java.util.Scanner;

public class Bai16 {

	private static Scanner nhap;

	public static void main(String[] args) {
		nhap = new Scanner(System.in);
		System.out.println("Nhap vao mot so can doc: ");
		int n = nhap.nextInt();
		if(n == 0) {
			System.out.printf("%d la Zero", n);
		}else if(n%2 != 0) {
			System.out.printf("%d la so le ",n);
		}else {
			System.out.printf("%d La so chan", n);
		}
	}

}
