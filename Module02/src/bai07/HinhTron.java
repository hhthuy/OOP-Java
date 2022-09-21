package bai07;

/**
 * Bieu dien lop hinh tron
 * 
 * @author HongThuy
 *
 */
public class HinhTron {
	// Cac thuoc tinh
	private ToaDo tam;
	private double banKinh;

	// Cac phuong thuc get/set
	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	// Constructors mac dinh
	public HinhTron() {

	}

	// Contructors day du tham so
	public HinhTron(ToaDo tam, double banKinh) {
		setTam(tam);
		setBanKinh(banKinh);
	}

	// Tinh Chu Vi
	public double tinhChuVi() {
		return Math.PI * 2 * banKinh;
	}

	// Tinh Dien Tich
	public double tinhDienTich() {
		return Math.PI * banKinh * banKinh;
	}

	/**
	 * Ham toString cua lop HInh Tron
	 */
	public String toString() {
		return String.format("Dien Tich va Chu vi hinh tron tam " + tam + "co ban kinh la: %2.1f la %3.2f va %2.2f ",
				banKinh, tinhDienTich(), tinhChuVi());
	}
}
