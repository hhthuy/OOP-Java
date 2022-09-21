package bai06;

import java.util.Scanner;


public class Test {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		DanhMucPhongHoc dm = new DanhMucPhongHoc();
		dm.themPhongHoc(new PhongLyThuyet("001", "B01", 70, 7, true));
		dm.themPhongHoc(new PhongLyThuyet("002", "A02", 60, 6, false));
		dm.themPhongHoc(new PhongMayTinh("111", "M03", 100, 10, 70));
		dm.themPhongHoc(new PhongMayTinh("222", "N04", 90, 9, 50));
		dm.themPhongHoc(new PhongThiNghiem("101", "F05", 150, 12, "Hoa hoc", 10, true));
		dm.themPhongHoc(new PhongThiNghiem("102", "E06", 120, 15, "Dien tu", 40, true));
		sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("0. Thoat");
			System.out.println("1. Them ");
			System.out.println("2. Lay thong tin toan bo");
			System.out.println("3. Lay thong tin cac phong hoc dat chuan");
			System.out.println("4. Sap xep tang dan theo day nha");
			System.out.println("5. Sap xep giam dan theo dien tich");
			System.out.println("6. Sap xep  tang dan theo so bong den");
			System.out.println("7. Xoa phog hoc khi biet ma phong");
			System.out.println("8. Lay thong tin phong > 60may");
			System.out.println("9. Tongsophong hoc");
			System.out.println("10.In Toan bo phong hoc ly thuyet co may chieu");
			System.out.println("11.Tong so bong den phong ly thuyet");
			System.out.println("12.Tim kiem phong hoc khi biet ma phong");
			System.out.println("Chọn chức năng:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				int loai = 0;
				do {
					System.out.println("Chon loai phong can them");
					System.out.println("11.Them Phong ly thuyet");
					System.out.println("12.Them Phong may tinh");
					System.out.println("13.Them Phong thi nghiem");
					loai = sc.nextInt();
					System.out.println("Nhap ma phong");
					sc = new Scanner(System.in);
					String maPhong = sc.nextLine();
					System.out.println("Nhap day nha");
					sc = new Scanner(System.in);
					String dayNha = sc.nextLine();
					System.out.println("Nhap dien tich");
					sc = new Scanner(System.in);
					int dienTich = sc.nextInt();
					System.out.println("Nhap so bong den");
					sc = new Scanner(System.in);
					int soBongDen = sc.nextInt();
					System.out.println("Nhap may chieu (true/false)");
					sc = new Scanner(System.in);
					boolean coMayChieu = sc.hasNextBoolean();
					switch (loai) {
					case 11:
						if (dm.themPhongHoc(new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu))) {
							System.out.println("Danh sach sau khi them");
							dm.xuatDanhSachPhongHoc();
						} else {
							System.out.println("Them khong thanh cong");
						}
						break;
					case 12:
						System.out.println("Nhap so may tinh");
						int soMayTinh = sc.nextInt();
						if (dm.themPhongHoc(new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh))) {
							System.out.println("Danh sach sau khi them");
							dm.xuatDanhSachPhongHoc();
						} else {
							System.out.println("Them khong thanh cong");
						}
						break;
					case 13:
						System.out.println("Nhap so chuyenNganh");
						sc = new Scanner(System.in);
						String chuyenNganh = sc.nextLine();
						System.out.println("Nhap so suc chua");
						sc = new Scanner(System.in);
						float sucChua = sc.nextFloat();
						System.out.println("Nhập có bồn rửa không true/false");
						boolean coBonRua = sc.nextBoolean();
						if (dm.themPhongHoc(new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh,
								sucChua, coBonRua))) {
							System.out.println("Danh sach sau khi them");
							//System.out.println(dm.getPhongHoc());

						}else {
							System.out.println("Them khong thanh cong");
						}
					}
				} while (loai != 0);
				break;
			case 2:
				System.out.println(dm);
				break;
			case 3:
				dm.layPhongDatChuan();
				break;
			case 4:
			    dm.sapXepDayNhaTangDan();
			    System.out.println(dm);
				break;
			case 5:
				dm.sapXepDienTichGiamDan();
				System.out.println(dm);
				break;
			case 6:
				dm.sapXepSoBongDenTangDan();
				System.out.println(dm);
				break;
			case 7:
				 System.out.println("Nhap ma can xoa"); 
				 sc = new Scanner(System.in); 
				 String maCanXoa= sc.nextLine(); 
				 if(dm.xoaPhongHoc(maCanXoa)) {
				 System.out.println("Danhsach sau khi xoa");
				 System.out.println(dm); 
				 }else {
					 System.out.println("Khong tim thay ma can xoa"); 
				 }break;
			case 8:
				dm.getPhongMayTinhTren60();
				break;
			case 9:
				System.out.println("Tong so phong hoc:"+ dm.tongSoPhongHoc() );
				break;
			case 10:
				dm.xuatDSPhongLyThuyetCoMayChieu();
				break;	
			case 11: 
				System.out.println("Tong so bong den phong ly thuyet:"+ dm.getTongBongDenPhongLyThuyet());
			case 12:
				System.out.println("Nhap ma can tim");
				sc = new Scanner(System.in);
				String maTim = sc.nextLine();
				PhongHoc sTim = dm.timKiemMa(maTim);
				if (sTim != null) {
					System.out.println("Tim thay");
					System.out.println(sTim);
				} else {
					System.out.println("Khong tim thay");
				}
			}
			
		} while (ch != 0);
	}
}
