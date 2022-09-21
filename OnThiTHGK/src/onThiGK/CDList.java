package onThiGK;

public class CDList {
	// Cac thuoc tinh
	private CD[] cds;
	private int count;// so CD

	// Cac phuong thuc
	/**
	 * 1.Khởi tao n phần tử cho lớp CDlist.
	 */
	public CDList(int n) {
		cds = new CD[n];
		count = 0;
	}	
	/**
	 * 2.Thêm một CD vào ds,thêm thành công nếu kích thước mảng cho phép. 
	 */
	public boolean themCD(CD cd) {
		if (count < cds.length) {
			cds[count++] = cd;
			return true;
		}
		return false;
	}
	/**
	 * 3.Lấy toàn bộ thông tin CD có trong ds
	 */
	@Override
	public String toString() {
		String s = "";
		s += " Ma_CD \t" + " Tua_CD\t" + "  So_Bai\t" + "Gia\n";
		for (int i = 0; i < count; i++) {
			s += cds[i].toString();
		}
		return s;
	}
	/**
	 * 4.Tính số lượng CD có trong ds.
	 */
	public int tinhSoLuongCD() {
		return count;
	}
	/**
	 * 5.Tính tổng giá thành của các CD.
	 */
	public double tinhTongTien() {
		double tien = 0;
		for (int i = 0; i < count; i++)
			tien += cds[i].getGiaThanh();
		return tien;
	}
	/**
	 * 6.In CD có tổng giá thành cao nhất.
	 */
	public double timCDCoGiaCaoNhat() {
		double max = cds[0].getGiaThanh();
		for (int i = 0; i < count; i++) {
			if (cds[i].getGiaThanh() > max) {
				max = (int) cds[i].getGiaThanh();
			}
		}
		return max;
	}
	/**
	 * 7.Lấy thông tin số CD có trên 10 bài hát.
	 */
	public String laySoLuongCDtren10BaiHat() {
		String s = "";
		for (int i = 0; i < tinhSoLuongCD(); i++) {
			if (cds[i].getSoBaiHat() >= 10) {
				s += cds[i].toString();
			}
		}
		if (!s.equals(""))
			return s;
		return "Khong co CD nao lam tren 10 Bai Hat";
	}
	/**
	 *  8.Tìm kiếm theo mã CD.Nếu tìm thấy thì thông báo "Tìm thấy" và ngược lại thông báo "Không tìm thấy". 
	 */
	public boolean timMa(int ma) {
		for (int i = 0; i < count; i++) {
			if (cds[i].getMaCD() == ma) {
				System.out.println(cds[i].toString());
				return true;
			}
		}
		return false;
	}
	/**
	public boolean timTua (String tua) {
		for (int i =0; i< count; i++) {
			if (cds[i].equals(tua)) {
				return true;
				
			}
		}return false;
	}
	**/
	/**
	 * 9.Tìm kiếm theo ma CD. Nếu tìm thấy trả về vị trí tìm thấy trong ds, nếu không tìm thấy trả về -1. 
	 */
	public int timViTriMa(int ma) {
		for (int i = 0; i < count; i++) {
			if (cds[i].getMaCD() == ma) {
				System.out.println(cds[i].toString());
				return i;
			}
		}
		return -1;
	}
	/**
	 * 10.Sắp xếp ds giảm dần theo giá thành. 
	 */
	public void sapXepGiamTheoGia() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (cds[i].getGiaThanh() < cds[j].getGiaThanh()) {
					CD temp = cds[i];
					cds[i] = cds[j];
					cds[j] = temp;
				}
			}
		}
	}
	/**
	 * 11.Sắp xếp ds tăng dần theo tựa.
	 */
	public void sapXepTangTheoTua() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (cds[i].getTuaCD().compareTo(cds[j].getTuaCD()) > 0) {
					CD temp = cds[i];
					cds[i] = cds[j];
					cds[j] = temp;
				}
			}
		}
	}

	
	
}
