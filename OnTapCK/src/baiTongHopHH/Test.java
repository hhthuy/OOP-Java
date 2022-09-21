package baiTongHopHH;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	private static Scanner sc;

	public static void main(String[] args) {
		DanhMucHangHoa dm = new DanhMucHangHoa();
		dm.them(new HangDienMay("123", "May giac", 1200000, 10, 13, 100));
		dm.them(new HangDienMay("456", "Ti vi", 1500000, 5, 7, 150));
		dm.them(new HangSanhSu("555", "Binh su", 50000, 22, "Thien Long", LocalDate.of(2020, 10, 9)));
		dm.them(new HangSanhSu("999", "Chen su", 30000, 30, "Thien Su", LocalDate.of(2020, 1, 30)));
		dm.them(new HangThucPham("303", "Mi", 3500, 65, "Hao Hao", LocalDate.of(2019, 9, 20), LocalDate.of(2020, 9, 20)));
		dm.them(new HangThucPham("202", "Gao", 3500, 50, "Lua Lua", LocalDate.of(2019, 5, 10), LocalDate.of(2020, 5, 10)));
		
		System.out.println("___1. Lay thong tin tung loai HangHoa");
		System.out.println(dm.getHangDienMay());
		System.out.println(dm.getHangSanhSu());
		System.out.println(dm.getHangThucPham());
		System.out.println("___2. Lay toan bo thong tin HangHoa");
		System.out.println(dm);
		System.out.println("___3. Lay thong tin HaangThucPham kho ban");
		System.out.println(dm.getThongTinThucPhamKhoBan());
		System.out.println("___4. Lay ds cac HangDienMay < 12 thang");
		dm.getHangDienMay12Thang();
		System.out.println("___5. Sap xep HangHoa theo Ten tang dan");
		dm.sapXepTheoTenTangDan();
		System.out.println(dm);
		System.out.println("___6. Sap xep theo SLTon giam dan");
		dm.sapXepTheoSLTonGiamdan();
		System.out.println(dm);
		System.out.println("___7.1. Tim kiem HangHoa khi biet maHang");
		System.out.println("Nhap ma Hang can tim");
		sc = new Scanner(System.in);
		String maCanTim = sc.nextLine();
		if (dm.timKiemMa(maCanTim) != null) {
			System.out.println("Tim thay");
			System.out.println(dm.timKiemMa(maCanTim));
		} else {
			System.out.println("Khong tim thay");
		}
		System.out.println("___7.2. Tim kiem HangHoa khi biet maHang.Tra ve vi tri tim thay");
		System.out.println("Nhap ma Hang can tim:");
		String maCanTimViTri = sc.nextLine();
		int tim = dm.timMaCoViTri(maCanTimViTri);
		if (tim == -1) {
			System.out.println("khong Tim thay");
		} else {
			System.out.println("Tim thay Ma o vi tri thu :" + (tim + 1));
		}
		System.out.println("___8.Xoa HangHoa khi biet ma hang___");
		System.out.println("Nhap ma can xoa"); 
		 sc = new Scanner(System.in); 
		 String maCanXoa= sc.nextLine(); 
		 if(dm.xoaHangHoaTheoMa(maCanXoa)) {
		 System.out.println("Danhsach sau khi xoa");
		 System.out.println(dm); 
		 }else {
			 System.out.println("Khong tim thay ma can xoa"); 
		 }
		System.out.println("___9.Sua thong tin don gia cua HangHoa khi biet ma hang");
		System.out.println("Nhap ma can sua");
		sc = new Scanner(System.in);
		String maCanSua = sc.nextLine();
		System.out.println("Nhap don gia moi");
		sc = new Scanner(System.in);
		double donGiaMoi = sc.nextDouble();
		if (dm.suaDonGiaTheoMaHang(maCanSua, donGiaMoi)) {
			System.out.println("Danhsach sau khi sua");
			System.out.println(dm);
		} else {
			System.out.println("Khong tim thay ma can sua");
		}
		System.out.println("___10. Tong so HaangHoa co trong ds: " + dm.getTongSLHangHoa());
		System.out.println("___11. Tinh Tong so SLTon trong HangDienMay: "+ dm.getTongSLTonHangDienMay());
		System.out.println("___12. Tinh TBC CongSuat cua HangDienMay:"+ dm.getTBCDonGiaHangDienMay());
		System.out.println("___13. Xuat ra cac HangThucPham co Nhacungcap K:");
		dm.xuatHangTPCuaNhaCungCapK();
		System.out.println("___14. Xuat ra cac HangThucPham co Ngaysanxuat thang 9/2019: ");
		dm.xuatHHThang9Nam2019();
		System.out.println("___15. Tim DonGia co SLTon Lon Nhat: " + dm.timHHCoGiaCaoNhat());
	
	}
}
