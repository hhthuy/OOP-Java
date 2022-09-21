package onThiCKOOP;

import java.util.Scanner;

public class Test {
	private static Scanner sc;

	public static void main(String[] args) {
		RoomCategory dm = new RoomCategory();
		dm.addRoom(new PhongThiNghiem("101", "T1", 100, 2, "Y", 30, true));
		dm.addRoom(new PhongThiNghiem("202", "T2", 200, 3, "Duoc", 40, true));
		dm.addRoom(new PhongMayTinh("321", "M1",150,10,40));
		dm.addRoom(new PhongMayTinh("123", "M2",120,9,35));
		dm.addRoom(new PhongLyThuyet("999", "L1", 200, 15, true));
		dm.addRoom(new PhongLyThuyet("666", "L2", 180, 12, false));
		System.out.println(dm);
		System.out.println("4.Sap xep danh sach tang dan theo day nha ");
		dm.orderByRoomLine();
		System.out.println(dm);
		System.out.println("5.Sap xep danh sach tang dan theo dien tich ");
		dm.orderByRoomArea();
		System.out.println(dm);
		System.out.println("6.Cap nhat so bomg den khi biet ma phong");
		System.out.println("Nhap ma can sua cho bong den:");
		sc = new Scanner(System.in);
		String maCanSua = sc.nextLine();
		System.out.println("Nhap so bong den moi:");
		int soBongDenMoi = sc.nextInt();
		if(dm.capNhatSoBongDenTheoMa(maCanSua, soBongDenMoi)) {
			System.out.println("Danh sach sau khi cap nhat:");
			System.out.println(dm);
		}else {
			System.out.println("KHong tim thay ma can sua so bong den");
		}
		System.out.println("7.Xoa mot phong nao do khi biet ma phong ( xac minh rang co chan chan xoa khong) ");
		System.out.println("Nhap ma cua hang hoa can xoa");
		String maCanXoa = sc.nextLine();
		if(dm.deleteRoomByRoomNumber(maCanXoa)) {
			System.out.println("Danh sach sau khi xoa");
			System.out.println(dm);
		}else {
			System.out.println("Khgong tim thay ma can xoa");
		}
		System.out.println("8.Lay toan bo thong tin hang hoa ");
		System.out.println(dm);
		System.out.println("9.Lay tung loai thong tin hang hoa ");
		System.out.println(dm.getPhongLyThuyet());
		System.out.println("10.Lay danh sach phong hoc co  60 may. ");
		dm.getPhongMayTinhCo60May();
		System.out.println("11.Tinh tong suc chua cua phong thi nghiem: " + dm.getTongPhongHoc());
		System.out.println("12.Tim so bong den co so long lon nhat: "+dm.getPhongCoBongDenMax());
		System.out.println("13.Tinh TBC so bong den cua phong may tinh: "+dm.getTBCSoMayTinh());
		System.out.println("14.Dem so luong bong den trong phong: "+dm.getDemSoBongDen());
	}
}
