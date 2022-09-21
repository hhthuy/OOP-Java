package onTap;

/**
 * Xây dựng lớp AlbumList để lưu danh sách Album(dùng mảng): Gồm các phương
 * thức: 
 * - 1.Khởi tao n phần tử cho lớp AlbumList. 
 * - 2.Thêm một Album vào ds,thêm thành công nếu kích thước mảng cho phép. 
 * - 3.Lấy toàn bộ thông tin Album có trong ds. 
 * - 4.Tính(Đếm) số lượng Album có trong ds. 
 * - 5.Tính tổng giá thành của các Album. 
 * - 6.Tìm(In) Album có tổng giá thành cao nhất. 
 * - 7.Lấy thông tin (Thống kê) số Album có trên 10 bài hát. 
 * - 8.Tìm kiếm theo mã Album.Nếu tìm thấy thì thông báo "Tìm thấy" và ngược lại thông báo "Không tìm thấy". 
 * - 9.Tìm kiếm theo tựa Album. Nếu tìm thấy trả về vị trí tìm thấy trong ds, nếu không tìm thấy trả về -1. 
 * - 10.Sắp xếp ds giảm dần theo giá thành. 
 * - 11.Sắp xếp ds tăng dần theo tựa.
 * 
 * @author Hồng Thủy.
 *
 */
public class AlbumList {
	// Các thuộc tính
	private Album[] dsab;
	private int count;

	// Các phương thức
	/**
	 * 1.Khởi tao n phần tử cho lớp Albumlist.
	 */
	public AlbumList(int n) {
		dsab = new Album[n];
		count = 0;
	}

	/**
	 * 2.Thêm một Album vào ds,thêm thành công nếu kích thước mảng cho phép. 
	 */
	public boolean themAB(Album ab) {
		if (count < dsab.length) {
			dsab[count++] = ab;
			return true;
		}
		return false;
	}
	/**
	 * 3.Lấy toàn bộ thông tin Album có trong ds
	 */
	public String toString() {
		String s="";
		//s += " Ma_CD \t" + " Tua_CD\t" + "  So_Bai\t" + "Gia\n";
		for(int i = 0; i < count; i++) {
			s+= dsab[i] + "\n";
		}return s;
	}
	/**
	 * 4.Tính số lượng CD có trong ds.
	 */
	public int tinhSoLuong() {
		return count;
	}

	/**
	 * 5.Tính tổng giá thành của các CD.
	 */
	public double tinhTongGia() {
		double tongTien = 0;
		for (int i = 0; i < count; i++) {
			tongTien += dsab[i].getGiaThanh();
		}
		return tongTien;
	}

	/**
	 * 6.In Album có tổng giá thành cao nhất.
	 */
	public double timGiaCaoNhat() {
		double max = dsab[0].getGiaThanh();
		for (int i = 0; i < count; i++) {
			if (dsab[i].getGiaThanh() > max) {
				max = (int) dsab[i].getGiaThanh();
			}
		}
		return max;
	}

	/**
	 * 7.Lấy thông tin số Ablum có trên 10 bài hát.
	 */
	public String laySoAblumTren10BH() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsab[i].getSoBH() >= 10) {
				s += dsab[i] + "\n";
			}
		}
		if (!s.equals("")) {
			return s;
		}
		return "Khong co Album nao ten 10 Bai Hat";
	}
	/**
	 *  8.Tìm kiếm theo mã Album.Nếu tìm thấy thì thông báo "Tìm thấy" và ngược lại thông báo "Không tìm thấy". 
	 */
	public boolean timMa(int ma) {
		for(int i = 0 ;i < count; i++) {
			if(dsab[i].getMaAB()==ma) {
				System.out.println(dsab[i]);
				return true;
			}
		}return false;
	}
	/**
	public boolean timTua (String tua) {
		for (int i =0; i< count; i++) {
			if (dsab[i].equals(tua)) {
				return true;
				
			}
		}return false;
	}
	**/
	/**
	 * 9.Tìm kiếm theo tựa Album. Nếu tìm thấy trả về vị trí tìm thấy trong ds, nếu không tìm thấy trả về -1. 
	 */
	public int timViTriMa(int maVT) {
		for (int i = 0; i < count; i++) {
			if (dsab[i].getMaAB()==maVT) {
				System.out.println(dsab[i].toString());
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
				if (dsab[i].getGiaThanh() < dsab[j].getGiaThanh()) {
					Album temp = dsab[i];
					dsab[i] = dsab[j];
					dsab[j] = temp;
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
				if (dsab[i].getTuaAB().compareTo(dsab[j].getTuaAB()) > 0) {
					Album temp = dsab[i];
					dsab[i] = dsab[j];
					dsab[j] = temp;
				}
			}
		}
	}
	
}
