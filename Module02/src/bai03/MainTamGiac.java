package bai03;

/**
 * Ham kiem thu cho lop Tam Giac. Voi 5 hinh tam giac (2 hinh vi pham rang buoc,
 * 3 hinh lan luot la tam giac thuong, can, deu).
 * 
 * @author Hong Thuy
 *
 */
public class MainTamGiac {

	public static void main(String[] args) {
		TamGiac a[] = new TamGiac[5];
		// 2 hinh vi pham rang buoc
		a[0] = new TamGiac(-1, 6, 7);
		a[1] = new TamGiac(50, 6, 7);
		// 3 hinh lan luot la tam giac thuong, can, deu
		a[2] = new TamGiac(5, 6, 7);
		a[3] = new TamGiac(6, 7, 7);
		a[4] = new TamGiac(5, 5, 5);
		// Xuat mang
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println(TamGiac.tieude());
		System.out.println("---------------------------------------------------------------------------------");
		for (TamGiac tg : a) {
			System.out.println(tg);
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
}