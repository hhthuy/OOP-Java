package bai08Arr.copy;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	private static Scanner sc;

	public static void main(String[] agrs) throws Exception {
		DanhMucHangHoa ds = new DanhMucHangHoa();
		ds.them(new HangThucPham("111", "banh my", 15000, 12, "viet nam", LocalDate.of(2020, 10, 30),
				LocalDate.of(2020, 10, 31)));
		ds.them(new HangThucPham("222", "keo", 20000, 60, "hao hao", LocalDate.of(2019, 11, 30),
				LocalDate.of(2020, 11, 30)));
		ds.them(new HangSanhSu("666", "chen su", 12000, 10, "LS", LocalDate.of(2020, 10, 20)));
		ds.them(new HangSanhSu("777", "ly su", 13000, 2, "CS", LocalDate.of(2020, 11, 20)));
		ds.them(new HangDienMay("333", "ti vi", 300000, 2, 30, 150));
		ds.them(new HangDienMay("444", "may giac", 500000, 6, 20, 100));

		sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Them Hang hoa");
			System.out.println("2.Lay thong tin toan bo hang hoa");
			System.out.println("3.Lay thong tin tung loai hang hoa");
			System.out.println("4.Tim kiem hang hoa khi biet ma hang");
			System.out.println("5.Sap xep hang hoa theo ten tang dan");
			System.out.println("6.Sap xep hang hoa theo so luong ton giam dan");
			System.out.println("7.Laythong tin cac hang thuc pham kho ban");
			System.out.println("8.Xoa hang hoa khi biet ma hang");
			System.out.println("9.Sua thong tin don gia khi bet ma hang");
			System.out.println("0.Thoat");
			System.out.println("Chon chuc nang:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				int loai = 0;
				do {
					System.out.println("Chon loai hangcan them");
					System.out.println("11.Them Hang Dien may");
					System.out.println("12.Them Hang Thuc pham");
					System.out.println("13.Them Hang sanh su");
					System.out.println("14.Dung them");
					loai = sc.nextInt();
					System.out.println("Nhap ma hang");
					sc = new Scanner(System.in);
					String maHang = sc.nextLine();
					System.out.println("Nhap ten hang");
					sc = new Scanner(System.in);
					String tenHang = sc.nextLine();
					System.out.println("Nhap don gia hang");
					sc = new Scanner(System.in);
					double donGia = sc.nextDouble();
					System.out.println("Nhap so luong ton");
					sc = new Scanner(System.in);
					int soLuongTon = sc.nextInt();
					switch (loai) {
					case 11:
						System.out.println("Nhap thoi gian bao hanh (thang):");
						int thoigianBH = sc.nextInt();
						System.out.println("Nhap cong suat");
						double congSuat = sc.nextDouble();
						if (ds.them(new HangDienMay(maHang, tenHang, donGia, soLuongTon, thoigianBH, congSuat))) {
							System.out.println("Danh sach sau khi them");
							System.out.println(ds.toString());
						} else {
							System.out.println("Them khong thanh cong");
						}
						break;
					case 12:
						System.out.println("Nhap Nha cung cap:");
						sc = new Scanner(System.in);
						String nhaCungCap = sc.nextLine();
						System.out.println("Nhap ngay san xuat");
						sc = new Scanner(System.in);
						int dayOfMonth1 = sc.nextInt();
						System.out.println("Nhap thang san xuat");
						sc = new Scanner(System.in);
						int month1 = sc.nextInt();
						System.out.println("Nhap nam san xuat");
						sc = new Scanner(System.in);
						int year1 = sc.nextInt();
						System.out.println("Nhap ngay het han");
						sc = new Scanner(System.in);
						int dayOfMonth2 = sc.nextInt();
						System.out.println("Nhap thang het han");
						sc = new Scanner(System.in);
						int month2 = sc.nextInt();
						System.out.println("Nhap nam het han");
						sc = new Scanner(System.in);
						int year2 = sc.nextInt();
						if (ds.them(new HangThucPham(maHang, tenHang, donGia, soLuongTon, nhaCungCap,
								LocalDate.of(year1, month1, dayOfMonth1), LocalDate.of(year2, month2, dayOfMonth2)))) {
							System.out.println("Danh sach sau khi them");
							System.out.println(ds);
						} else {
							System.out.println("Them khong thanh cong");
						}
						break;
					case 13:
						System.out.println("Nhap ten nha san xuat:");
						String nhaSanXuat = sc.nextLine();
						System.out.println("Nhap ngay nhap kho");
						int dayOfMonth = sc.nextInt();
						System.out.println("Nhap thang nhap kho");
						int month = sc.nextInt();
						System.out.println("Nhap nam nhapkho");
						int year = sc.nextInt();
						if (ds.them(new HangSanhSu(maHang, tenHang, donGia, soLuongTon, nhaSanXuat,
								LocalDate.of(year, month, dayOfMonth)))) {
							System.out.println("Danh sach sau khi them");
							System.out.println(ds);
						} else {
							System.out.println("Them khong thanh cong");
						}break;
					default:
						System.out.println("Khong tim thay loai hang can them");
						break;
					}
				} while (loai != 0);
			case 2:
				System.out.println("LAY THONG TIN TOAN BO DS");
				System.out.println(ds);
				break;
			case 3:
				System.out.println("-----HANG DIEN MAY-----");
				System.out.println(ds.getHangDienMay());
				System.out.println("-----HANG SANH SU-----");
				System.out.println(ds.getHangSanhSu());
				System.out.println("-----HANG THUC PHAM-----");
				System.out.println(ds.getHangThucPham());
				break;
			case 4:
				System.out.println("Nhap ma can tim");
				sc = new Scanner(System.in);
				String maTim = sc.nextLine();
				if (ds.timKiemMa(maTim) != null) {
					System.out.println("Tim thay");
				} else {
					System.out.println("Khong tim thay");
				}
			case 5:
				ds.sapXepTenTangDan();
				System.out.println(ds);
				break;
			case 6:
				ds.sapXepSoLuongTonGiamDan();
				System.out.println(ds);
				break;
			case 7:
				System.out.println(HangHoa.getTieuDe());
				System.out.println(ds.getThongTinThucPhamKhoBan());
				break;
			case 8:
				 System.out.println("Nhap ma can xoa"); 
				 sc = new Scanner(System.in); 
				 String maCanXoa= sc.nextLine(); 
				 if(ds.xoaHangHoaTheoMa(maCanXoa)) {
				 System.out.println("Danhsach sau khi xoa");
				 System.out.println(ds); 
				 }else {
					 System.out.println("Khong tim thay ma can xoa"); 
				 }break;
				 
			case 9:
				System.out.println("Nhap ma can sua");
				sc = new Scanner(System.in);
				String maCanSua = sc.nextLine();
				System.out.println("Nhap don gia moi");
				sc = new Scanner(System.in);
				double donGiaMoi = sc.nextDouble();
				if (ds.suaDonGiaKhiBietMaHang(maCanSua, donGiaMoi)) {
					System.out.println("Danhsach sau khi sua");
					System.out.println(ds);
				} else {
					System.out.println("Khong tim thay ma can sua");
				}
				break;
			default:
				System.out.println("Khong co chuc nang nao");
				break;
			}

		} while (ch != 0);
	}
}
