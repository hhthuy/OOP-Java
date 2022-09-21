package bai05;
/**
 * Hma kiem thu cho lop Hang Thuc Pham
 */
import java.time.LocalDate;

public class MainHangThucPham {

	public static void main(String[] args) throws Exception {
		try {
			HangThucPham htp1 = new HangThucPham("001", "Gao", 100000, LocalDate.of(2019, 8, 12),
					LocalDate.of(2020, 5, 1));
			HangThucPham htp2 = new HangThucPham("002", "Mi", 50000, LocalDate.of(2018, 3, 1),
					LocalDate.of(2019, 9, 1));
			HangThucPham htp3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.of(2017, 3, 1),
					LocalDate.of(2021, 3, 1));
			System.out.println(
					"------------------------------------------------------------------------------");
			System.out.printf("| %-8s| %-10s| %-12s| %-10s| %-10s| %-15s|\n", "Ma_Hang", "Ten_Hang", "Don_Gia", "NSX",
					"NHH", "Ghi_Chu");
			System.out.println(
					"------------------------------------------------------------------------------");
			System.out.println(htp1.toString());
			System.out.println(htp2.toString());
			System.out.println(htp3.toString());
			System.out.println(
					"------------------------------------------------------------------------------");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}