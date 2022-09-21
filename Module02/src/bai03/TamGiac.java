package bai03;

/**
 * Bieu dien cho 1 Tam Giac. Voi ca thuoc tinh gom 3 canh ma, mb, mc.
 * 
 * @author HongThuy
 *
 */
public class TamGiac {
	// CAC THUOC TINH
	private int ma;
	private int mb;
	private int mc;

	// CAC PHUONG THUC
	/**
	 * Construct mac dinh cua lop Tam Giac
	 */
	public TamGiac() {

	}

	/**
	 * Neu gia tri truyen co so am hoac 3 gia tri khong lap thanh tam giac thi gan 3
	 * thuoc tinh bang 0
	 * 
	 * @param ma: la canh thu nhat cua tam giac
	 * @param mb: la canh thu hai cua tam giac
	 * @param mc: la canh thu ba cua tam giac
	 */
	public TamGiac(int ma, int mb, int mc) {
		if ((ma < 0) || (mb < 0) || (mc < 0)) {
			this.ma = this.mb = this.mc = 0;
		} else if ((ma >= mb + mc) || (mb >= ma + mc) || (mc >= ma + mb)) {
			this.ma = this.mb = this.mc = 0;
		} else {
			this.ma = ma;
			this.mb = mb;
			this.mc = mc;
		}
	}

	// Cac phuong thuc get/set
	public int getMa() {
		return ma;
	}

	/**
	 * Neu gia tri ma khong hop le(<0 hoac gia tri moi khong con tao thanh tam giac)
	 * thi khong gan gi ca
	 * 
	 * @return ma
	 */
	public void setMa(int ma) {
		if (ma < 0 || ma >= this.mb + this.mc || this.mb >= ma + this.mc || this.mc >= ma + this.mb)
			return;
		this.ma = ma;
	}

	// get/set cho canh mb
	public float getMb() {
		return mb;
	}

	/**
	 * Neu gia tri mb khong hop le(<0 hoac gia tri moi khong con tao thanh tam giac)
	 * thi khong gan gi ca
	 * 
	 * @param mb
	 */
	public void setMb(int mb) {
		if (mb < 0 || this.ma >= mb + this.mc || mb >= this.ma + this.mc || this.mc >= this.ma + mb)
			return;
		this.mb = mb;

	}

	// get/set cho canh mc
	public float getMc() {
		return mc;
	}

	/**
	 * Neu gia tri mc khong hop le(<0 hoac gia tri moi khong con tao thanh tam giac)
	 * thi khong gan gi ca
	 * 
	 * @param mc
	 */
	public void setMc(int mc) {
		if (mc < 0 || this.ma >= this.mb + mc || this.mb >= this.ma + mc || mc >= this.ma + this.mb)
			return;
		this.mc = mc;
	}

	// Phuong thuc tinh Chu Vi Tam Giac
	public float tinhChuVi() {
		return ma + mb + mc;
	}

	// Phuong thuc tinh Dien Tich Tam Giac
	public float tinhDienTich() {
		float P = (float) (ma + mb + mc) / 2;
		float S = (float) Math.sqrt(P * (P - ma) * (P - mb) * (P - mc));
		return S;
	}

	public String timTamGiac() {
		if (ma == 0)
			return "KHONG phai tam giac.";
		else if (this.ma == this.mb && this.ma == this.mc)
			return "Tam giac DEU";
		else if (this.ma == this.mb || this.ma == this.mc)
			return "Tam giac CAN";
		else
			return "Tam giac THUONG";
	}

	public static String tieude() {
		return String.format("| %-4s\t| %-4s\t| %-4s\t| %-6s\t| %-6s\t| %-20s\t|", "a", "b", "c", "ChuVi", "DienTich",
				"KieuTamGiac");
	}

	public String toString() {
		return String.format("| %-4d\t| %-4d\t| %-4d\t| %-6.2f\t| %-6.2f\t| %-20s\t|", this.ma, this.mb, this.mc,
				tinhChuVi(), tinhDienTich(), timTamGiac());
	}

}
