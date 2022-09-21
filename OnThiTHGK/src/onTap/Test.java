package onTap;

import java.util.Scanner;

public class Test {
	private static Scanner sc;

	public static void main(String[] args) {
		AlbumList ab1 = new AlbumList(20);
		ab1.themAB(new Album(111, "Aaaa", 10, 150000));
		ab1.themAB(new Album(333, "Cccc", 5, 100000));
		ab1.themAB(new Album(444, "Dddd", 25, 300000));
		ab1.themAB(new Album(222, "Bbbb", 15, 200000));
	
		System.out.println("******************DANH_SACH_ALBUM**************");
		System.out.println("1.DANH SACH Ablum:" + ab1);
		
		System.out.println("2.THEM Album");
		System.out.println("Nhap Ma Album can them:");
		sc = new Scanner(System.in);
		int maAB= sc.nextInt();
		System.out.println("Nhap tua can them:");
		sc = new Scanner(System.in);
		String tuaAB = sc.nextLine();
		System.out.println("Nhap So BaiHat Album:");
		int soBH= sc.nextInt();
		System.out.println("Nhap Gia Album:");
		double giaThanh= sc.nextDouble();
		ab1.themAB(new Album(maAB, tuaAB, soBH, giaThanh));
		System.out.println(ab1);
		
		
		System.out.println("3.SO LUONG Album:" + ab1.tinhSoLuong());
		System.out.println("4.TONG TAT CA GIA Album:" + ab1.tinhTongGia());
		System.out.println("5.Album CO GIA CAO NHAT: "+ ab1.timGiaCaoNhat());
		System.out.println("6.THONG TIN Album > 10 BAI HAT: \n"+ ab1.laySoAblumTren10BH());
		
		System.out.println("7.TIM MA");
		sc = new Scanner(System.in);
		System.out.println("Nhap Ma can tim:");
		int ma = sc.nextInt();
		boolean kq = ab1.timMa(ma);
		if(kq) 
			System.out.println("Tim Thay");
		else
			System.out.println("Khong tim Thay");
		
		System.out.println("8.TIM VI TRI MA");
		System.out.println("Nhap Ma Ablum can tim:");
		int maVT = sc.nextInt();
		int tim = ab1.timViTriMa(maVT);
		if (tim == -1) {
			System.out.println("Khong Tim thay vi tri tua");
		} else {
			System.out.println("Tim thay o vi tri:" + (tim + 1));
		}
		/**
		System.out.println("TIM TUA");
		System.out.println("Nhap Tua Ablum can tim:");
		sc = new Scanner(System.in);
		String tua = sc.nextLine();
		if(!ab1.timTua(tua))
			System.out.println("Tim thay");
		else
			System.out.println("KHONG Tim thay");
		**/
		System.out.println("9.SAP XEP GIAM DAN THEO GIA:");
		ab1.sapXepGiamTheoGia();
		System.out.println(ab1);
		
		System.out.println("10.SAP XEP TANG DAN THEO TUA:");
		ab1.sapXepTangTheoTua();
		System.out.println(ab1);
		
		/**
		int maAB;
		String tuaAB;
		int soBH = 0;
		double giaThanh;
		int ma;
		int chon;
		sc = new Scanner(System.in);
		do {
			System.out.println("*********************************");
			System.out.println("1.Xem Danh sach Album");
			System.out.println("2.Them Album");
			System.out.println("3.Xem So luong Album");
			System.out.println("4.Xem Tong Gia Thanh Ablum");
			System.out.println("5.Tim(In) CD co Gia cao nhat");
			System.out.println("6.Thong tin cac so luong CD tren 10 bai hat");
			System.out.println("7.Tim kiem ma CD");
			System.out.println("8.Tim kiem CD tra ve vi tri");
			System.out.println("9.Sap Xep CD Giam Dan Theo Gia");
			System.out.println("10.Sap xep CD Tang Dan Theo Tua");
			System.out.println("Nhap vao lua chon cua ban:");
			chon = sc.nextInt();
			System.out.println("*********************************");
			switch (chon) {
			case 1:
				System.out.println("Xem danh sach CD:");
				System.out.println(cd1);
				break;
			case 2:
				System.out.println("Nhap Ma bai hat:");
				maCD = sc.nextInt();
				System.out.println("Nhap Tua bai hat:");
				sc = new Scanner(System.in);
				tuaCD = sc.nextLine();
				System.out.println("Nhap gia thanh:");
				giaThanh = sc.nextDouble();
				cd1.themCD(new CD(maCD, tuaCD, soBaiHat, giaThanh));
				System.out.println(cd1);
				break;
			case 3:
				System.out.println("So Luong CD:" + cd1.tinhSoLuongCD());
				break;
			case 4:
				System.out.println("Tong Gia Thanh:" + cd1.tinhTongTien());
				break;
			case 5:
				System.out.println("CD co gia cao nhat la:" + cd1.timCDCoGiaCaoNhat());
				break;
			case 6:
				System.out.println("So luong CD tren 10 bai hat:");
				System.out.printf(cd1.laySoLuongCDten10BaiHat());
				break;
			case 7:
				System.out.println("Nhap ma CD can tim:");
				ma = sc.nextInt();
				boolean kq = cd1.timMa(ma);
				if (kq) {
					System.out.println("Tim thay");
				} else {
					System.out.println("Khong tim thay");
				}
				break;
			case 9:
				System.out.println("Sap xep Giam theo Gia:");
				cd1.sapXepGiamTheoGia();
				System.out.println(cd1);
				break;
			case 10:
				System.out.println("Sap xep Tang theo Tua:");
				cd1.sapXepTangTheoTua();
				System.out.println(cd1);
				break;
			
			default:
				System.out.println("Không có lua chon nào");
			}
		} while (chon != 0);
		**/
	}

}
