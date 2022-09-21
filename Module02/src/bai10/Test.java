package bai10;

import java.util.Scanner;

/**
 * Ham kiem thu cho lop CD
 * @author Hong Thuy
 *
 */
public class Test {

	
	private static Scanner sc;

	public static void main(String[] args) {
		CDList cd1 = new CDList(10);
		cd1.themCD(new CD(111, "Aaaa", 5, 150000));
		cd1.themCD(new CD(333, "Cccc", 10,100000));
		cd1.themCD(new CD(444, "Dddd", 15,300000));
		cd1.themCD(new CD(222, "Bbbb", 20,200000));
		
		int maCD;
	    String tuaCD;
		int soBaiHat = 0;
		double giaThanh;
		int ma;
		int chon;
		sc = new Scanner(System.in);
		do {
			System.out.println("*********************************");
			System.out.println("1.Them CD");
			System.out.println("2.Xem So luong CD");
			System.out.println("3.Xem Tong Gia Thanh CD");
			System.out.println("4.Tim kiem CD");
			System.out.println("5.Sap Xep CD Giam Dan Theo Gia");
			System.out.println("6.Sap xep CD Tang Dan Theo Tua");
			System.out.println("7.Xem Danh sach CD");
			System.out.println("Nhap vao lua chon cua ban:");
			chon = sc.nextInt();
			System.out.println("*********************************");
			switch(chon){
				case 1:
					System.out.println("Nhap Ma bai hat:");
					maCD=sc.nextInt();
					System.out.println("Nhap Tua bai hat:");
					sc = new Scanner(System.in);
					tuaCD=sc.nextLine();
					System.out.println("Nhap gia thanh:");
					giaThanh=sc.nextDouble();
					cd1.themCD(new CD(maCD, tuaCD, soBaiHat, giaThanh));
					break;
				case 2:
					System.out.println("So Luong CD:" + cd1.tinhSoLuongCD());
					break;
				case 3:
					System.out.println("Tong Gia Thanh:"+cd1.tinhTongTien());
					break;
				case 4:
					System.out.println("Nhap ma CD can tim:");
					ma =  sc.nextInt();
					boolean kq = cd1.timMa(ma);
					if(kq) {
						System.out.println("Tim thay");
					}else {
						System.out.println("Khong tim thay");
					}
					break;
				case 5: 
					System.out.println("Sap xep Giam theo Gia:");
					cd1.sapXepGiamTheoGia();
					System.out.println(cd1);
					break;
				case 6:
					System.out.println("Sap xep Tang theo Tua:");
					cd1.sapXepTangTheoTua();;
					System.out.println(cd1);
					break;
				case 7:
					System.out.println("Xem danh sach CD:");
					System.out.println(cd1);
					break;
				default:
					System.out.println("Không có lua chon nào");	
					}		
		}while(chon != 0);
		}
}
