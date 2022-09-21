package bai01;

public class DanhMucChuyenXe {
	private ChuyenXe[] dsChuyenXe;
	private int count;

	public DanhMucChuyenXe(int n) {
		dsChuyenXe = new ChuyenXe[n];
		count = 0;
	}

	public int getSoLuong() {
		return count;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += dsChuyenXe[i] + "\n";
		}
		return s;
	}

	public boolean themChuyenXe(ChuyenXe x) {
		if (count < dsChuyenXe.length) {
			dsChuyenXe[count++] = x;
			return true;
		}
		return false;
	}

	public String getChuyenXeNgoaiThanh() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsChuyenXe[i] instanceof ChuyenXeNgoaiThanh)
				s += dsChuyenXe[i] + "\n";
		}
		return s;
	}

	public String getChuyenXeNoiThanh() {
		String s = "";
		for (int i = 0; i < count; i++) {
			if (dsChuyenXe[i] instanceof ChuyenXeNoiThanh)
				s += dsChuyenXe[i] + "\n";
		}
		return s;
	}

	/**
	 * Tinh Tong Doanh Thu cho tat ca cac chuyen xe
	 */
	public void getTongDoanhThu() {
		double sum = 0;
		for (ChuyenXe xe : dsChuyenXe) {
			if (xe instanceof ChuyenXe)
				sum += xe.getDoanhThu();
		}
		System.out.println("Tong Doanh Thu Cho Tat Ca Chuyen Xe:" + sum);
	}

	/**
	 * Tinh Tong Doanh Thu cho Chuyen Xe Noi Thanh
	 */
	public void getTongDoanhThuNoiThanh() {
		double sum = 0;
		for (ChuyenXe xe : dsChuyenXe) {
			if (xe instanceof ChuyenXeNoiThanh)
				sum += xe.getDoanhThu();
		}
		System.out.println("Tong Doanh Thu Cho Chuyen Xe Noi Thanh:" + sum);
	}

	/**
	 * Tinh Tong Doanh Thu cho Chuyen Xe Ngoai Thanh
	 */
	public void getTongDoanhThuNgoaiThanh() {
		double sum = 0;
		for (ChuyenXe xe : dsChuyenXe) {
			if (xe instanceof ChuyenXeNgoaiThanh)
				sum += xe.getDoanhThu();
		}
		System.out.println("Tong Doanh Thu Cho Chuyen Xe Ngoai Thanh:" + sum);
	}
}
