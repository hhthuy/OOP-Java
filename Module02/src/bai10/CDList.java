package bai10;

public class CDList {
	// Cac thuoc tinh
	private CD[] cds;
	private int count;// so CD

	// Cac phuong thuc
	/**
	 * Phuong thuc khoi tao n phan tu cho lop CDList
	 * 
	 * @param n
	 */
	public CDList(int n) {
		cds = new CD[n];
		count = 0;
	}

	/**
	 * Ham them mot CD vao danh sach
	 * 
	 * @param cd
	 * @return true neu them thanh cong
	 */
	public boolean themCD(CD cd) {
		if (count < cds.length) {
			cds[count++] = cd;
			return true;
		}
		return false;
	}

	/**
	 * Ham tinh so luong CD co trong danh sach
	 * 
	 * @return count
	 */
	public int tinhSoLuongCD() {
		return count;
	}

	/**
	 * Ham tinh tong gia thanh cua cac CD
	 * 
	 * @return tien
	 */
	public double tinhTongTien() {
		double tien = 0;
		for (int i = 0; i < count; i++)
			tien += cds[i].getGiaThanh();
		return tien;
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++) {
			s += cds[i].toString();
		}
		return s;
	}

	/**
	 * Ham tim kiem theo ma cua CD
	 * 
	 * @param ma la ma CD can tim
	 * @return true neu tim thay
	 */
	/**
	 * public boolean timMa(int ma) { for (int i = 0; i < count; i++) { if
	 * (cds[i].getMaCD() == ma) // ma neu String dung equal(){ return true; } return
	 * false; }
	 **/
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
	 * Ham sap xep danh sach giam dan theo gia thanh
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
	 * Ham sap xep danh sach tang dan theo tua
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
