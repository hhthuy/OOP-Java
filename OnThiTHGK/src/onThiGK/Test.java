package onThiGK;
import java.util.Scanner;

/**
 * Xây dựng lớp CDList để lưu danh sách CD(dùng mảng): Gồm các phương
 * thức: 
 * - 1.Khởi tao n phần tử cho lớp CDList. 
 * - 2.Thêm một CD vào ds,thêm thành công nếu kích thước mảng cho phép. 
 * - 3.Lấy toàn bộ thông tin CD có trong ds. 
 * - 4.Tính(Đếm) số lượng CD có trong ds. 
 * - 5.Tính tổng giá thành của các Album. 
 * - 6.Tìm(In) CD có tổng giá thành cao nhất. 
 * - 7.Lấy thông tin (Thống kê) số CD có trên 10 bài hát. 
 * - 8.Tìm kiếm theo mã CD.Nếu tìm thấy thì thông báo "Tìm thấy" và ngược lại thông báo "Không tìm thấy". 
 * - 9.Tìm kiếm theo tựa CD. Nếu tìm thấy trả về vị trí tìm thấy trong ds, nếu không tìm thấy trả về -1. 
 * - 10.Sắp xếp ds giảm dần theo giá thành. 
 * - 11.Sắp xếp ds tăng dần theo tựa.
 * 
 * @author Hồng Thủy.
 *
 */
public class Test {

	private static Scanner sc;

	public static void main(String[] args) {
		CDList cd1 = new CDList(10);
		cd1.themCD(new CD(111, "Aaaa", 5, 150000));
		cd1.themCD(new CD(333, "Cccc", 10, 100000));
		cd1.themCD(new CD(444, "Dddd", 15, 300000));
		cd1.themCD(new CD(222, "Bbbb", 20, 200000));

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
			System.out.println("2.Xem Danh sach CD");
			System.out.println("3.Xem So luong CD");
			System.out.println("4.Xem Tong Gia Thanh CD");
			System.out.println("5.Tim(In) CD co Gia cao nhat");
			System.out.println("6.Thong tin cac so luong CD > 10 bai hat");
			System.out.println("7.Tim kiem Ma CD");
			System.out.println("8.Tim kiem CD tra ve vi tri");
			System.out.println("9.Sap Xep CD Giam Dan Theo Gia");
			System.out.println("10.Sap xep CD Tang Dan Theo Tua");
			System.out.println("Nhap vao lua chon cua ban:");
			chon = sc.nextInt();
			System.out.println("*********************************");
			switch (chon) {
			case 1:
				System.out.println("Nhap Ma bai hat:");
				maCD = sc.nextInt();
				System.out.println("Nhap Tua bai hat:");
				sc = new Scanner(System.in);
				tuaCD = sc.nextLine();
				System.out.println("Nhap So BaiHat Album:");
		        soBaiHat = sc.nextInt();
				System.out.println("Nhap gia thanh:");
				giaThanh = sc.nextDouble();
				cd1.themCD(new CD(maCD, tuaCD, soBaiHat, giaThanh));
				System.out.println(cd1);
				break;
			case 2:
				System.out.println("Xem danh sach CD:");
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
		     	System.out.println("So luong CD tren 10 bai hat: \n"+cd1.laySoLuongCDtren10BaiHat());
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
			case 8:
				System.out.println("Nhap ma CD can tim:");
				ma = sc.nextInt();
				int tim = cd1.timViTriMa(ma);
				if (tim == -1) {
					System.out.println("khong Tim thay");
				} else {
					System.out.println("Tim thay o vi tri:" + (tim + 1));
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
		/**
		
		 System.out.println("******************DANH_SACH_ALBUM**************");
		System.out.println("1.DANH SACH CD:\n" + cd1);
		
		System.out.println("2.THEM CD");
		System.out.println("Nhap Ma CD can them:");
		sc = new Scanner(System.in);
		int maCD= sc.nextInt();
		System.out.println("Nhap tua can them:");
		sc = new Scanner(System.in);
		String tuaCD = sc.nextLine();
		System.out.println("Nhap So BaiHat Album:");
		int soBH= sc.nextInt();
		System.out.println("Nhap Gia Album:");
		double giaThanh= sc.nextDouble();
		cd1.themCD(new CD(maCD, tuaCD, soBH, giaThanh));
		System.out.println(cd1);
		
		
		System.out.println("3.SO LUONG Album:" + cd1.tinhSoLuongCD());
		System.out.println("4.TONG TAT CA GIA Album:" + cd1.tinhTongTien());
		System.out.println("5.Album CO GIA CAO NHAT: "+ cd1.timCDCoGiaCaoNhat());
		System.out.println("6.THONG TIN Album > 10 BAI HAT: \n"+ cd1.laySoLuongCDten10BaiHat());
		
		System.out.println("7.TIM MA");
		sc = new Scanner(System.in);
		System.out.println("Nhap Ma can tim:");
		int ma = sc.nextInt();
		boolean kq = cd1.timMa(ma);
		if(kq) 
			System.out.println("Tim Thay");
		else
			System.out.println("Khong tim Thay");
		
		System.out.println("8.TIM VI TRI MA");
		System.out.println("Nhap Ma Ablum can tim:");
		int maVT = sc.nextInt();
		int tim = cd1.timViTriMa(maVT);
		if (tim == -1) {
			System.out.println("Khong Tim thay vi tri tua");
		} else {
			System.out.println("Tim thay o vi tri:" + (tim + 1));
		}
		
		/**System.out.println("TIM TUA");
		System.out.println("Nhap Tua Ablum can tim:");
		sc = new Scanner(System.in);
		String tua = sc.nextLine();
		if(!ab1.timTua(tua))
			System.out.println("Tim thay");
		else
			System.out.println("KHONG Tim thay");/**
			
		System.out.println("9.SAP XEP GIAM DAN THEO GIA:");
		cd1.sapXepGiamTheoGia();
		System.out.println(cd1);
		
		System.out.println("10.SAP XEP TANG DAN THEO TUA:");
		cd1.sapXepTangTheoTua();
		System.out.println(cd1);
		**/
		
	}
}
